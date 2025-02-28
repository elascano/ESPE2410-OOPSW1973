const mongoose = require('mongoose');


const uri = "mongodb+srv://usuario:contraseña@cluster0.mongodb.net/miBaseDeDatos";


mongoose.connect(uri, { useNewUrlParser: true, useUnifiedTopology: true })
    .then(() => console.log("✅ Conectado a MongoDB"))
    .catch(err => console.error("❌ Error de conexión:", err));

module.exports = mongoose;
