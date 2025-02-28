
const BubbleSort = require("../model/BubbleSort.cjs");
const InsertionSort = require("../model/InsertionSort.cjs");
const QuickSort = require("../model/QuickSort.cjs");

class ChoosingSorting {
    constructor() {
        this.ss = null; 
    }

    sort(data) {
        const size = data.length;
        this.ss = this.setSortStrategy(size);
        return this.ss.sort(data);
    }

    setSortStrategy(size) {
        if (size > 0 && size < 30) {
            console.log("Using Bubble sort");
            return new BubbleSort();
        } else if (size >= 30 && size < 100) {
            console.log("Using Insertion sort");
            return new InsertionSort();
        } else {
            console.log("Using Quick sort");
            return new QuickSort();
        }
    }
}

module.exports = ChoosingSorting