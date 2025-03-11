export class BubbleSort {
    static sort(arr) {
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
