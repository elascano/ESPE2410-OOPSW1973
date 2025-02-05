const BasicOperations = require('../model/BasicOperations');
const BasicOperationsController = require('../controller/BasicOperationsController');

describe('BasicOperationsController Tests', () => {
    test('add(addend1, addend2) con números pequeños', () => {
        const basicOperations = new BasicOperations(0, 0);
        const controller = new BasicOperationsController(basicOperations);

        const addend1 = 1.2;
        const addend2 = 2.4;
        const expected = 3.6;

        const result = controller.add(addend1, addend2);
        expect(result).toBeCloseTo(expected, 1); // Precisión de 1 decimal
    });

    test('add(addend1, addend2) con números grandes', () => {
        const basicOperations = new BasicOperations(0, 0);
        const controller = new BasicOperationsController(basicOperations);

        const addend1 = 10456.2;
        const addend2 = 10456.4;
        const expected = 20912.6;

        const result = controller.add(addend1, addend2);
        expect(result).toBeCloseTo(expected, 1); // Precisión de 1 decimal
    });

    test('add() sin parámetros con números grandes', () => {
        const basicOperations = new BasicOperations(10010456.2, 10010456.4);
        const controller = new BasicOperationsController(basicOperations);

        const expected = 20020912.6;

        const result = controller.add();
        expect(result).toBeCloseTo(expected, 1); // Precisión de 1 decimal
    });

    test('add() sin parámetros con números negativos', () => {
        const basicOperations = new BasicOperations(-1.2, -3.6);
        const controller = new BasicOperationsController(basicOperations);

        const expected = -4.8;

        const result = controller.add();
        expect(result).toBeCloseTo(expected, 1); // Precisión de 1 decimal
    });

    test('getBasicOperations() debe retornar la instancia de BasicOperations', () => {
        const basicOperations = new BasicOperations(0, 0);
        const controller = new BasicOperationsController(basicOperations);

        const result = controller.getBasicOperations();
        expect(result).toBe(basicOperations); // Validamos que retorna la misma instancia
    });

    test('setBasicOperations() debe actualizar la instancia de BasicOperations', () => {
        const basicOperations = new BasicOperations(0, 0);
        const controller = new BasicOperationsController(basicOperations);

        const newBasicOperations = new BasicOperations(20, 30);
        controller.setBasicOperations(newBasicOperations);

        const result = controller.getBasicOperations();
        expect(result).toBe(newBasicOperations); // Validamos que se actualizó correctamente
    });
});
