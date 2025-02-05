import unittest
from calculadora import Calculadora

class TestCalculadora(unittest.TestCase):
    def setUp(self):
        """Configura una instancia de la calculadora para las pruebas."""
        self.calculadora = Calculadora()

    def test_sumar(self):
        """Prueba el método sumar con diferentes casos."""
        self.assertEqual(self.calculadora.sumar(2, 3), 5)
        self.assertEqual(self.calculadora.sumar(-1, 1), 0)
        self.assertEqual(self.calculadora.sumar(0, 0), 0)
        self.assertEqual(self.calculadora.sumar(100, 200), 300)

if __name__ == "__main__":
    unittest.main()
