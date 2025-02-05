package ec.edu.espe.farm.view;

import ec.edu.espe.farm.model.Donkey;
import ec.edu.espe.farm.model.FarmAnimal;
import ec.edu.espe.farm.model.FoodType;
import ec.edu.espe.farm.model.Pig;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Andrés Sandoval
 */
public class Farm {
    
    public static void main(String[] args){
        FarmAnimal farmAnimal;
        boolean idProducingMeat=true;
        float weight=80.3F;
        int id = 1;
        String breed = "Pink";
        Date bornOnDate = new Date(2024, 10, 11);
        FoodType foodType = new FoodType();
        ArrayList<FoodType> foodTypes;
        foodTypes = new ArrayList<>();
        foodTypes.add(foodType);
        farmAnimal = new Pig(true, 0, 0, breed, bornOnDate, foodTypes);
        System.out.println("Whats is FarmAnimal now --> " + farmAnimal.getClass().getCanonicalName());
        
        System.out.println("Farm Animal is a --> " + farmAnimal.getClass().getSimpleName());
        
        weight = 200.0F;
        id = 2;
        breed = "Amiantina";
        bornOnDate =new Date(2020, 10, 11);
        foodTypes.add(foodType);
                
        farmAnimal = new Donkey(weight, id, breed, bornOnDate, foodTypes);
        System.out.println("Whats is FarmAnimal now --> " + farmAnimal.getClass().getCanonicalName());
        
        System.out.println("FarmAnimal is A --> " + farmAnimal);
        
        Donkey donkey = new Donkey(weight, id, breed, bornOnDate, foodTypes);
        donkey.load("Espe", "Terracota");
        donkey.feed();
        donkey.getLoadWeight();
        donkey.produce();
        donkey.setLoadWeight(500);
        
    }
    
}
