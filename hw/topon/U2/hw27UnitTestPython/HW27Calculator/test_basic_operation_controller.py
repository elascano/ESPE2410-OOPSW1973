import unittest
from basic_operation import BasicOperation
from basic_operation_controller import BasicOperationController

class TestBasicOperationController(unittest.TestCase):
    
    @classmethod
    def setUpClass(cls):
        pass

    @classmethod
    def tearDownClass(cls):
        pass

    def setUp(self):
        pass

    def tearDown(self):
        pass
    
    def test_add_float_float(self):
        addend1 = 1.2
        addend2 = 2.4
        basic_operation = BasicOperation(0.0, 0.0)
        controller = BasicOperationController(basic_operation)
        expected_result = 3.6
        result = controller.add(addend1, addend2)
        self.assertEqual(result, expected_result)

    def test_add_0args(self):
        basic_operation = BasicOperation(1.2, 3.6)
        controller = BasicOperationController(basic_operation)
        expected_result = 4.8
        result = controller.add()
        self.assertEqual(result, expected_result)

    def test_add_float_float_big_numbers(self):
        addend1 = 1.0010456E7
        addend2 = 1.0010456E7
        basic_operation = BasicOperation(0.0, 0.0)
        controller = BasicOperationController(basic_operation)
        expected_result = 2.0020912E7
        result = controller.add(addend1, addend2)
        self.assertEqual(result, expected_result)

    def test_add_0args_neg(self):
        basic_operation = BasicOperation(-1.2, -3.6)
        controller = BasicOperationController(basic_operation)
        expected_result = -4.8
        result = controller.add()
        self.assertEqual(result, expected_result)

if __name__ == "__main__":
    unittest.main()
