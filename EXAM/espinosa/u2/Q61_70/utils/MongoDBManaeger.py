from pymongo import MongoClient

client = MongoClient("mongodb+srv://andespinosa18:andespinosa18@cluster0.grell.mongodb.net/")
db = client['Exam']
collection = db['SoccerPlayer']

def find_player_by_id(player_id):
    result = collection.find_one({"id": player_id})
    if result:
        return result
    else:
        return f"No player found with ID: {player_id}"

