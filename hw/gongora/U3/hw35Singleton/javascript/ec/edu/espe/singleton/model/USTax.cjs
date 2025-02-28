class USTax {
    
    static #instance = null;

    
    constructor() {
        if (USTax.#instance) {
            throw new Error("Use USTax.getInstance() to get an instance.");
        }
    }

    
    static getInstance() {
        if (!USTax.#instance) {
            USTax.#instance = new USTax();
        }
        return USTax.#instance;
    }

    
    salesTotal(amount, taxRate) {
        const taxAmount = amount * taxRate;
        return amount + taxAmount;
    }
}

module.exports = USTax