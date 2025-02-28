package ec.edu.espe.interestrate.model;


public class Investment {
    private double amount;
    private int id;
    private double interestRate;
    private int time;
    private double gain;
    private double total;

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public double getGain() {
        return gain;
    }

    public void setGain(double gain) {
        this.gain = gain;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    
    public Investment(double amount, int id, double interestRate, int time, double gain, double total) {
        this.amount = amount;
        this.id = id;
        this.interestRate = interestRate;
        this.time = time;
        this.gain = gain;
        this.total = total;
    }

    @Override
    public String toString() {
        return "Investment{" + "amount=" + amount + ", id=" + id + ", interestRate=" + interestRate + ", time=" + time + ", gain=" + gain + ", total=" + total + '}';
    }
    
    }

