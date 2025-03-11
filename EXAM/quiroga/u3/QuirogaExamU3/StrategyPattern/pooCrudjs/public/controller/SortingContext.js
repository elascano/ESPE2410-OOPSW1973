
import BubbleSort from "../model/BubbleSort.js";
import InsertionSort from "../model/InsertionSort.js";
import  QuickSort from "../model/QuickSort.js";

export default class SortingContext {
    constructor() {
        this.ss = null; 
    }

    sort(data) {
        const size = data.length;
        const {sorting, sortAlgorithm} = this.setSortStrategy(size);
        const arraySorted = sorting.sort(data);
        return {arraySorted, sortAlgorithm };
    }

    setSortStrategy(size) {
        if (size > 2 && size < 5) {
            console.log("Using Bubble sort");
            return {sorting:new BubbleSort(), sortAlgorithm: "BubbleSort"};
        } else if (size >= 6 && size < 10) {
            console.log("Using Insertion sort");
            return {sorting:new InsertionSort(), sortAlgorithm: "InsertionSort"};
        } else {
            console.log("Using Quick sort");
            return {sorting:new QuickSort(), sortAlgorithm: "QuickSort"};
        }
    }
}
