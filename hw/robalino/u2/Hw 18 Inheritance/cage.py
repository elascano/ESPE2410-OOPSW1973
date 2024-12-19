from typing import List


class Cage:
    def __init__(self, id: int, animals: List['Animal']):
        self._id = id
        self._animals = animals

    def __str__(self) -> str:
        return f"Cage(id={self._id}, animals={self._animals})"

    @property
    def id(self) -> int:
        return self._id

    @id.setter
    def id(self, value: int):
        self._id = value

    @property
    def animals(self) -> List['Animal']:
        return self._animals

    @animals.setter
    def animals(self, value: List['Animal']):
        self._animals = value
