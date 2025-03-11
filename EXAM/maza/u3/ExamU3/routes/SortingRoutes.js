import express from "express";
import { SortingController } from "../controller/sortingController.js";

const router = express.Router();

router.post("/sort", SortingController.sortData);

export default router;
