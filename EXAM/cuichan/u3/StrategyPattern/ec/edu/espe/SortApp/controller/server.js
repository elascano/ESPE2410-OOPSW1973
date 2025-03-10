const express = require("express");
const mongoose = require("mongoose");
const cors = require("cors");
const bodyParser = require("body-parser");

const mongoURI = "mongodb+srv://HectorD:hTCvkRkfhXROZMYN@clusterdb.to0oy.mongodb.net/?retryWrites=true&w=majority&appName=ClusterDB";

mongoose.connect(mongoURI, {
    useNewUrlParser: true,
    useUnifiedTopology: true
}).then(() => console.log("Conected to MongoDB"))
  .catch(err => console.error("Error to conect MongoDB:", err));

const SortedArraySchema = new mongoose.Schema({
    numbers: [Number]
}, { collection: "Sort" });

const SortedArray = mongoose.model("SortedArray", SortedArraySchema);


const app = express();
app.use(cors());
app.use(bodyParser.json());

app.post("/save", async (req, res) => {
    try {
        const { numbers } = req.body;
        const sortedData = new SortedArray({ numbers });
        await sortedData.save();
        res.json({ message: "Data saved", sortedArray: numbers });
    } catch (error) {
        res.status(500).json({ error: "Error to save data" });
    }
});


const PORT = 3006;
app.listen(PORT, () => console.log(`http://localhost:${PORT}`));

