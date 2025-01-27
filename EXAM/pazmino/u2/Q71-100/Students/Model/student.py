class Student:
    def __init__(self, student_id: str, name: str, signature: str, career: str):
        self._id = student_id
        self._name = name
        self._signature = signature
        self._career = career

    # Getters
    def get_id(self) -> str:
        return self._id

    def get_name(self) -> str:
        return self._name

    def get_signature(self) -> str:
        return self._signature

    def get_career(self) -> str:
        return self._career

    # Setters
    def set_id(self, student_id: str):
        self._id = student_id

    def set_name(self, name: str):
        self._name = name

    def set_signature(self, signature: str):
        self._signature = signature

    def set_career(self, career: str):
        self._career = career


if __name__ == "__main__":
    student = Student("123", "John Doe", "Signature1", "Computer Science")
    print(f"ID: {student.get_id()}, Name: {student.get_name()}, Signature: {student.get_signature()}, Career: {student.get_career()}")

    student.set_name("Jane Doe")
    print(f"Updated Name: {student.get_name()}")