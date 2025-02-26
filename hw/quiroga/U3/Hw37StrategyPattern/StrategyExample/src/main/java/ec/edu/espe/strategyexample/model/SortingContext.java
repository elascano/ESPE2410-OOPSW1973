
package ec.edu.espe.strategyexample.model;

/**
 *
 * @author Esteban Quiroga 
 */
public class SortingContext {
    
    private SortingStrategy ss;
    
    public int[] sort(int data[]){
        int size = data.length;
        ss = setSortStrategy(size);
        return ss.sort(data);
    }
    
    public SortingStrategy setSortStrategy(int n){
        if(n>0 && n<30)
            ss = new BubbleSort();
        
        if(n>=30 && n<100)
            ss = new InsertionSort();
        
        if(n>=100)
            ss = new BubbleSort();
        
        return ss;
    }

    public SortingStrategy getSs() {
        return ss;
    }
    
}
