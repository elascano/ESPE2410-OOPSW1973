const mongoose = require("mongoose")

const Book = new mongoose.Schema(
    {
        id: String,
        title: String,
        author: String,
        genre: String,
        yearOfPublication: String

    },
    {
        collection: "books"
    }
)

module.exports = mongoose.model("Book",Book)