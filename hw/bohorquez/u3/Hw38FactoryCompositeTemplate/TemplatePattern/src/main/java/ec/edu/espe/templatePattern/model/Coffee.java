package ec.edu.espe.templatePattern.model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 *
 * @author Camila Bohorquez
 */
public class Coffee extends CaffeineBeverage {
    public void brew() {
        System.out.println("Dripping coffee through filter");
    }

    public void addCondiments() {
        System.out.println("Adding sugar and milk.....");
    }

    public boolean wantsCondiments() {
        String answer = getUserInput("Would you like milk and sugar with your coffee (y/n)? ");
        return answer.toLowerCase().startsWith("y");
    }

    private String getUserInput(String prompt) {
        System.out.print(prompt);
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            return in.readLine();
        } catch (IOException e) {
            e.printStackTrace();
            return "no"; 
        }
    }
}