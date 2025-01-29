
import { connectToDatabase } from "../utils/MongoDBManager.js"

export async function getParkById(id) {
    try {
        const db = await connectToDatabase();
        const parkCollection = db.collection("parks")
        return await parkCollection.findOne({ _id: id })
    } catch (error) {
        console.error("Error in getParkById:", error)
        throw error;
    }
}
