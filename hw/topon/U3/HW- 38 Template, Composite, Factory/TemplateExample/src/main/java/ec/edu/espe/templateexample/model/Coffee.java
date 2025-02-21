package ec.edu.espe.templateexample.model;

/**
 *
 * @author Mateo Topon
 */
public class Coffee extends CaffeineBeverage {
    private boolean wantsCondiments;
    
    public void setWantsCondiments(boolean wants) {
        this.wantsCondiments = wants;
    }
    
    @Override
    protected void brew() {
        System.out.println("2: Dripping coffee though filter");
    }
    
    @Override
    protected boolean wantsCondiments() {
        return wantsCondiments;
    }
    
    @Override
    protected void addCondiments() {
        System.out.println("Start adding milk and sugar ...");
    }
}
