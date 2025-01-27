/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.antsimulator.model;

import java.util.ArrayList;

/**
 *
 * @author Matias Rojas
 */
public class Cell {
    int col;
    int row;

    public Cell(int col, int row) {
        this.col = col;
        this.row = row;
    }
    
    
    
    public void recivePheromone(PheromoneDrop pheromoneDrop){
        System.out.println(" the cell is reciving a pheromone drop..");
    }
    
    public ArrayList<Ant> getAnts(){
        
        return new ArrayList<Ant>();
    }
}
