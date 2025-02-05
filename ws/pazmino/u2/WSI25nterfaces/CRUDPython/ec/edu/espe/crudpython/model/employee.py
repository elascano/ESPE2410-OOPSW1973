from pymongo import MongoClient

class EmployeeModel:
    def __init__(self):
        self.client = MongoClient("mongodb://localhost:27017/")
        self.db = self.client["CoffeeEmployeeDB"]
        self.collection = self.db["employees"]

    def create_employee(self, name, position, salary):
        employee_data = {"name": name, "position": position, "salary": salary}
        self.collection.insert_one(employee_data)

    def read_employees(self):
        return list(self.collection.find())

    def update_employee(self, employee_id, name=None, position=None, salary=None):
        update_data = {k: v for k, v in {"name": name, "position": position, "salary": salary}.items() if v}
        if update_data:
            self.collection.update_one({"_id": employee_id}, {"$set": update_data})

    def delete_employee(self, employee_id):
        self.collection.delete_one({"_id": employee_id})
