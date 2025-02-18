package ec.edu.espe.examnunit2.controller;

import ec.edu.espe.examnunit2.model.mask;

public class MaskController {
    public double computePerformanceIndex(mask computer) {
        double processorSpeed = computer.getProcessorSpeed();
        int ramSize = computer.getRamSize();

        return processorSpeed * ramSize;
    }
}
