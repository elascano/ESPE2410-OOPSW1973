    
package ec.edu.espe.sortingapp.model;

/**
 *
 * @author Marlon Pasquel
 */
public class SortingContext {
    private SortingStrategy strategy;

    public void setSortStrategy(SortingStrategy strategy) {
        this.strategy = strategy;
    }

    public void sort() {
        if (strategy != null) {
            strategy.sort();
        } else {
            System.out.println("No sorting strategy set.");
        }
    }
}
