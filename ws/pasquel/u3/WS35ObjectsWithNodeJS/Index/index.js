// Marlon's port 3013
const port = 3013;
const express = require("express");
const app = express();
const mongoose = require("mongoose");

// Connect to MongoDB Atlas
mongoose.connect(
  `mongodb+srv://oop:oop@cluster0.9knxc.mongodb.net/oop?retryWrites=true&w=majority&appName=Cluster0`,
  { useNewUrlParser: true, useUnifiedTopology: true }
);

// Database connection handling
const db = mongoose.connection;
db.on("error", (error) => console.error("Error connecting to MongoDB:", error));  // Fixed this line
db.once("open", () => console.log("System connected to MongoDB Database"));

// Middleware to parse JSON
app.use(express.json());

// Import and use routes
const customerRouter = require("./routes/customerRoutes");
app.use("/computerstore", customerRouter);  // This will prefix your routes with /computerstore

// Start server
app.listen(port, () => {
  console.log("Marlon´s Computer Store Server is running on port -->", port);
});
