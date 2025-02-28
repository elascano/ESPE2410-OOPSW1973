package ec.edu.espe.mythologicalanimals.model;

import ec.edu.espe.mythologicalanimals.controller.Entity;
import ec.edu.espe.mythologicalanimals.controller.MythologicalAnimal;
import java.util.ArrayList;

/**
 *
 * @author Lucas Gongora
 */
public class Griffin extends MythologicalAnimal implements Entity  {

    ArrayList<Entity> partsOfBody;

    public Griffin() {
        partsOfBody = new ArrayList<>();
    }

    public void add(Entity part) {
        partsOfBody.add(part);
    }

    @Override
    public void attack() {
        for (Entity part : partsOfBody) {
            part.attack();
        }
    }

    @Override
    protected void showDescription() {
        System.out.println("I am the Griffin, a majestic creature born from the union of the"
                + " king of beasts and the lord of the skies. My body is that of a lion—strong and agile—while my head and wings belong to an eagle");
    }

}
