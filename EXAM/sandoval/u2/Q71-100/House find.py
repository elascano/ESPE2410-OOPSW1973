from pymongo import MongoClient
from bson import ObjectId


client = MongoClient('mongodb+srv://aesandoval:aesandoval@cluster0.5z3gp.mongodb.net/')
db = client['Examn2']
collection = db['houses']


def save_house_with_custom_id(house_data, custom_id):
    try:
        custom_id = str(custom_id)  
        
        
        house_data["_id"] = custom_id
        
        
        result = collection.insert_one(house_data)
        return f"House saved with custom ID: {result.inserted_id}"
    except Exception as e:
        return f"Error saving the house with custom ID: {e}"

def search_house_by_id(house_id):
    try:
        
        house = collection.find_one({"_id": house_id})
        if house:
            return house
        else:
            return "House not found"
    except Exception as e:
        return f"Error searching for the house: {e}"


house_data = {
    "address": "1234 Elm Street",
    "price": 250000,
    "size": 1500  
}

save_response = save_house_with_custom_id(house_data, 1)
print(save_response)


id_to_search = input("Enter the ID of the house to search for: ")
house = search_house_by_id(id_to_search)
print(house)
