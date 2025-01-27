package ec.espe.edu.calculator.view;

import ec.espe.edu.calculator.controller.OperationController;
import ec.espe.edu.calculator.model.BasicOperation;

/**
 *
 * @author LABS-DCCO
 */
public class Calculator {

    public static void main(String[] args) {
        BasicOperation basicOperation = new BasicOperation(0.0F, 0.0F);
        OperationController operationController = new OperationController(basicOperation);
        System.out.println(operationController.add(0.5F, 0.5F));
    }
}
