from datetime import datetime, date

class Chicken:
    def __init__(self, id=None, name=None, color=None, age_in_months=None, born_on_date=None, not_molting=None):
        self.id = id
        self.name = name
        self.color = color
        self.age_in_months = age_in_months if age_in_months is not None else self.compute_age_in_months(born_on_date)
        self.born_on_date = born_on_date
        self.not_molting = not_molting

    def __str__(self):
        return (f"Chicken{{id={self.id}, name={self.name}, color={self.color}, "
                f"age={self.age_in_months}, bornOnDate={self.born_on_date}, "
                f"notMolting={self.not_molting}}}")

    def enter_chicken(self):
        self.id = int(input("Enter id of chicken: "))
        self.name = input("Enter name of chicken: ")
        self.color = input("Enter color of chicken: ")
        born_on_date_input = input("Enter birth date of chicken (YYYY-MM-DD): ")
        self.born_on_date = datetime.strptime(born_on_date_input, "%Y-%m-%d").date()
        self.not_molting = input("Is molting? (true/false): ").strip().lower() == "true"
        self.age_in_months = self.compute_age_in_months(self.born_on_date)

    def update_chicken(self):
        choice = int(input("Select the attribute to update:\n1. Name\n2. Color\n3. Not Molting\nEnter your choice: "))
        if choice == 1:
            self.name = input("Enter new name: ")
        elif choice == 2:
            self.color = input("Enter new color: ")
        elif choice == 3:
            self.not_molting = input("Is molting? (true/false): ").strip().lower() == "true"
        else:
            print("Invalid choice.")

    @staticmethod
    def compute_age_in_months(born_on_date):
        if not born_on_date:
            return 0
        today = date.today()
        diff_in_months = (today.year - born_on_date.year) * 12 + today.month - born_on_date.month
        if today.day < born_on_date.day:
            diff_in_months -= 1
        return diff_in_months

    def get_dict(self):
        """Returns a dictionary representation of the chicken object, suitable for JSON serialization."""
        return {
            'id': self.id,
            'name': self.name,
            'color': self.color,
            'ageInMonths': self.age_in_months,
            'born_on_date': self.born_on_date.strftime("%Y-%m-%d") if self.born_on_date else None,
            'notMolting': self.not_molting
        }
