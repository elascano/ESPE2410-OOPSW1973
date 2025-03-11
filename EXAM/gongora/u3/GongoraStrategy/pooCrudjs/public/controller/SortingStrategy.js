export default class SortingStrategy {
    constructor(){
        if(new.target === SortingStrategy){
            throw new Error("the class cannot be instantiated")
        }
    }
    sort(data) {
        throw new Error("The method 'sort' must be implemented in the subclass");
    }
}


