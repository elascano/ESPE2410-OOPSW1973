
const ChoosingSorting = require("../controller/ChoosingSorting.cjs");

const main= () =>{
        const data = [3, 6, 4, 6, 7, 8, 5, 6, 7, 5, 3, 3];

        console.log("Original array:", data);

        const sc = new ChoosingSorting();
        const sortedList = sc.sort([...data]);

        console.log("Sorted array:", sortedList);
    }


main();
