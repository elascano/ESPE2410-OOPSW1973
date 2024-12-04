from model.chicken import Chicken
from utils.file_manager import FileManager

def main():
    print("Gabriel's Chicken Farm Simulator")
    chickens = FileManager.read()
    option = ""

    while option != "5":
        print("\n---- Menu ----")
        print("1. Enter chicken")
        print("2. Read chickens")
        print("3. Update chicken")
        print("4. Delete chicken")
        print("5. Quit")
        option = input("Enter the option: ")

        if option == "1":
            chicken = Chicken()
            chicken.enter_chicken()
            chickens.append(chicken)
            FileManager.save(chickens)
            print(f"Chicken added: {chicken}")
        elif option == "2":
            if not chickens:
                print("No chickens available.")
            else:
                for chicken in chickens:
                    print(chicken)
        elif option == "3":
            chicken_id = input("Enter the ID of the chicken to update: ")
            chicken_to_update = next((c for c in chickens if c.id == int(chicken_id)), None)
            if chicken_to_update:
                chicken_to_update.update_chicken()
                FileManager.save(chickens)
            else:
                print(f"Chicken with ID {chicken_id} not found.")
        elif option == "4":
            chicken_id = input("Enter the ID of the chicken to delete: ")
            chickens = [c for c in chickens if c.id != int(chicken_id)]
            FileManager.save(chickens)
            print(f"Chicken with ID {chicken_id} deleted.")
        elif option == "5":
            FileManager.save(chickens)
            print("Saving data and exiting...")
        else:
            print("Invalid option. Please try again.")

if __name__ == "__main__":
    main()
