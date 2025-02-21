

package ec.edu.espe.templateexample.model;

/**
 *
 * @author Alan Arias
 */
public class Coffee extends CaffeineBeverage {
    private boolean wantsCondiments;
    
    public void setWantsCondiments(boolean wants) {
        this.wantsCondiments = wants;
    }
    
    @Override
    protected void brew() {
        System.out.println("Dripping coffee though filter");
    }
    
    @Override
    protected boolean wantsCondiments() {
        return wantsCondiments;
    }
    
    @Override
    protected void addCondiments() {
        System.out.println("Adding milk and sugar");
    }
}
