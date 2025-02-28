
package ec.edu.espe.terrain.controller;

import ec.edu.espe.terrain.model.SquareMeterPrice;
import ec.edu.espe.terrain.model.Terrain;

/**
 *
 * @author LABS-DCCO
 */
    public class TerrainPriceController {

    public static void calculatePrice(Terrain terrain) {
        SquareMeterPrice priceSingleton = SquareMeterPrice.getInstance();
        float totalPrice = terrain.getSquareMeters() * priceSingleton.getPricePerSquareMeter();
        terrain.setTotalPrice(totalPrice);
    }
}

