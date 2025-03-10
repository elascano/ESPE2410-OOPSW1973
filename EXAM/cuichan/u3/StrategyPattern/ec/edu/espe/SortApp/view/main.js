import BubbleSort from '../model/BubbleSort.js';
import QuickSort from '../model/QuickSort.js';
import InsertionSort from '../model/InsertionSort.js';
import SortingStrategy from '../controller/SortingStrategy.js';

document.getElementById('sortButton').addEventListener('click', function() {
    const input = document.getElementById('arrayInput').value;
    const arr = input.split(',').map(Number);

    const strategy = new SortingStrategy();

    if (arr.length < 2) {
        alert("The array must contain more than 1 element");
        return;
    } else if (arr.length <= 5) {
        strategy.setStrategy(new BubbleSort());
    } else if (arr.length <= 10) {
        strategy.setStrategy(new InsertionSort());
    } else {
        strategy.setStrategy(new QuickSort());
    }

    const sortedArr = strategy.sort(arr);
    document.getElementById('sortedArray').innerText = sortedArr.join(', ');
});