import { MongoClient } from "mongodb";

const uri = "mongodb+srv://camilabohorquez:camilabohorquez@cluster0.6u5fl.mongodb.net/?retryWrites=true&w=majority&appName=Cluster0"; 
const client = new MongoClient(uri);

async function saveToDatabase(unsorted, size, algorithm, sorted) {
    try {
        await client.connect();
        const db = client.db("strategyLastName");
        const collection = db.collection("arrayFirstName");

        await collection.insertOne({
            unsorted: unsorted.join(", "),
            size,
            "sort algorithm": algorithm,
            sorted: sorted.join(", ")
        });

        console.log("Data saved successfully!");
    } catch (error) {
        console.error("Error saving to database:", error);
    } finally {
        await client.close();
    }
}

export { saveToDatabase };
