package ec.espe.edu.condomanage.model;

public class ParkingSpace {
    private String budgetID;
    private int year;
    private Double totalFeeCollected;
    private Double maintenceFund;
    private Double monthlyFee;
    private Double balance;
    private String description;

    // Constructor vacío
    public ParkingSpace() {
    }

    // Constructor con parámetros
    public ParkingSpace(String budgetID, int year, Double totalFeeCollected, Double maintenceFund,
                        Double monthlyFee, Double balance, String description) {
        this.budgetID = budgetID;
        this.year = year;
        this.totalFeeCollected = totalFeeCollected;
        this.maintenceFund = maintenceFund;
        this.monthlyFee = monthlyFee;
        this.balance = balance;
        this.description = description;
    }

    // Métodos getter y setter
    public String getBudgetID() {
        return budgetID;
    }

    public void setBudgetID(String budgetID) {
        this.budgetID = budgetID;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Double getTotalFeeCollected() {
        return totalFeeCollected;
    }

    public void setTotalFeeCollected(Double totalFeeCollected) {
        this.totalFeeCollected = totalFeeCollected;
    }

    public Double getMaintenceFund() {
        return maintenceFund;
    }

    public void setMaintenceFund(Double maintenceFund) {
        this.maintenceFund = maintenceFund;
    }

    public Double getMonthlyFee() {
        return monthlyFee;
    }

    public void setMonthlyFee(Double monthlyFee) {
        this.monthlyFee = monthlyFee;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "ParkingSpace{" +
               "budgetID='" + budgetID + '\'' +
               ", year=" + year +
               ", totalFeeCollected=" + totalFeeCollected +
               ", maintenceFund=" + maintenceFund +
               ", monthlyFee=" + monthlyFee +
               ", balance=" + balance +
               ", description='" + description + '\'' +
               '}';
    }
}
