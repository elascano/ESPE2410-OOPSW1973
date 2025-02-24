

package ec.edu.espe.mythologicalanimals.model;

import ec.edu.espe.mythologicalanimals.controller.Entity;
import ec.edu.espe.mythologicalanimals.controller.MythologicalAnimal;
import java.util.ArrayList;

/**
 *
 * @author Lucas Gongora
 */
public class Dragon extends MythologicalAnimal implements Entity {
    ArrayList<Entity> partsOfBody;

    public Dragon() {
        partsOfBody = new ArrayList<>();
    }
    
    public void add(Entity part){
         partsOfBody.add(part);
    }
    @Override
    public void attack() {
        for (Entity part: partsOfBody){
            part.attack();
        }
            
    }

    @Override
    protected void showDescription() {
        System.out.println("I'm a dragon guardian of the heavens");
    }

}
