import { SortingModel } from "../model/SortingModel.js";
import { BubbleSort } from "../model/BubbleSort.js";
import { InsertionSort } from "../model/InsertionSort.js";
import { QuickSort } from "../model/QuickSort.js";

export class SortingController {
    static async sortData(req, res) {
        const { numbers } = req.body;

        if (!Array.isArray(numbers) || numbers.some(isNaN)) {
            return res.status(400).json({ error: "Invalid input" });
        }

        const sortedNumbers = SortingController.selectSortStrategy(numbers);

        await SortingModel.saveSortedNumbers(sortedNumbers);

        res.json({ sortedNumbers });
    }

    static selectSortStrategy(numbers) {
        if (numbers.length < 30) {
            return BubbleSort.sort(numbers);
        } else if (numbers.length < 100) {
            return InsertionSort.sort(numbers);
        } else {
            return QuickSort.sort(numbers);
        }
    }
}
