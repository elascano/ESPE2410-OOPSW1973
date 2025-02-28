class Food:
    def __init__(self, id: int, amount: float, food_type: str):
        self._id = id
        self._amount = amount
        self._type = food_type

    def __str__(self) -> str:
        return f"Food(id={self._id}, amount={self._amount}, type={self._type})"

    @property
    def id(self) -> int:
        return self._id

    @id.setter
    def id(self, value: int):
        self._id = value

    @property
    def amount(self) -> float:
        return self._amount

    @amount.setter
    def amount(self, value: float):
        self._amount = value

    @property
    def type(self) -> str:
        return self._type

    @type.setter
    def type(self, value: str):
        self._type = value
