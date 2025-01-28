
import { MongoClient } from "mongodb";

const uri = "mongodb+srv://jmaza:jmaza@cluster0.y11rj.mongodb.net/?retryWrites=true&w=majority&appName=Cluster0";
const client = new MongoClient(uri);

export async function connectToDatabase() {
    try {
        await client.connect();
        console.log("Connected to MongoDB successfully");
        return client.db("parks");
    } catch (error) {
        console.error("Failed to connect to MongoDB:", error);
        throw error;
    }
}
