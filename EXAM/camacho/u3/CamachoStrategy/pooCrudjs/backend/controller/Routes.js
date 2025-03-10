const express = require("express");
const Sorting = require("../model/Sorting");

const router = express.Router();


const regex = /^\d+(,\d+)+$/;


router.post("/", async (req, res) => {
    const { unsorted, size, sortAlgorithm, sorted} = req.body;

    if (!(unsorted && size && sortAlgorithm && sorted)) {
        return res.status(400).json({
            message: "You must submit the unsorted, size, sortAlgorithm, sorted"
        });
    }

    if (!(regex.test(unsorted) && regex.test(sorted))) {
        return res.status(400).json({ message: "Must be a valid array" });
    }

    const sorting = new Sorting({ unsorted, size, sortAlgorithm, sorted});

    try {
        const newSorting = await sorting.save(); 
        res.status(201).json(newSorting);
    } catch (error) {
        res.status(500).json({ message: error.message });
    }
});



module.exports = router;
