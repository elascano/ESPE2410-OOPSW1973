from abc import ABC, abstractmethod
import math
import unittest

# Abstract base class (interface)
class Shape(ABC):
    @abstractmethod
    def area(self) -> float:
        """Calculate the area of the shape"""
        pass
    
    @abstractmethod
    def perimeter(self) -> float:
        """Calculate the perimeter of the shape"""
        pass
    
    @abstractmethod
    def describe(self) -> str:
        """Return a description of the shape"""
        pass

# Interface for shapes that can be resized
class Resizable(ABC):
    @abstractmethod
    def resize(self, factor: float) -> None:
        """Resize the shape by a given factor"""
        pass

# Concrete class implementing both interfaces
class Circle(Shape, Resizable):
    def __init__(self, radius: float):
        if radius <= 0:
            raise ValueError("Radius must be positive")
        self._radius = radius
    
    @property
    def radius(self) -> float:
        return self._radius
    
    def area(self) -> float:
        return math.pi * self._radius ** 2
    
    def perimeter(self) -> float:
        return 2 * math.pi * self._radius
    
    def describe(self) -> str:
        return f"Circle with radius {self._radius}"
    
    def resize(self, factor: float) -> None:
        if factor <= 0:
            raise ValueError("Resize factor must be positive")
        self._radius *= factor

# Another concrete class
class Rectangle(Shape, Resizable):
    def __init__(self, width: float, height: float):
        if width <= 0 or height <= 0:
            raise ValueError("Dimensions must be positive")
        self._width = width
        self._height = height
    
    @property
    def width(self) -> float:
        return self._width
    
    @property
    def height(self) -> float:
        return self._height
    
    def area(self) -> float:
        return self._width * self._height
    
    def perimeter(self) -> float:
        return 2 * (self._width + self._height)
    
    def describe(self) -> str:
        return f"Rectangle with width {self._width} and height {self._height}"
    
    def resize(self, factor: float) -> None:
        if factor <= 0:
            raise ValueError("Resize factor must be positive")
        self._width *= factor
        self._height *= factor

# Unit tests
class TestShapes(unittest.TestCase):
    def setUp(self):
        self.circle = Circle(5)
        self.rectangle = Rectangle(4, 6)
    
    def test_circle_area(self):
        expected_area = math.pi * 25
        self.assertAlmostEqual(self.circle.area(), expected_area)
    
    def test_circle_perimeter(self):
        expected_perimeter = 2 * math.pi * 5
        self.assertAlmostEqual(self.circle.perimeter(), expected_perimeter)
    
    def test_circle_resize(self):
        self.circle.resize(2)
        self.assertEqual(self.circle.radius, 10)
    
    def test_rectangle_area(self):
        self.assertEqual(self.rectangle.area(), 24)
    
    def test_rectangle_perimeter(self):
        self.assertEqual(self.rectangle.perimeter(), 20)
    
    def test_rectangle_resize(self):
        self.rectangle.resize(0.5)
        self.assertEqual(self.rectangle.width, 2)
        self.assertEqual(self.rectangle.height, 3)
    
    def test_invalid_circle_radius(self):
        with self.assertRaises(ValueError):
            Circle(-1)
    
    def test_invalid_rectangle_dimensions(self):
        with self.assertRaises(ValueError):
            Rectangle(-2, 5)
    
    def test_invalid_resize_factor(self):
        with self.assertRaises(ValueError):
            self.circle.resize(-2)

if __name__ == '__main__':
    unittest.main()