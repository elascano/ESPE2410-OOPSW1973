const express = require("express");
const customer = require("../models/customer");
const router = express.Router();

//get a costumers
router.get("/customers", async (req, res) => {
    try{
        const customer = await customer.find();
        res.json(customer);
    } catch (err) {
        res.status(500).json({message: err.message});
    }
});

module.exports = router;