<<<<<<< HEAD
const mongoose = require("mongoose");


const mongoURL = "mongodb+srv://ltipan:ltipan@cluster0.lacr0.mongodb.net/familyDB?retryWrites=true&w=majority";


mongoose.connect(mongoURL, { useNewUrlParser: true, useUnifiedTopology: true })
  .then(() => {
    console.log("Conectado a MongoDB Atlas.");
  })
  .catch((err) => {
    console.error("Error conectando a MongoDB:", err);
  });


=======
const mongoose = require("mongoose");


const mongoURL = "mongodb+srv://ltipan:ltipan@cluster0.lacr0.mongodb.net/familyDB?retryWrites=true&w=majority";


mongoose.connect(mongoURL, { useNewUrlParser: true, useUnifiedTopology: true })
  .then(() => {
    console.log("Conectado a MongoDB Atlas.");
  })
  .catch((err) => {
    console.error("Error conectando a MongoDB:", err);
  });


>>>>>>> d51cd0def6d5d8cb8c771a77567836ee1c185734
