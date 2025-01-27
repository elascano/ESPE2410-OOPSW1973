const { MongoClient } = require("mongodb");
const uri = "mongodb+srv://projas:projas@cluster0.ul8fh.mongodb.net/";
const client = new MongoClient(uri);

async function insertData() {
    try {
        await client.connect();

        console.log("Connected to MongoDB!");
        const database = client.db("homeworkjs");
        const collection = database.collection("usersjs");
        const student = {
            name: "patricio",
            age: 19,
            subject: "oop"
        };
        const result = await collection.insertOne(student);

        console.log(`Document inserted with _id: ${result.insertedId}`);
    } catch (error) {
        console.error("Error inserting data:", error);
    } finally {
        // Close the connection
        await client.close();
        console.log("Connection closed.");
    }
}

insertData();
