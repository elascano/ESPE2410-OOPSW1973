package ec.edu.espe.readandaddobjects.model;

import java.io.Serializable;
import java.util.Objects;

public class Goalkeeper implements Serializable {
    private String name;
    private String team;
    private String idCard;
    private int age;

    public Goalkeeper(String name, String team, String idCard, int age) {
        this.name = name;
        this.team = team;
        this.idCard = idCard;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Goalkeeper that = (Goalkeeper) obj;
        return Objects.equals(idCard, that.idCard); // Comparar solo IDCard
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCard);
    }

    @Override
    public String toString() {
        return "Goalkeeper{\n" +
               "Name: " + name + "\n" +
               "Team: " + team + "\n" +
               "IDCard: " + idCard + "\n" +
               "Age:" + age + "\n}";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    
}

