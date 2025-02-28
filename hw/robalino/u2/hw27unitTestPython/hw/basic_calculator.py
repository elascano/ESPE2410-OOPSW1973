# file: basic_calculator.py

def add(a, b):
    """Returns the sum of two numbers."""
    return a + b

def subtract(a, b):
    """Returns the difference between two numbers."""
    return a - b

def multiply(a, b):
    """Returns the product of two numbers."""
    return a * b

def divide(a, b):
    """Returns the quotient of two numbers. Handles division by zero."""
    if b == 0:
        return "Error: Division by zero is not allowed."
    return a / b

def calculator():
    """Main function to run the calculator."""
    print("Welcome to the Basic Calculator!")
    print("Available operations:")
    print("1. Add (+)")
    print("2. Subtract (-)")
    print("3. Multiply (*)")
    print("4. Divide (/)")
    
    while True:
        try:
            # Get operation choice
            choice = input("\nEnter the operation (+, -, *, /) or 'q' to quit: ").strip().lower()
            if choice == 'q':
                print("Exiting the calculator. Goodbye!")
                break

            if choice not in ['+', '-', '*', '/']:
                print("Invalid operation. Please choose from +, -, *, /.")
                continue
            
            # Get numbers from the user
            num1 = float(input("Enter the first number: "))
            num2 = float(input("Enter the second number: "))
            
            # Perform calculation based on the user's choice
            if choice == '+':
                result = add(num1, num2)
            elif choice == '-':
                result = subtract(num1, num2)
            elif choice == '*':
                result = multiply(num1, num2)
            elif choice == '/':
                result = divide(num1, num2)

            print(f"The result is: {result}")
        except ValueError:
            print("Error: Invalid input. Please enter numeric values.")
        except Exception as e:
            print(f"An unexpected error occurred: {e}")

if __name__ == "__main__":
    calculator()
