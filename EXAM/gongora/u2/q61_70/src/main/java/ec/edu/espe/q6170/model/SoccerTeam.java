package ec.edu.espe.q6170.model;

/**
 *
 * @author Lucas Góngora
 */
public class SoccerTeam {
    private String id;
    private String name;
    private int goals;
    private int victories;

    public SoccerTeam(String id, String name, int goals, int victories) {
        this.id = id;
        this.name = name;
        this.goals = goals;
        this.victories = victories; 
    }
    
    

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the goals
     */
    public int getGoals() {
        return goals;
    }

    /**
     * @param goals the goals to set
     */
    public void setGoals(int goals) {
        this.goals = goals;
    }

    

    /**
     * @return the victories
     */
    public int getVictories() {
        return victories;
    }

    /**
     * @param victories the victories to set
     */
    public void setVictories(int victories) {
        this.victories = victories;
    }
    
}
