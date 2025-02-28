from model.chicken import Chicken
from utils.file_manager import FileManager

def main():
    print("Gabriel's Chicken Farm Simulator")
    chickens = FileManager.read()
    
    while True:
        print("\n---- Menu ----")
        print("1.- Enter chicken")
        print("2.- Read chicken")
        print("3.- Update chicken")
        print("4.- Delete chicken")
        print("5.- Quit")
        opcion = input("Enter the option: ")
        
        if opcion == '1':
            chicken = Chicken()
            chicken.enter_chicken()
            chickens.append(chicken)
            FileManager.save(chickens)
            print(f"Chicken added: {chicken}")
        
        elif opcion == '2':
            print("Listing all chickens:")
            if not chickens:
                print("No chickens available.")
            else:
                for chicken in chickens:
                    print(chicken)
        
        elif opcion == '3':
            print("Updating chicken...")
            up_id = int(input("Enter ID of a chicken to update: "))
            chicken_to_update = next((chicken for chicken in chickens if chicken.id == up_id), None)
            if chicken_to_update:
                chicken_to_update.update_chicken()
                FileManager.save(chickens)
            else:
                print("Chicken with ID not found.")
        
        elif opcion == '4':
            print("Deleting chicken...")
            delete_id = int(input("Enter ID of a chicken to delete: "))
            chickens = [chicken for chicken in chickens if chicken.id != delete_id]
            FileManager.save(chickens)
        
        elif opcion == '5':
            FileManager.save(chickens)
            print("Saving data and exiting...")
            break
        
        else:
            print("Invalid option. Please try again.")

if __name__ == "__main__":
    main()
