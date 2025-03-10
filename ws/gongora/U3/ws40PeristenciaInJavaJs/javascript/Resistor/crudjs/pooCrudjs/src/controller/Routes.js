const express = require("express");
const Resistor = require("../model/Resistor");

const router = express.Router();



router.get("/", async (req, res) => {
    try {
        const resistors = await Resistor.find();
        if (resistors.length === 0) {
            return res.status(204).json({});
        }
        res.json(resistors);
    } catch (error) {
        res.status(500).json({ message: error.message });
    }
});



module.exports = router;
