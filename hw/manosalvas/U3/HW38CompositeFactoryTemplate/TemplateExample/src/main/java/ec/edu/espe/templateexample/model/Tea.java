
package ec.edu.espe.templateexample.model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Gabriel Manosalvas
 */
public class Tea extends CaffeineBeverage{

    @Override
    public void brew() {
        System.out.println("Steep the tea.");
    }

    @Override
    public void addCondiments() {
        System.out.println("Adding lemon."); 
    }
    
    public boolean wantsCondiments(){ //a hook operation
        String answer = getUserInput();
        if(answer.toLowerCase().startsWith("y")){return true;}
        else{return false;}
    }
    
    private String getUserInput(){
        String answer = null;
        System.out.println("Would you like lemon on your tea (y/n)?");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try{
            answer = in.readLine();
        }catch(IOException e){
            System.out.println("Error reading input: "+ e.getMessage());
        }
        return answer;
    }
}
