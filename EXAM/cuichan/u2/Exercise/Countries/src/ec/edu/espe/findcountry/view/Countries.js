const { MongoClient } = require('mongodb');
const readline = require('readline');

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

const url = "mongodb+srv://HectorD:hTCvkRkfhXROZMYN@clusterdb.to0oy.mongodb.net/retryWrites=true&w=majority&appName=ClusterDB";

async function main() {
    try {
        const client = new MongoClient(url);
        await client.connect();
        
        while (true) {
            console.log("\n======== COUNTRIES MANAGEMENT SYSTEM ========");
            console.log("1. Insert country data");
            console.log("2. Search countries");
            console.log("3. Delete database");
            console.log("4. Exit");
            
            const option = await questionAsync("Select a number option: ");
            
            switch (option) {
                
                case "1":
                    await insertCountry(client);
                    break;
                case "2":
                    await searchCountries(client);
                    break;
                case "3":
                    await deleteDatabase(client);
                    break;
                case "4":
                    console.log("¡Good Bye!");
                    await client.close();
                    rl.close();
                    return;
                default:
                    console.log("Invalid option!!");
            }
        }
    } catch (error) {
        console.error("Connection error:", error);
    }
}


async function insertCountry(client) {
    const dbName = await questionAsync("Database Name: ");
    const collectionName = await questionAsync("Collection Name: ");
    
    const document = {};
    const numFields = parseInt(await questionAsync("Number of fields to insert: "));
    
    for (let i = 0; i < numFields; i++) {
        const fieldName = await questionAsync(`Field name ${i + 1}: `);
        const fieldValue = await questionAsync(`Value for ${fieldName}: `);
        document[fieldName] = fieldValue;
    }
    
    try {
        await client.db(dbName).collection(collectionName).insertOne(document);
        console.log("Data inserted successfully!");
    } catch (error) {
        console.error("Error inserting data:", error);
    }
}

async function searchCountries(client) {
    const dbName = await questionAsync("Database Name: ");
    const collectionName = await questionAsync("Collection Name: ");

    try {
        const results = await client.db(dbName).collection(collectionName).find().toArray();

        if (results.length === 0) {
            console.log("\nNo data found.");
        } else {
            console.log("\nCollection Data:");
            results.forEach(doc => {
                const { _id, ...rest } = doc; // Excluir el campo _id
                console.log("------------------------");
                Object.entries(rest).forEach(([key, value]) => {
                    console.log(`${key}: ${value}`);
                });
            });
        }
    } catch (error) {
        console.error("Error retrieving data:", error);
    }
}

async function deleteDatabase(client) {
    const dbName = await questionAsync("Name of the database to delete: ");
    try {
        await client.db(dbName).dropDatabase();
        console.log(`Database '${dbName}' deleted!`);
    } catch (error) {
        console.error("Error deleting database:", error);
    }
}

function questionAsync(question) {
    return new Promise((resolve) => {
        rl.question(question, resolve);
    });
}

main().catch(console.error);