import mongoose from 'mongoose';

const animalSchema = new mongoose.Schema({
    type: { type: String, required: true },
    name: { type: String, required: true },
    weight: { type: Number, required: true },
    foodAmount: { type: Number, required: true }
});

export default mongoose.model('Animal', animalSchema);