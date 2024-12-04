import datetime

class Chicken:
    def __init__(self, id=0, name="", color="", age_in_months=0, born_on_date="", not_molting=False):
        self.id = id
        self.name = name
        self.color = color
        self.age_in_months = age_in_months
        self.born_on_date = born_on_date
        self.not_molting = not_molting

    def __str__(self):
        return (f"Chicken {{ ID: {self.id}, Name: {self.name}, Color: {self.color}, "
                f"Age: {self.age_in_months} months, Born On: {self.born_on_date}, "
                f"Not Molting: {self.not_molting} }}")

    def enter_chicken(self):
        self.id = int(input("Enter ID of chicken: "))
        self.name = input("Enter name of chicken: ")
        self.color = input("Enter color of chicken: ")
        birth_date_input = input("Enter birth date of chicken (YYYY-MM-DD): ")
        try:
            self.born_on_date = birth_date_input
            self.age_in_months = self.compute_age_in_months()
        except ValueError:
            print("Invalid date format. Please use YYYY-MM-DD.")
        self.not_molting = input("Is molting? (true/false): ").lower() == "true"

    def update_chicken(self):
        print("1. Update Name")
        print("2. Update Color")
        print("3. Update Not Molting")
        choice = input("Enter your choice: ")

        if choice == "1":
            self.name = input("Enter new name: ")
        elif choice == "2":
            self.color = input("Enter new color: ")
        elif choice == "3":
            self.not_molting = input("Is molting? (true/false): ").lower() == "true"
        else:
            print("Invalid choice.")

    def compute_age_in_months(self):
        if not self.born_on_date:
            return 0
        birth_date = datetime.datetime.strptime(self.born_on_date, "%Y-%m-%d")
        today = datetime.datetime.now()
        return (today.year - birth_date.year) * 12 + today.month - birth_date.month
