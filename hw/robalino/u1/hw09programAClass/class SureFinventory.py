class SureFinventory:
    def __init__(self, items=None, total_value=0.0, stock=""):
        self.items = items if items is not None else []
        self.total_value = total_value
        self.stock = stock
