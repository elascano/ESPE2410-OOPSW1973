package ec.espe.edu.farm.view;


import ec.espe.edu.farm.model.Donkey;
import ec.espe.edu.farm.model.FarmAnimal;
import ec.espe.edu.farm.model.FoodType;
import ec.espe.edu.farm.model.Pig;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author David Cuichan
 */
public class Farm {

    public static void main(String[] args) {
        FarmAnimal farmAnimal;
        boolean isProducingMeat = true;
        int id = 1;
        float weight = 0.3F;
        String breed = "Pink";
        Date bornOnDate = new Date(2024,12,11);
        FoodType foodType = new FoodType();
        ArrayList<FoodType> foodTypes;
        foodTypes = new ArrayList<>();
        foodTypes.add(foodType);
        farmAnimal = new Pig(true, 0.8F, 1, breed, bornOnDate, foodTypes);
        System.out.println("What is FarmAnimal now --> " + farmAnimal.getClass().getCanonicalName());
        
        System.out.println("Farm Animal--> " + farmAnimal);
        farmAnimal.getAgeInMonths();
        
        weight = 200.0F;
        id = 2;
        breed = "Anistina";
        bornOnDate = new Date(2020, 4, 8);
        foodTypes.add(foodType);
        
        farmAnimal = new Donkey(weight, id, breed, bornOnDate, foodTypes);
        System.out.println("Farm Animal--> " + farmAnimal);
        
    }
}
