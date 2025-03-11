import { connectToDatabase } from "../utils/MongoDBManager.js";

export class SortingModel {
    static async saveSortedNumbers(numbers) {
        try {
            const db = await connectToDatabase();
            const collection = db.collection("sorted_numbers"); // Nombre de la colección

            // Convertir el array de números en una cadena separada por comas
            const document = {
                numbers: numbers.join(","), // "6,4,2,1,6,9,2"
                createdAt: new Date()
            };

            await collection.insertOne(document);
            console.log("Sorted numbers saved to database:", document);
        } catch (error) {
            console.error("Error saving to database:", error);
        }
    }
}
