from basic_operation import BasicOperation

class BasicOperationController:
    def __init__(self, basic_operation):
        self.basic_operation = basic_operation

    def add(self, addend1=None, addend2=None):
        if addend1 is not None and addend2 is not None:
            return addend1 + addend2
        else:
            return self.basic_operation.get_term1() + self.basic_operation.get_term2()

    def get_basic_operation(self):
        return self.basic_operation

    def set_basic_operation(self, basic_operation):
        self.basic_operation = basic_operation
