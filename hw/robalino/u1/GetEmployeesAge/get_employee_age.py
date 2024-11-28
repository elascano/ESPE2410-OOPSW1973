import json
from datetime import datetime

class Employee:
    def __init__(self, name, birthdate):
        self.name = name
        self.birthdate = birthdate
        self.age = self.compute_age(birthdate)

    def compute_age(self, birthdate):
        birth_date = datetime.strptime(birthdate, '%Y-%m-%d')
        today = datetime.today()
        age = today.year - birth_date.year
        if today.month < birth_date.month or (today.month == birth_date.month and today.day < birth_date.day):
            age -= 1
        return age

    def __repr__(self):
        return f"Employee(name='{self.name}', birthdate='{self.birthdate}', age={self.age})"

def main():
    employees = []
    
    while True:
        name = input("Enter Employee Name: ")
        birthdate = input("Enter Employee Birthdate (YYYY-MM-DD): ")
        
        employee = Employee(name, birthdate)
        employees.append(employee)
        
        another = input("Do you want to add another employee? (yes/no): ")
        if another.lower() != 'yes':
            break
    
    
    with open('employees.json', 'w') as json_file:
        json.dump([employee.__dict__ for employee in employees], json_file, indent=4)
    
   
    with open('employees.json', 'r') as json_file:
        loaded_employees = json.load(json_file)
        for employee in loaded_employees:
            print(employee)

if __name__ == "__main__":
    main()
