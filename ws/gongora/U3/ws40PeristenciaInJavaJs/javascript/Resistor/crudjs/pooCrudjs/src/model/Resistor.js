const mongoose = require("mongoose")

const Resistor = new mongoose.Schema(
    {
        id: String,
        description: String,
        value: Number,
        tolerance: Number

    },
    {
        collection: "resistors"
    }
)

module.exports = mongoose.model("Resistor",Resistor)