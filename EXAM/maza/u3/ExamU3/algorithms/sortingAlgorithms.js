class SortingAlgorithms {
    static bubbleSort(arr) {
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

    static insertionSort(arr) {
        let sortedArr = [...arr];
        for (let i = 1; i < sortedArr.length; i++) {
            let key = sortedArr[i];
            let j = i - 1;
            while (j >= 0 && sortedArr[j] > key) {
                sortedArr[j + 1] = sortedArr[j];
                j = j - 1;
            }
            sortedArr[j + 1] = key;
        }
        return sortedArr;
    }

    static quickSort(arr) {
        if (arr.length <= 1) return arr;
        let pivot = arr[arr.length - 1];
        let left = arr.filter((el, i) => el <= pivot && i !== arr.length - 1);
        let right = arr.filter(el => el > pivot);
        return [...SortingAlgorithms.quickSort(left), pivot, ...SortingAlgorithms.quickSort(right)];
    }
}

module.exports = SortingAlgorithms;
