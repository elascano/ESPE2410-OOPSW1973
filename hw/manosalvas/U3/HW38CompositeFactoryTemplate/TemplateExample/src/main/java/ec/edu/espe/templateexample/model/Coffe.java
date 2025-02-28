package ec.edu.espe.templateexample.model;


import ec.edu.espe.templateexample.model.CaffeineBeverage;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 *
 * @author Gabriel Manosalvas
 */
public class Coffe extends CaffeineBeverage{
    public void brew(){System.out.println("Dripping coffe through filter");}
    public void addCondiments(){System.out.println("Adding sugar and milk");}
    
    public boolean wantsCondiments(){ //a hook operation
        String answer = getUserInput();
        if(answer.toLowerCase().startsWith("y")){return true;}
        else{return false;}
    }
    
    private String getUserInput(){
        String answer = null;
        System.out.println("Would you like milk and sugar (y/n)?");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try{
           answer = in.readLine();
        }catch(IOException e){
            System.out.println("Error reading input: "+ e.getMessage());
        }
        return answer;
        
    }
}
