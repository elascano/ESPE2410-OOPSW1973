from bson.objectid import ObjectId
from ec.edu.espe.crudpython.model.employee import EmployeeModel

class EmployeeController:
    def __init__(self):
        self.model = EmployeeModel()

    def add_employee(self, name, position, salary):
        self.model.create_employee(name, position, salary)

    def get_employees(self):
        employees = self.model.read_employees()
        return [{"_id": str(emp["_id"]), "name": emp["name"], "position": emp["position"], "salary": emp["salary"]} for emp in employees]

    def update_employee(self, employee_id, name=None, position=None, salary=None):
        self.model.update_employee(ObjectId(employee_id), name, position, salary)

    def delete_employee(self, employee_id):
        self.model.delete_employee(ObjectId(employee_id))
