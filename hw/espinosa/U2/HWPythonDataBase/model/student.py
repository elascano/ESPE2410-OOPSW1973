class Student:
    def __init__(self, id=None, name="", gpa=0.0, age=0):
        self.id = id
        self.name = name
        self.gpa = gpa
        self.age = age
    
    def to_dict(self):
        return {
            "name": self.name,
            "gpa": self.gpa,
            "age": self.age
        }
    
    @staticmethod
    def from_dict(data, id=None):
        return Student(
            id=id if id else str(data.get("_id")),
            name=data.get("name", ""),
            gpa=data.get("gpa", 0.0),
            age=data.get("age", 0)
        )