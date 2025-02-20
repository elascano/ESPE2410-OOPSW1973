

package ec.edu.espe.sortapp.controller;

import ec.edu.espe.sortapp.model.SortingModel;

/**
 *
 * @author Alexander Ullco
 */
public class SortingController {
    private SortingModel model;

    public SortingController() {
        model = new SortingModel();
    }

    public int[] sortData(int[] data) {
        return model.sort(data);
    }
}