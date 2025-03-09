import express from 'express';
import { registerAnimal, getAnimals } from '../controller/AnimalController.js';

const router = express.Router();

router.post('/', registerAnimal);
router.get('/', getAnimals);

export default router;