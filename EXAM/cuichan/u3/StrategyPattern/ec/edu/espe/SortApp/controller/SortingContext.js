import BubbleSort from './BubbleSort.js';
import QuickSort from './QuickSort.js';
import InsertionSort from './InsertionSort.js';

class SortingContext {

    Sorting
    constructor() {
        this.strategy = null;
    }

    setStrategy(strategy) {
        this.strategy = strategy;
    }

    sort(arr) {
        if (!this.strategy) {
            throw new Error('No sorting strategy set');
        }
        return this.strategy.sort(arr);
    }
}

export default SortingContext;