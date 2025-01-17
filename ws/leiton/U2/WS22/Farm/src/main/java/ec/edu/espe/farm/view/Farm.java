package ec.edu.espe.farm.view;

import ec.edu.espe.farm.model.Donkey;
import ec.edu.espe.farm.model.FarmAnimal;
import ec.edu.espe.farm.model.FoodType;
import ec.edu.espe.farm.model.Pig;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Jose Leiton
 */
public class Farm {

    public static void main(String[] args) {
        FarmAnimal farmAnimal;
        boolean isProducingMeat = true;
        float weight = 80;
        int id = 1;
        String breed = "Pink";
        Date bornOnDate = new Date(2024, 10, 11);
        FoodType foodType = new FoodType();
        ArrayList<FoodType> foodTypes;
        foodTypes = new ArrayList<>();
        foodTypes.add(foodType);

        farmAnimal = new Pig(true, 0, 0, breed, bornOnDate, foodTypes);
        
        System.out.println("what is FarmAnimal now ->"+farmAnimal.getClass().getCanonicalName());

        System.out.println("farm animal IS A ->" + farmAnimal);
        farmAnimal.ageInMonths();
        

        weight = 200.0F;
        id = 2;
        breed = "Amiatina";
        bornOnDate = new Date(2000, 03, 11);
        foodTypes.add(foodType);

        farmAnimal = new Donkey(weight, id, breed, bornOnDate, foodTypes);
        System.out.println("What is farmAnimal now -->" + farmAnimal.getClass().getCanonicalName());
        
        System.out.println("farm Animal is a -->" + farmAnimal);
        
        Donkey donkey = new Donkey(weight, id, breed, bornOnDate, foodTypes);
        donkey.load("ESPE", "LAS CASAS");
        donkey.getLoadWeight();
        donkey.feed();
        donkey.produce();
        donkey.setLoadWeight(500);
        System.out.println("donkey -> "+ donkey);
        
    }
}
