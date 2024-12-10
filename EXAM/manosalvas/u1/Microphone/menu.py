from microphone import Microphone
from file_handler import save_to_file, load_from_file

def add_microphone(microphones):
    id = input("Enter ID: ")
    brand = input("Enter Brand: ")
    model = input("Enter Model: ")
    price = float(input("Enter Price: "))
    microphone = Microphone(id, brand, model, price)
    microphones.append(microphone)
    print("Microphone added ")

def show_menu():
    microphones = load_from_file()

    while True:
        print("\n1. Add Microphone")
        print("2. Save to JSON File")
        print("3. Load from JSON File")
        print("4. Exit")
        option = input("Choose an option: ")

        if option == '1':
            add_microphone(microphones)
        elif option == '2':
            save_to_file(microphones)
        elif option == '3':
            microphones = load_from_file()
            for mic in microphones:
                print(mic.to_dict())
        elif option == '4':
            print("Your Welcome")
            break
        else:
            print("Invalid option. Try again.")
