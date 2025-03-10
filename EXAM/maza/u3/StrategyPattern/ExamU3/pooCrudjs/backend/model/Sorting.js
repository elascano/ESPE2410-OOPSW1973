const mongoose = require("mongoose")
const {config} = require("dotenv")
config();

const Sorting = new mongoose.Schema(
    {
        unsorted: String,
        size: Number,
        sortAlgorithm: String,
        sorted: String,

    },
    {
        collection: process.env.COLLECTION_NAME
    }
)

module.exports = mongoose.model("Sorting",Sorting)