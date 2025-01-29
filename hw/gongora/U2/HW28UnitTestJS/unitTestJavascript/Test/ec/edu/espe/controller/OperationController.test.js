const OperationController = require( "../../../../../ec/edu/espe/controller/OperationController.js");
const BasicOperation  = require ("../../../../../ec/edu/espe/model/BasicOperation.js");

describe("Unit tests in OperationController",()=>{
    test("sum between two numbers",()=>{
        let basicOperation = new BasicOperation(1.2,3.6);
        let operationController = new OperationController(basicOperation);
        let expectedResult = 4.9;
        let result=operationController.add();

        expect(result).toBe(expectedResult);

    })
})