from datetime import date
from typing import List


class Animal:
    def __init__(self, id: int, name: str, born_on_date: date, weight: float, sex: str, vaccines: List['Vaccine']):
        self._id = id
        self._name = name
        self._born_on_date = born_on_date
        self._weight = weight
        self._sex = sex
        self._vaccines = vaccines

    def feed(self, food: 'Food'):
        print(f"Feeding the animal {self._name} with ---> {food}")

    def register(self):
        print(f"Registered animal {self._name}")

    def assign_cage(self, cage: 'Cage'):
        print(f"Assigning animal {self._name} to cage ---> {cage}")
        cage.get_animals().append(self)

    def provide_vaccination(self, vaccine: 'Vaccine'):
        print(f"Providing vaccine ---> {vaccine} <--- to {self._name}")

    @property
    def id(self) -> int:
        return self._id

    @id.setter
    def id(self, value: int):
        self._id = value

    @property
    def name(self) -> str:
        return self._name

    @name.setter
    def name(self, value: str):
        self._name = value

    @property
    def born_on_date(self) -> date:
        return self._born_on_date

    @born_on_date.setter
    def born_on_date(self, value: date):
        self._born_on_date = value

    @property
    def weight(self) -> float:
        return self._weight

    @weight.setter
    def weight(self, value: float):
        self._weight = value

    @property
    def sex(self) -> str:
        return self._sex

    @sex.setter
    def sex(self, value: str):
        self._sex = value

    @property
    def vaccines(self) -> List['Vaccine']:
        return self._vaccines

    @vaccines.setter
    def vaccines(self, value: List['Vaccine']):
        self._vaccines = value

    def __str__(self) -> str:
        return (f"Animal(id={self._id}, name={self._name}, born_on_date={self._born_on_date}, "
                f"weight={self._weight}, sex={self._sex}, vaccines={self._vaccines})")
