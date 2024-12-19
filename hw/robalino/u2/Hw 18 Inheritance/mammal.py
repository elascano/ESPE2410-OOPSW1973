from datetime import date
from typing import List


class Mammal(Animal):
    def __init__(self, maximum_hair_size: float, mammary_glands_number: int, id: int, name: str, born_on_date: date, weight: float, sex: str, vaccines: List['Vaccine']):
        super().__init__(id, name, born_on_date, weight, sex, vaccines)
        self._maximum_hair_size = maximum_hair_size
        self._mammary_glands_number = mammary_glands_number

    def breastfeed(self):
        print("Breastfeeding the children")

    @property
    def maximum_hair_size(self) -> float:
        return self._maximum_hair_size

    @maximum_hair_size.setter
    def maximum_hair_size(self, value: float):
        self._maximum_hair_size = value

    @property
    def mammary_glands_number(self) -> int:
        return self._mammary_glands_number

    @mammary_glands_number.setter
    def mammary_glands_number(self, value: int):
        self._mammary_glands_number = value

    def __str__(self) -> str:
        return (f"Mammal({super().__str__()}, maximum_hair_size={self._maximum_hair_size}, "
                f"mammary_glands_number={self._mammary_glands_number})")

