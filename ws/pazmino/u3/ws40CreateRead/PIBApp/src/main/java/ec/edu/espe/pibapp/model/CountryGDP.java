package ec.edu.espe.pibapp.model;

/**
 *
 * @author Brandon Pazmino 
 */
public class CountryGDP {
    
    private String countryName;
    private double gdpPerCapita;

    public CountryGDP(String countryName, double gdpPerCapita) {
        this.countryName = countryName;
        this.gdpPerCapita = gdpPerCapita;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public double getGdpPerCapita() {
        return gdpPerCapita;
    }

    public void setGdpPerCapita(double gdpPerCapita) {
        this.gdpPerCapita = gdpPerCapita;
    }
}

