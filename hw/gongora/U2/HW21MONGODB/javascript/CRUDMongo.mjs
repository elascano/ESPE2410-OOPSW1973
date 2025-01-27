import { MongoClient } from 'mongodb';

export class CRUDMongo {
    #uri;
    #dbname;
    #client;
    #database;

    constructor(uri, dbname) {
        this.#uri = uri;
        this.#dbname = dbname;
        this.#client = new MongoClient(this.#uri);
    }

    async connectDB() {
        try {
            await this.#client.connect();
            console.log(`Connected to database: ${this.#dbname}`);
            this.#database = this.#client.db(this.#dbname);
        } catch (error) {
            console.error("Can't connect to the database:", error);
            throw error;
        }
    }

    async insertData(collectionName, json) {
        if (!this.#database) {
            console.error('No database connection. Please connect to the database first.');
            return;
        }

        try {
            const collection = this.#database.collection(collectionName);
            const result = await collection.insertOne(json);
            console.log('Inserted document with ID:', result.insertedId);
        } catch (err) {
            console.error('Error: Data insertion failed', err);
        }
    }

    async findData(collectionName, query = {}) {
        if (!this.#database) {
            console.error('No database connection. Please connect to the database first.');
            return;
        }

        try {
            const collection = this.#database.collection(collectionName);
            const result = await collection.find(query).toArray();
            return result;
        } catch (err) {
            console.error('Error: Data retrieval failed', err);
        }
    }

    async updateData(collectionName, query, updateDoc) {
        if (!this.#database) {
            console.error('No database connection. Please connect to the database first.');
            return;
        }

        try {
            const collection = this.#database.collection(collectionName);
            const result = await collection.updateOne(query, { $set: updateDoc });
            if (result.matchedCount === 0) {
                console.log('No documents matched the query. No update made.');
            } else {
                console.log('Matched and updated documents:', result.modifiedCount);
            }
        } catch (err) {
            console.error('Error: Data update failed', err);
        }
    }

    async deleteData(collectionName, query) {
        if (!this.#database) {
            console.error('No database connection. Please connect to the database first.');
            return;
        }

        try {
            const collection = this.#database.collection(collectionName);
            const result = await collection.deleteOne(query);
            if (result.deletedCount === 0) {
                console.log('No documents matched the query. No deletion made.');
            } else {
                console.log('Deleted document count:', result.deletedCount);
            }
        } catch (err) {
            console.error('Error: Data deletion failed', err);
        }
    }

    async closeConnection() {
        try {
            await this.#client.close();
            console.log('Connection closed');
        } catch (err) {
            console.error('Error closing connection:', err);
        }
    }
}
