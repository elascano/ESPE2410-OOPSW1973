
class KeyBoard:

    def __init__(self, id = int, brand = str, type = str, price = float):
        self._id = id
        self._brand = brand
        self._type = type
        self._price = price

    def __str__(self):
        return f"Keyboard{{id={self._id}, brand={self._brand}, type={self._type}, price={self._price}}}"

    def get_id(self) -> int:
        return self._id
    
    def set_id(self, id: int):
        self._id = id

    def get_brand(self) -> str:
        return self._brand
    
    def set_brand(self, brand: str):
        self._brand = brand
    
    def get_type(self) -> str:
        return self._type
    
    def set_type(self, type: str):
        self._type = type

    def get_price(self) -> float:
        return self._price
    
    def set_price(self, price: float):
        self._price = price

    