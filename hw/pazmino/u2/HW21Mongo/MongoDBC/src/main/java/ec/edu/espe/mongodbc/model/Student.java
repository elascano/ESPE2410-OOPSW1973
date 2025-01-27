package model;

public class Student {
    private String id;
    private String name;
    private String signature;
    private String career;

 
    public Student(String id, String name, String signature, String career) {
        this.id = id;
        this.name = name;
        this.signature = signature;
        this.career = career;
    }

    // Getters y Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public String getCareer() {
        return career;
    }

    public void setCareer(String career) {
        this.career = career;
    }
}
