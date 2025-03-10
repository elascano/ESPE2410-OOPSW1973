import SortContext from "../model/SortContext.js";
import BubbleSort from "../model/BubbleSort.js";
import InsertionSort from "../model/InsertionSort.js";
import QuickSort from "../model/QuickSort.js";
import { saveToDatabase } from "./DatabaseConnection.js";

class SortingController {
    constructor() {
        this.context = new SortContext();
    }

    sortArray(input) {
        let numbers = input.split(",").map(num => parseInt(num.trim(), 10));
        
        if (numbers.length < 2) {
            console.log("El arreglo debe tener al menos 2 elementos.");
            return;
        }

        let algorithm;
        if (numbers.length <= 5) {
            this.context.setStrategy(new BubbleSort());
            algorithm = "BubbleSort";
        } else if (numbers.length <= 10) {
            this.context.setStrategy(new InsertionSort());
            algorithm = "InsertionSort";
        } else {
            this.context.setStrategy(new QuickSort());
            algorithm = "QuickSort";
        }

        let sortedArray = this.context.executeStrategy(numbers);
        console.log(`Ordenado: ${sortedArray.join(", ")}`);

        saveToDatabase(numbers, numbers.length, algorithm, sortedArray);
    }
}

export default SortingController;
