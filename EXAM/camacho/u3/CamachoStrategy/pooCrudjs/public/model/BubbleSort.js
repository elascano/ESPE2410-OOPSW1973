import  SortingStrategy from "./SortingStrategy.js"

export default class BubbleSort extends SortingStrategy{
    sort(data) {
        let n = data.length;
        let swapped;

        do {
            swapped = false;
            for (let i = 0; i < n - 1; i++) {
                if (data[i] > data[i + 1]) {
                    
                    [data[i], data[i + 1]] = [data[i + 1], data[i]];
                    swapped = true;
                }
            }
            n--;
        } while (swapped);

        return data;
    }
}

