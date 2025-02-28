<<<<<<< HEAD
const FamilyModel = require("../models/FamilyModel"); 
const addFamily = async (familyData) => {
  try {
    const family = new FamilyModel(familyData);
    await family.save(); 
  } catch (error) {
    throw new Error("Error al agregar familia: " + error.message);
  }
};

const getFamilies = async () => {
  try {
    const families = await FamilyModel.find(); 
    return families;
  } catch (error) {
    throw new Error("Error al obtener familias: " + error.message);
  }
};

module.exports = { addFamily, getFamilies };

=======
const FamilyModel = require("../models/FamilyModel"); 
const addFamily = async (familyData) => {
  try {
    const family = new FamilyModel(familyData);
    await family.save(); 
  } catch (error) {
    throw new Error("Error al agregar familia: " + error.message);
  }
};

const getFamilies = async () => {
  try {
    const families = await FamilyModel.find(); 
    return families;
  } catch (error) {
    throw new Error("Error al obtener familias: " + error.message);
  }
};

module.exports = { addFamily, getFamilies };

>>>>>>> d51cd0def6d5d8cb8c771a77567836ee1c185734
