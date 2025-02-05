def suma(a, b):
    return a + b

# La misma vaina pero con pytest
def test_positive():
    assert suma(2, 3) == 5

def test_negative():
    assert suma(-1, -1) == -2

def test_zero():
    assert suma(0, 0) == 0

def test_positive_and_negative():
    assert suma(5, -3) == 2
