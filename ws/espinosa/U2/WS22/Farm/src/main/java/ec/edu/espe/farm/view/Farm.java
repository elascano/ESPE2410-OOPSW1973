package ec.edu.espe.farm.view;

import ec.edu.espe.farm.model.Donkey;
import ec.edu.espe.farm.model.FarmAnimal;
import ec.edu.espe.farm.model.Pig;
import ec.edu.espe.farm.model.FoodType;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Andrés Espinosa
 */
public class Farm {
    public static void main(String[] args) {
        FarmAnimal farmAnimal;
        
        boolean isProducingMeat = true;
        int id = 2;
        String breed = "pink";
        float weight = 0.5F;
        Date bornOnDate = new Date(2020,4, 4);
        FoodType foodType = new FoodType();
        ArrayList<FoodType> foodTypes;
        foodTypes = new ArrayList<>();
        foodTypes.add(foodType);
        
        
        farmAnimal = new Pig(isProducingMeat, 0, 0, breed, bornOnDate, foodTypes);
        System.out.println("What farm animal is -->" + farmAnimal.getClass());
        
        System.out.println("form Animal --Z" + farmAnimal);
        farmAnimal.getAgeinMonts();
        
        weight = 200.0F;
        id = 2;
        breed = "Amiatina";
        bornOnDate = new Date(2019, 11, 41);
        foodTypes.add(foodType);
        
        farmAnimal = new Donkey(weight, id, breed, bornOnDate, foodTypes);
        System.out.println("What farm animal is -->" + farmAnimal.getClass());
        
        System.out.println("farm animal -->" + farmAnimal);
        
        Donkey donkey = new Donkey(weight, id, breed, bornOnDate, foodTypes);
        donkey.load("Espe", "Conocoto");
        
        
    }
}
