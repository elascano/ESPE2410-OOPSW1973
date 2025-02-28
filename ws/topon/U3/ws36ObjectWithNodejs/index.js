// Andrés´s port 3021
const port = 3021;
const express = require("express");
const app = express();
const mongoose = require("mongoose");
mongoose.connect(`mongodb+srv://oop:oop@cluster0.9knxc.mongodb.net/oop?retryWrites=true&W=majority&appName=Cluster0`,
{userNewUrlParsel: true});

const db = mongoose.connection;
db.on("error", (error) => crossOriginIsolated.error(error));
db.once("open", () => console.log("System connected to MongoDB Database"));
app.use(express.json());
const costumersRouter = require("./routes/customerRoutes")
app.use("/computestore", costumersRouter);
app.listen(port, () => console.log("Andres´s Compute Store Server is Running on port -->" + port));