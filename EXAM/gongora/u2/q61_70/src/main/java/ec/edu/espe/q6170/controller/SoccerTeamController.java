package ec.edu.espe.q6170.controller;

import ec.edu.espe.q6170.model.SoccerTeam;
import java.util.ArrayList;
import utils.MongoDbManager;

/**
 *
 * @author Lucas Góngora
 */
public class SoccerTeamController {

    private MongoDbManager database;
    private SoccerTeam soccerTeam;
    private String collection;

    public SoccerTeamController() {
        this.collection = "soccerTeams";
        this.database = new MongoDbManager("Q61_70");
    }
    
    
    
    public ArrayList<SoccerTeam> getSoccerTeams() {
       
        return database.readAllData(collection, SoccerTeam.class);

    }
    public Object[] convertContactToRow(SoccerTeam soccerTeam) {
        return new Object[]{
            soccerTeam.getId(),
            soccerTeam.getName(),
            soccerTeam.getVictories(),
            soccerTeam.getGoals()
        };
    }
    
    
}
