class SortingStrategy {
    sort(arr) { }
}

class BubbleSort extends SortingStrategy {
    sort(arr) {
        let sortedArr = [...arr];
        for (let i = 0; i < sortedArr.length - 1; i++) {
            for (let j = 0; j < sortedArr.length - i - 1; j++) {
                if (sortedArr[j] > sortedArr[j + 1]) {
                    [sortedArr[j], sortedArr[j + 1]] = [sortedArr[j + 1], sortedArr[j]];
                }
            }
        }
        return sortedArr;
    }
}

class InsertionSort extends SortingStrategy {
    sort(arr) {
        let sortedArr = [...arr];
        for (let i = 1; i < sortedArr.length; i++) {
            let key = sortedArr[i], j = i - 1;
            while (j >= 0 && sortedArr[j] > key) {
                sortedArr[j + 1] = sortedArr[j];
                j--;
            }
            sortedArr[j + 1] = key;
        }
        return sortedArr;
    }
}

class QuickSort extends SortingStrategy {
    sort(arr) {
        if (arr.length <= 1) return arr;
        let pivot = arr[0];
        let left = [];
        let right = [];
        for (let i = 1; i < arr.length; i++) {
            if (arr[i] < pivot) left.push(arr[i]);
            else right.push(arr[i]);
        }
        return [...this.sort(left), pivot, ...this.sort(right)];
    }
}
module.exports = { BubbleSort, InsertionSort, QuickSort };