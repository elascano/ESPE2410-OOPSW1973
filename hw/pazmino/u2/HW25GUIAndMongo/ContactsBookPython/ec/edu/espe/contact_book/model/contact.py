from datetime import datetime
from typing import List

class Contact:
    def __init__(self, id: int, name: str, sex: str, gender: str, marital_status: str, date_of_birth: datetime, favorite_sport: List[str], comments: str):
        self.id = id
        self.name = name
        self.sex = sex
        self.gender = gender
        self.marital_status = marital_status
        self.date_of_birth = date_of_birth  # Debe ser un objeto datetime
        self.favorite_sport = favorite_sport
        self.comments = comments

    def to_dict(self):
        """Convierte el objeto Contact a un diccionario para MongoDB"""
        return {
            "id": self.id,
            "name": self.name,
            "sex": self.sex,
            "gender": self.gender,
            "maritalStatus": self.marital_status,
            "birthdate": int(self.date_of_birth.timestamp() * 1000),  # Milisegundos
            "favoriteSports": self.favorite_sport,
            "comments": self.comments
        }

    @staticmethod
    def from_dict(data):
        """Crea un objeto Contact a partir de un diccionario de MongoDB"""
        return Contact(
            id=data["id"],
            name=data["name"],
            sex=data["sex"],
            gender=data["gender"],
            marital_status=data["maritalStatus"],
            date_of_birth=datetime.fromtimestamp(data["birthdate"] / 1000),
            favorite_sport=data["favoriteSports"],
            comments=data["comments"]
        )

    def __str__(self):
        return (f"Contact(id={self.id}, name={self.name}, sex={self.sex}, gender={self.gender}, "
                f"maritalStatus={self.marital_status}, dateOfBirth={self.date_of_birth}, "
                f"favoriteSport={self.favorite_sport}, comments={self.comments})")
