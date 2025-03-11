import  SortingStrategy from "./SortingStrategy.js"

export default class QuickSort extends SortingStrategy { 
    sort(data) {
        let n = data.length;
        for (let i = 1; i < n; i++) {
            let key = data[i];
            let j = i - 1;

            
            while (j >= 0 && data[j] > key) {
                data[j + 1] = data[j];
                j--;
            }

            
            data[j + 1] = key;
        }
        return data;
    }
}


