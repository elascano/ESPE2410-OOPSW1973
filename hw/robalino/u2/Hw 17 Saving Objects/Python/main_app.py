from sd_card_manager import SDCardManager
from sd_card import SDCard


def main():
    manager = SDCardManager()

    while True:
        try:
            print("\nSD Card CRUD Operations:")
            print("1. Add SD Card")
            print("2. View All SD Cards")
            print("3. Update SD Card")
            print("4. Delete SD Card")
            print("5. Exit")

            choice = int(input("Select an option: "))

            if choice == 1:
                add_sd_card(manager)
            elif choice == 2:
                view_all_sd_cards(manager)
            elif choice == 3:
                update_sd_card(manager)
            elif choice == 4:
                delete_sd_card(manager)
            elif choice == 5:
                print("Exiting program. Goodbye!")
                break
            else:
                print("Invalid choice. Please select a number between 1 and 5.")

        except ValueError:
            print("Invalid input. Please enter a valid number.")
        except Exception as error:
            print(f"Error: {error}")


def add_sd_card(manager):
    try:
        card_id = int(input("Enter ID: "))
        brand = input("Enter Brand: ")
        storage = int(input("Enter Storage (GB): "))
        price = float(input("Enter Price ($): "))

        sd_card = SDCard(card_id, brand, storage, price)
        manager.add_sd_card(sd_card)
    except ValueError:
        print("Invalid input. Please enter valid data types for ID, Storage, or Price.")


def view_all_sd_cards(manager):
    sd_cards = manager.view_all_sd_cards()
    if not sd_cards:
        print("No SD Cards found.")
    else:
        print("\nList of SD Cards:")
        for sd_card in sd_cards:
            print(sd_card)


def update_sd_card(manager):
    try:
        card_id = int(input("Enter ID of the SD Card to update: "))
        new_brand = input("Enter new Brand: ")
        new_storage = int(input("Enter new Storage (GB): "))
        new_price = float(input("Enter new Price ($): "))

        manager.update_sd_card(card_id, new_brand, new_storage, new_price)
    except ValueError as error:
        print(f"Error: {error}")


def delete_sd_card(manager):
    try:
        card_id = int(input("Enter ID of the SD Card to delete: "))
        manager.delete_sd_card(card_id)
    except ValueError as error:
        print(f"Error: {error}")


if __name__ == "__main__":
    main()
