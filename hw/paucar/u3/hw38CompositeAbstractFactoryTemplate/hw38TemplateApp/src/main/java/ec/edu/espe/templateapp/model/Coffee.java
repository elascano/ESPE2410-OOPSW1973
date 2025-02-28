package ec.edu.espe.templateapp.model;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Dennis Paucar
 */
public class Coffee extends CaffeineBeverage{

    @Override
    void brew() {
        System.out.println("Dripping coffe through filter");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding sugar and milk");
    }
    
    public boolean wantsCondiments(){
        String answer = getUserInput();
        if(answer.toLowerCase().startsWith("y")){
            return true;
        }else{
            return false;
        }
    }
    
    private String getUserInput() {
        String answer = null;
        System.out.println("Would you like milk and sugar with your coffee (y/n)?");

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = in.readLine(); 
        } catch (Exception e) {
            System.err.println("Error reading input: " + e.getMessage());
        }

        return (answer != null) ? answer : ""; 
    }

    
}
