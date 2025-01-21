from basic_operation import BasicOperation
from basic_operation_controller import BasicOperationController

def main():
    basic_operation = BasicOperation(5, 3)
    controller = BasicOperationController(basic_operation)

    print(f"Sum from BasicOperationController: {controller.add()}")
    print(f"Sum from add method: {controller.add(7, 8)}")

if __name__ == "__main__":
    main()
