const express = require('express');
const InvestmentService = require('./InvestmentService');
const generateHTML = require('./GenerateHTML');

const app = express();
const port = 3000;
const investmentService = new InvestmentService();

app.get('/investments', async (req, res) => {
    try {
        const investments = await investmentService.getInvestments();
        const calculatedInvestments = investments.map(inv => investmentService.calculateEarnings(inv));
        const html = generateHTML(calculatedInvestments);
        res.send(html);
    } catch (error) {
        res.status(500).send("Error retrieving investments: " + error);
    }
});

app.listen(port, () => {
    console.log(`Server running at http://localhost:${port}/investments`);
});
