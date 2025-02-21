package ec.edu.espe.templateexample.model;

/**
 *
 * @author Mateo Topon
 */
public class Tea extends CaffeineBeverage {
    private boolean wantsLemon;
    
    public void setWantsLemon(boolean wants) {
        this.wantsLemon = wants;
    }
    
    @Override
    protected void brew() {
        System.out.println("2: Steep the tea");
    }
    
    @Override
    protected boolean wantsCondiments() {
        return wantsLemon;
    }
    
    @Override
    protected void addCondiments() {
        System.out.println("Start add lemon ....");
    }
}
