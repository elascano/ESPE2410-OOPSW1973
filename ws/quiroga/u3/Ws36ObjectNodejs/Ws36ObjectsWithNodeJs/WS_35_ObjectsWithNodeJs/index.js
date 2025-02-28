const port = 3018;
const express = require("express");
const app = express();
const mongoose = require("mongoose");

mongoose.connect(`mongodb+srv://oop:oop@cluster0.9knxc.mongodb.net/oop?retryWrites=true&w=majority&appName=Cluster0`, { useNewUrlParser: true });
const db = mongoose.connection;

db.on("error", (error)=> crossOriginIsolated.error(error));
db.once("open", () => console.log("Sysem connected to MongoDB DataBase"));

app.use(express.json());
const customerRouter = require("./routes/customerRoutes");
app.use("/computerstore", customerRouter);
app.listen(port, () => console.log("Esteban´s Computers Store Server is running on port --> "+ port));
