const express = require("express");
const Book = require("../model/Book");

const router = express.Router();


const getBook = async (req, res, next) => {
    let book;
    const { id } = req.params;

    try {
        book = await Book.findOne({ id }); 
        if (!book) {
            return res.status(404).json({ message: "The book was not found" });
        }
    } catch (error) {
        return res.status(500).json({ message: error.message });
    }

    req.book = book; 
    next();
};


router.get("/", async (req, res) => {
    try {
        const books = await Book.find();
        if (books.length === 0) {
            return res.status(204).json({});
        }
        res.json(books);
    } catch (error) {
        res.status(500).json({ message: error.message });
    }
});


const regex = /^(19|20)\d{2}$/;


router.post("/", async (req, res) => {
    const { id, title, author, genre, yearOfPublication } = req.body;

    if (!(id && title && author && genre && yearOfPublication)) {
        return res.status(400).json({
            message: "You must submit the id, title, author, genre, and year of publication"
        });
    }

    if (!regex.test(yearOfPublication)) {
        return res.status(400).json({ message: "Must be a valid year" });
    }

    const book = new Book({ id, title, author, genre, yearOfPublication });

    try {
        const newBook = await book.save(); 
        res.status(201).json(newBook);
    } catch (error) {
        res.status(500).json({ message: error.message });
    }
});


router.get("/:id", getBook, (req, res) => {
    res.json(req.book);
});


router.put("/:id", getBook, async (req, res) => {
    try {
        const book = req.book;
        book.title = req.body.title || book.title;
        book.author = req.body.author || book.author;
        book.genre = req.body.genre || book.genre;
        book.yearOfPublication = req.body.yearOfPublication || book.yearOfPublication; 

        const updatedBook = await book.save();
        res.json(updatedBook);
    } catch (error) {
        res.status(400).json({ message: error.message });
    }
});


router.delete("/:id", getBook, async (req, res) => {
    try {
        await req.book.deleteOne(); 
        res.json({ message: `The book "${req.book.title}" was successfully eliminated` });
    } catch (error) {
        res.status(500).json({ message: error.message });
    }
});

module.exports = router;
