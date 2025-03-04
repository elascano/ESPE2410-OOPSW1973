package ec.edu.espe.bankinterestrate.controller;

import ec.edu.espe.bankinterestrate.model.BankInterestRate;

/**
 *
 * @author Alan Arias
 */
public class BankInterestRateController {
    private BankInterestRate bankInterestRate;

    public BankInterestRateController(BankInterestRate bankInterestRate) {
        this.bankInterestRate = bankInterestRate;
    }

    public double calculateInterest() {
        double capital = bankInterestRate.getInitialCapital();
        double rate = bankInterestRate.getInteresRate();
        int time = bankInterestRate.getTime();
        return (capital * rate * time) / 100;
    }
    
}
