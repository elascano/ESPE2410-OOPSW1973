const SortingModel = require("../models/SortingModel");
const { BubbleSort, InsertionSort, QuickSort } = require("../models/SortingStrategy");

class SortingController {
    constructor() {
        this.model = new SortingModel();
    }
    
    getSortStrategy(arr) {
        if (arr.length >= 2 && arr.length <= 5) return new BubbleSort();
        if (arr.length >= 6 && arr.length <= 10) return new InsertionSort();
        if (arr.length > 10) return new QuickSort();
        throw new Error("Array must have at least 2 elements.");
    }
    
    async handleSort(req, res) {
        try {
            console.log("Received data:", req.body.numbers);  // Log de la entrada
            let arr = req.body.numbers.split(",").map(Number);
            console.log("Parsed numbers:", arr);  // Log de los números parseados

            if (arr.length < 2) {
                return res.status(400).send("Enter at least 2 numbers.");
            }

            let strategy = this.getSortStrategy(arr);
            console.log("Sorting strategy:", strategy.constructor.name);  // Log de la estrategia de ordenación

            let sortedArr = strategy.sort(arr);
            console.log("Sorted array:", sortedArr);  // Log del array ordenado

            // Guarda el resultado de la ordenación (opcional)
            await this.model.saveSortingResult(arr, strategy.constructor.name, sortedArr);

            res.json({
                unsorted: arr.join(", "),
                size: arr.length,
                "sort algorithm": strategy.constructor.name,
                sorted: sortedArr.join(", ")
            });
        } catch (error) {
            console.error("Error in sorting:", error);  // Log del error
            res.status(500).send("Internal Server Error");
        }
    }
}

module.exports = SortingController;
