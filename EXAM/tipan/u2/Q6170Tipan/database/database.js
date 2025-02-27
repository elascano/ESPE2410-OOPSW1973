const mongoose = require("mongoose");


const mongoURL = "mongodb+srv://ltipan:ltipan@cluster0.lacr0.mongodb.net/familyDB?retryWrites=true&w=majority";


mongoose.connect(mongoURL, { useNewUrlParser: true, useUnifiedTopology: true })
  .then(() => {
    console.log("Conectado a MongoDB Atlas.");
  })
  .catch((err) => {
    console.error("Error conectando a MongoDB:", err);
  });


