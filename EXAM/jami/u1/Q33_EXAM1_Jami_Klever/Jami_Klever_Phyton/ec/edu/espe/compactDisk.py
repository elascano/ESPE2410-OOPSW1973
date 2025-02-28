import json
class compactDisk:
     def __init__(id, wizer, capacity):
        self.id = id

    def __str__(id):
        return f"id: {self.id}"
        
    def __str__(wizer):
        return f"wizer: {self.wizer}"

    def __str__(capacity):
        return f"capacity: {self.capacity}"
    
def save(data, file_name, format):
    
    elif format.lower() == "json":
        save_to_json(data, file_name + ".json")
    else:
        print(f"Unsupported format: {format}")


def save_to_json(data, file_name):
    try:
        with open(file_name, mode='w') as file:
            json_data = {"data": data}
            json.dump(json_data, file)
            print(f"Data saved to JSON: {file_name}")
    except Exception as e:
        print(f"Error saving to JSON: {e}")



    
