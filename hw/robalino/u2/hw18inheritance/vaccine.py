class Vaccine:
    def __init__(self, id: int, description: str):
        self._id = id
        self._description = description

    def __str__(self) -> str:
        return f"Vaccine(id={self._id}, description={self._description})"

    @property
    def id(self) -> int:
        return self._id

    @id.setter
    def id(self, value: int):
        self._id = value

    @property
    def description(self) -> str:
        return self._description

    @description.setter
    def description(self, value: str):
        self._description = value
