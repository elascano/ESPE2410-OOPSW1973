package ec.edu.espe.templateexample.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author David Pilatasig
 */
public class Coffee extends CaffeineBeverage{

    @Override
    public void brew() {
        System.out.println("Dripping coffee through filter");
    }

    @Override
    public void addCondiments() {
        System.out.println("Adding sugar and milk");
    }
    
    public boolean wantsCondiments(){
        String answer= getUserInput();
        if(answer.toLowerCase().startsWith("y")){
            return true;
        }
        else if(answer.toLowerCase().startsWith("n"))
            return false;
        else{
            System.out.println("no valid Input, default anser (no)");
            return false;
        }
    }
    
    private String getUserInput(){
    
    String answer= null;
        boolean isVerify= false;
        do{
        System.out.println("Would you like milk and suggar with your coffe (y/n)?");
        BufferedReader in= new BufferedReader(new InputStreamReader(System.in));
            try{
                answer= in.readLine().trim();
                isVerify=true;
            }catch(IOException e){
                System.out.println("No valid input");
            }
        }while(!isVerify);
        
        return answer;
    }
    
}
