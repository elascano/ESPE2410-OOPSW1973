/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package scissorsobject;

import ec.edu.espe.scissorsObject.model.ReadFromFile;
import ec.edu.espe.scissorsObject.model.SaveToFile;
import ec.edu.espe.scissorsObject.model.Scissors;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lisbeth Tipan
 */
public class ScissorsObject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String fileName = "scissors.bin";
        List<Scissors> scissorList = new ArrayList<>();  

        
        scissorList.add(new Scissors("Fabric Cutting", "Stainless Steel", 15.5));
        scissorList.add(new Scissors("Paper Cutting", "Plastic", 12.0));
        scissorList.add(new Scissors("Gardening", "Carbon Steel", 25.0));

       
        SaveToFile.save(fileName, scissorList);

  
        List<Scissors> loadedScissors = ReadFromFile.read(fileName);

     
        System.out.println("Scissors loaded from file:");
        for (Scissors scissor : loadedScissors) {
            System.out.println(scissor);
        }
    }
}
    

