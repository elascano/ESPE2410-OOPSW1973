import model.Soccer_player as Player

class Soccer_player_Controller:

    def goals_per_match(self, goals, number_of_matches_played):

        GoalsPerMatch = goals + number_of_matches_played

        return GoalsPerMatch
    
    def search_soccer_player(self,id):
        
        return NotImplementedError
        
        
        