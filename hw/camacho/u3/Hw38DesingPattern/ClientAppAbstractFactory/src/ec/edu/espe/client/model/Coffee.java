package ec.edu.espe.client.model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author mateo
 */
public class Coffee extends CaffeineBeverage {
    
    @Override
    public void brew(){
        System.out.println("Dripping coffee through filter...");
    }
    
    @Override
    public void addCondiments(){
        System.out.println("Adding sugar and milk...");
    }
    
    @Override
    public boolean wantsCondiments(){
        String answer = getUserInput();
        return answer.toLowerCase().startsWith("y");
    }
    
    private String getUserInput(){
        System.out.println("Would you like milk and sugar in your coffee? (y/n): ");
        
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String answer = "";
        
        try {
            answer = in.readLine();
        } catch (IOException e) {
            System.err.println("Error reading input.");
        }
        
        return answer;
    }
}
