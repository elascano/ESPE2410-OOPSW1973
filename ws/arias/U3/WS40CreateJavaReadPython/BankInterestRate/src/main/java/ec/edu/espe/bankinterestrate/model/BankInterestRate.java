package ec.edu.espe.bankinterestrate.model;

/**
 *
 * @author Alan Arias
 */
public class BankInterestRate {
    private float initialCapital;
    private int interesRate;
    private int time;

    public BankInterestRate(float initialCapital, int interesRate, int time) {
        this.initialCapital = initialCapital;
        this.interesRate = interesRate;
        this.time = time;
    }
    
    /**
     * @return the initialCapital
     */
    public float getInitialCapital() {
        return initialCapital;
    }

    /**
     * @param initialCapital the initialCapital to set
     */
    public void setInitialCapital(float initialCapital) {
        this.initialCapital = initialCapital;
    }

    /**
     * @return the interesRate
     */
    public int getInteresRate() {
        return interesRate;
    }

    /**
     * @param interesRate the interesRate to set
     */
    public void setInteresRate(int interesRate) {
        this.interesRate = interesRate;
    }

    /**
     * @return the time
     */
    public int getTime() {
        return time;
    }

    /**
     * @param time the time to set
     */
    public void setTime(int time) {
        this.time = time;
    }
    
}
