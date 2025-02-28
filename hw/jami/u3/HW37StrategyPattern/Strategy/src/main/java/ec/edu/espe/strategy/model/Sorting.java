package ec.edu.espe.strategy.model;

/**
 *
 * @author Klever Jami
 */
public class Sorting {

    private SortingContext context;

    public Sorting() {
        context = new SortingContext();
    }

    public int[] sort(int data[]) {
        return context.sort(data);
    }
}
