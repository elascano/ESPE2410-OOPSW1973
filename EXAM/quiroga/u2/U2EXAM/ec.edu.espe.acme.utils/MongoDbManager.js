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

   
    
}