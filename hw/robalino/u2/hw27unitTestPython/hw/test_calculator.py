# file: test_calculator.py

import unittest
from basic_calculator import add, subtract, multiply, divide

class TestCalculator(unittest.TestCase):
    def test_add(self):
        self.assertEqual(add(2, 3), 5)
        self.assertEqual(add(-1, 1), 0)
        self.assertEqual(add(0, 0), 0)
        self.assertEqual(add(1.5, 2.5), 4.0)

    def test_subtract(self):
        self.assertEqual(subtract(5, 3), 2)
        self.assertEqual(subtract(0, 5), -5)
        self.assertEqual(subtract(3.5, 1.5), 2.0)
        self.assertEqual(subtract(-3, -7), 4)

    def test_multiply(self):
        self.assertEqual(multiply(4, 3), 12)
        self.assertEqual(multiply(-1, 5), -5)
        self.assertEqual(multiply(0, 100), 0)
        self.assertEqual(multiply(2.5, 2), 5.0)

    def test_divide(self):
        self.assertEqual(divide(6, 3), 2)
        self.assertEqual(divide(5, 2), 2.5)
        self.assertEqual(divide(-9, 3), -3)
        self.assertEqual(divide(0, 1), 0)
        self.assertEqual(divide(0, -1), 0)
        self.assertEqual(divide(1, 0), "Error: Division by zero is not allowed.")

if __name__ == "__main__":
    unittest.main()

