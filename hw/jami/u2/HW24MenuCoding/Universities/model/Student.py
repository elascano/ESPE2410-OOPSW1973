class Student:
    def __init__(self, id, name, lastName, grades=None):
        self._id = id
        self._name = name
        self._lastName = lastName
        self._grades = grades if grades is not None else []
        self._status = "Pending"

    # Getters
    def get_id(self):
        return self._id

    def get_name(self):
        return self._name

    def get_lastName(self):
        return self._lastName

    def get_grades(self):
        return self._grades

    def get_status(self):
        return self._status

    # Setters
    def set_id(self, id):
        self._id = id

    def set_name(self, name):
        self._name = name

    def set_lastName(self, lastName):
        self._lastName = lastName

    def set_grades(self, grades):
        self._grades = grades

    def set_status(self, status):
        self._status = status
