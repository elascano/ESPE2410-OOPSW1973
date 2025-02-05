def suma(a, b):
    return a + b

# esta es la primera vaina xd con unittest
import unittest

class TestSuma(unittest.TestCase):
    
    def test_positive(self):
        self.assertEqual(suma(2, 3), 5)
    
    def test_negative(self):
        self.assertEqual(suma(-1, -1), -2)
    
    def test_zero(self):
        self.assertEqual(suma(0, 0), 0)
    
    def test_positive_and_negative(self):
        self.assertEqual(suma(5, -3), 2)

if __name__ == '__main__':
    unittest.main()
