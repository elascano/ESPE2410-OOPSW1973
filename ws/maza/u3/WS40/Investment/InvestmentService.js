const { MongoClient } = require('mongodb');

class InvestmentService {
    constructor() {
        this.uri = "mongodb+srv://jmaza:jmaza@cluster0.y11rj.mongodb.net/?retryWrites=true&w=majority&appName=Cluster0";
        this.client = new MongoClient(this.uri);
        this.databaseName = "Investment"; 
        this.collectionName = "inversiones";
    }

    async connect() {
        if (!this.client.topology || !this.client.topology.isConnected()) {
            await this.client.connect();
        }
        return this.client.db(this.databaseName).collection(this.collectionName);
    }

    async getInvestments() {
        try {
            const collection = await this.connect();
            return await collection.find().toArray();
        } catch (error) {
            console.error("Error retrieving investments:", error);
            return [];
        }
    }

    calculateEarnings(investment) {
        const amount = parseFloat(investment.monto);
        const rate = 7.6 / 100;
        const time = parseInt(investment.tiempo);
        const earnings = amount * rate * time;
        const total = amount + earnings;

        return { ...investment, earnings: earnings.toFixed(2), total: total.toFixed(2) };
    }
}

module.exports = InvestmentService;
