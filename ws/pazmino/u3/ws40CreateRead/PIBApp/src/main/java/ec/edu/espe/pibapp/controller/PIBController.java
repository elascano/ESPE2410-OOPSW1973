package ec.edu.espe.pibapp.controller;

import ec.edu.espe.pibapp.model.CountryGDP;
import utils.MongoDBConnection;

/**
 *
 * @author Brandon Pazmino
 */
public class PIBController {


    public static boolean addCountryGDP(String countryName, double gdpPerCapita) {
        
        if (countryName == null || countryName.trim().isEmpty()) {
            System.out.println("Error: El nombre del país no puede estar vacío.");
            return false; 
        }

        if (gdpPerCapita <= 0) {
            System.out.println("Error: El PIB per cápita debe ser mayor que cero.");
            return false; 
        }

   
        CountryGDP countryGDP = new CountryGDP(countryName, gdpPerCapita);


        try {
            return MongoDBConnection.add(countryGDP);
        } catch (Exception e) {
            System.out.println("Error al guardar el PIB de " + countryName + ": " + e.getMessage());
            return false;
        }
    }
}
