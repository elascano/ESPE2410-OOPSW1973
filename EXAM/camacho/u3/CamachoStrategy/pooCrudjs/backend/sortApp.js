const express = require("express");
const mongoose = require("mongoose");
const cors = require("cors");
const bodyParser = require("body-parser");
const { config } = require("dotenv");
const routes = require("./controller/Routes");

config();

const app = express();
const port = process.env.PORT || 3004;

app.use(cors());
app.use(bodyParser.json());

mongoose.connect("mongodb+srv://0000mama:0000mama@cluster0.0nmcc.mongodb.net/?retryWrites=true&w=majority&appName=Cluster0", {
  dbName: "Sort",
});

const db = mongoose.connection;

app.use("/sortings", routes);

app.listen(port, () => {
  console.log(`Escuchando en el puerto ${port}`);
});
