package ec.edu.espe.sortapp.model;
/**
 *
 * @author Camila Bohorquez
 */
public class SortingModel {
    private final SortingContext context;

    public SortingModel() {
        context = new SortingContext();
    }

    public int[] sort(int data[]) {
        return context.sort(data);
    }
}