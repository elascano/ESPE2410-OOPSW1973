const { MongoClient } = require('mongodb');
const readline = require('readline');

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

const uri = "mongodb+srv://HectorD:hTCvkRkfhXROZMYN@clusterdb.to0oy.mongodb.net/?retryWrites=true&w=majority&appName=ClusterDBñ";

async function main() {
    try {
        const client = new MongoClient(uri);
        await client.connect();
        
        while (true) {
            console.log("\n======== MENU ========");
            console.log("1. View existing databases");
            console.log("2. View existing collections");
            console.log("3. Create new database and collection");
            console.log("4. Delete database");
            console.log("5. Insert data into a collection");
            console.log("6. Exit");
            
            const option = await questionAsync("Select a number option: ");
            
            switch (option) {
                case "1":
                    await showDatabases(client);
                    break;
                case "2":
                    await showCollections(client);
                    break;
                case "3":
                    await createNewDatabase(client);
                    break;
                case "4":
                    await deleteDatabase(client);
                    break;
                case "5":
                    await insertData(client);
                    break;
                case "6":
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

async function showDatabases(client) {
    const dbs = await client.db().admin().listDatabases();
    console.log("\nExisting databases:");
    dbs.databases.forEach(db => {
        console.log(`- ${db.name}`);
    });
}

async function showCollections(client) {
    const dbName = await questionAsync("Database Name: ");
    const collections = await client.db(dbName).listCollections().toArray();
    console.log(`\nCollections in '${dbName}':`);
    collections.forEach(collection => {
        console.log(`- ${collection.name}`);
    });
}

async function createNewDatabase(client) {
    const dbName = await questionAsync("Name for the New Database: ");
    const collectionName = await questionAsync("Name for the New Collection: ");
    
    try {
        await client.db(dbName).createCollection(collectionName);
        console.log(`Database '${dbName}' and Collection '${collectionName}' created!`);
    } catch (error) {
        console.error("Error to create Database:", error);
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

async function insertData(client) {
    const dbName = await questionAsync("Database Name: ");
    const collectionName = await questionAsync("Collection Name: ");
    const numFields = parseInt(await questionAsync("Number of fields to insert: "));
    
    const document = {};
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

function questionAsync(question) {
    return new Promise((resolve) => {
        rl.question(question, resolve);
    });
}

main().catch(console.error);