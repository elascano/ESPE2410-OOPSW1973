class SortContext {
    constructor() {
        this.strategy = null;
    }

    setStrategy(strategy) {
        this.strategy = strategy;
    }

    executeStrategy(array) {
        if (!this.strategy) {
            throw new Error("Sorting strategy not set.");
        }
        return this.strategy.sort(array);
    }
}

export default SortContext;
