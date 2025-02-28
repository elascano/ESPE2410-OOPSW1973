<<<<<<< HEAD
const mongoose = require("mongoose"); // Importa la conexión desde database.js

const familySchema = new mongoose.Schema({
  lastName: { type: String, required: true, trim: true },
  members: { type: Number, required: true, min: 1 },
  country: { type: String, required: true, trim: true },
  pets: { type: Boolean, required: true },
});


const FamilyModel = mongoose.model("Family", familySchema);

module.exports = FamilyModel;
=======
const mongoose = require("mongoose"); // Importa la conexión desde database.js

const familySchema = new mongoose.Schema({
  lastName: { type: String, required: true, trim: true },
  members: { type: Number, required: true, min: 1 },
  country: { type: String, required: true, trim: true },
  pets: { type: Boolean, required: true },
});


const FamilyModel = mongoose.model("Family", familySchema);

module.exports = FamilyModel;
>>>>>>> d51cd0def6d5d8cb8c771a77567836ee1c185734
