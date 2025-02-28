package ec.edu.espe.strategy.controller;

import ec.edu.espe.strategy.model.Sorting;

/**
 *
 * @author Klever Jami
 */
public class SortingController {

    private Sorting model;

    public SortingController() {
        model = new Sorting();
    }

    public int[] sortData(int[] data) {
        return model.sort(data);
    }
}
