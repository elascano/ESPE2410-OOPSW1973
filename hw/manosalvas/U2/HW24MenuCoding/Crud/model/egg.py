class Egg:
    def __init__(self, id=None):
        self.id = id

    def __str__(self):
        return f"Egg{{id={self.id}}}"
