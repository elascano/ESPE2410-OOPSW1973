package ec.edu.espe.sortapp.model;

/**
 *
 * @author Alexander Ullco
 */
public class SortingModel {
    private SortingContext context;

    public SortingModel() {
        context = new SortingContext();
    }

    public int[] sort(int data[]) {
        return context.sort(data);
    }
}