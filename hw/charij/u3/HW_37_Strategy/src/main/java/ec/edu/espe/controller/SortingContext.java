package ec.edu.espe.controller;

import ec.edu.espe.model.SortingStrategy;

/**
 *
 * @author Sebastian Charij
 */
public class SortingContext {
    private SortingStrategy strategy;

    public void setSortStrategy(SortingStrategy strategy) {
        this.strategy = strategy;
    }

    public void sortArray(int[] array) {
        strategy.sort(array);
    }
}
