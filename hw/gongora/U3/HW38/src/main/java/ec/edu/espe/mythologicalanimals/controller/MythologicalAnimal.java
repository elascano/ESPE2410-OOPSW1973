

package ec.edu.espe.mythologicalanimals.controller;

/**
 *
 * @author Lucas Gongora
 */
public abstract class MythologicalAnimal {
    
    public void appear(){
        System.out.println("I'm a mythological animal");
        showDescription();
    }
    
    protected abstract void showDescription();

}
