package ec.edu.espe.sortapp.controller;
import ec.edu.espe.sortapp.model.SortingModel;

/**
 *
 * @author Camila Bohorquez
 */
public class SortingController {
    private final SortingModel model;

    public SortingController() {
        model = new SortingModel();
    }

    public int[] sortData(int[] data) {
        return model.sort(data);
    }
}