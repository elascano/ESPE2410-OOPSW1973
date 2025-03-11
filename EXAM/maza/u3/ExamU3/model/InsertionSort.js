export class InsertionSort {
    static sort(arr) {
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
}
