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
            let arr = req.body.numbers.split(",").map(Number);
            if (arr.length < 2) return res.status(400).send("Enter at least 2 numbers.");
            
            let strategy = this.getSortStrategy(arr);
            let sortedArr = strategy.sort(arr);
            await this.model.saveSortingResult(arr, strategy.constructor.name, sortedArr);
            
            res.json({
                unsorted: arr.join(", "),
                size: arr.length,
                "sort algorithm": strategy.constructor.name,
                sorted: sortedArr.join(", ")
            });
        } catch (error) {
            res.status(500).send(error.message);
        }
    }
}
module.exports = SortingController;
