class Poop:
    def __init__(self, id=None):
        self.id = id

    def __str__(self):
        return f"Poop{{id={self.id}}}"
