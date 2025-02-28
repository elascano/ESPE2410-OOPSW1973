package ec.edu.espe.templatePattern.model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 *
 * @author Lisbeth Tipan
 */


public class Tea extends CaffeineBeverage {
    public void brew() {
        System.out.println("Steeping the tea");
    }

    public void addCondiments() {
        System.out.println("Adding lemon.....");
    }

    public boolean wantsCondiments() {
        String answer = getUserInput("Would you like lemon with your tea (y/n)? ");
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