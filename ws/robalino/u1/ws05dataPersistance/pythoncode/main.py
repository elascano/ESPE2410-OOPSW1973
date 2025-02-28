# File: main.py
from data_manager import DataManager
from person import Person


def get_valid_integer(prompt: str) -> int:
    """
    Prompts the user for an integer input and validates it.
    Repeats until a valid integer is entered.
    """
    while True:
        try:
            return int(input(prompt))
        except ValueError:
            print("Invalid input. Please enter a valid integer.")


def get_person_from_console():
    """
    Collects and returns a Person object with validated inputs for ID and Age.
    """
    person_id = get_valid_integer("Enter ID: ")
    name = input("Enter Name: ")
    age = get_valid_integer("Enter Age: ")
    return Person(person_id, name, age)


def main():
    """
    The main menu and logic for the Data Manager application.
    """
    data_manager = DataManager("people.json")

    while True:
        print("\n=== Data Manager ===")
        print("1. Add a Person")
        print("2. Update a Person")
        print("3. Delete a Person")
        print("4. View All People")
        print("5. Search for a Person by ID")
        print("6. Exit")

        try:
            choice = get_valid_integer("Choose an option: ")
        except ValueError:
            print("Invalid input. Please enter a number between 1 and 6.")
            continue

        if choice == 1:
            person = get_person_from_console()
            data_manager.add_person(person)
            print("Person added successfully.")
        elif choice == 2:
            person_id = get_valid_integer("Enter the ID of the person to update: ")
            updated_person = get_person_from_console()
            data_manager.update_person(person_id, updated_person)
            print("Person updated successfully.")
        elif choice == 3:
            person_id = get_valid_integer("Enter the ID of the person to delete: ")
            data_manager.delete_person(person_id)
            print("Person deleted successfully.")
        elif choice == 4:
            print("All People:")
            for person in data_manager.get_all_people():
                print(person)
        elif choice == 5:
            person_id = get_valid_integer("Enter the ID of the person to search: ")
            person = data_manager.search_by_id(person_id)
            if person:
                print(f"Person Found: {person}")
            else:
                print(f"No person found with ID: {person_id}")
        elif choice == 6:
            print("Exiting... Goodbye!")
            break
        else:
            print("Invalid choice. Please enter a number between 1 and 6.")


if __name__ == "__main__":
    main()
