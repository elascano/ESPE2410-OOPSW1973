const express = require("express");
const bodyParser = require("body-parser");
const SortingController = require("./controllers/SortingController");
const app = express();
const port = 5000;  


app.use(bodyParser.urlencoded({ extended: true }));
app.use(bodyParser.json());


app.use(express.static("views"));  

const controller = new SortingController();
console.log(SortingController);

app.post("/sort", (req, res) => controller.handleSort(req, res));


app.get("/", (req, res) => {
    res.sendFile(__dirname + "/views/index.html");  
});


app.listen(port, () => console.log(`Server running on http://localhost:${port}`));
