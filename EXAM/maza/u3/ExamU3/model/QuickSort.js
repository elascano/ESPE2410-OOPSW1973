export class QuickSort {
    static sort(arr) {
        if (arr.length <= 1) return arr;
        let pivot = arr[arr.length - 1];
        let left = arr.filter((el, i) => el <= pivot && i !== arr.length - 1);
        let right = arr.filter(el => el > pivot);
        return [...QuickSort.sort(left), pivot, ...QuickSort.sort(right)];
    }
}
