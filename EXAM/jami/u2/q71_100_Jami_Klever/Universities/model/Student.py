class Student:
    def __init__(self, id, name, lastName):
        self._id = id
        self._name = name
        self._lastName = lastName

    # Getters
    def get_id(self):
        return self._id

    def get_name(self):
        return self._name

    def get_lastName(self):
        return self._lastName

    # Setters
    def set_id(self, id):
        self._id = id

    def set_name(self, name):
        self._name = name

    def set_lastName(self, lastName):
        self._lastName = lastName
