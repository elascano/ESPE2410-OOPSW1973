<<<<<<< HEAD
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.q38.model;

import java.util.ArrayList;

/**
 *
 * @author Lisbeth Tipan
 */
public class B extends A {
    private ArrayList<H> h;

    public B(){
        
    }
    
    public B(ArrayList<H> h, A a) {
        super(a);
        this.h = h;
    }
    
    @Override
    public String toString() {
        return "B{" + "h=" + h + '}';
    }

    
    
    /**
     * @return the h
     */
    public ArrayList<H> getH() {
        return h;
    }

    /**
     * @param h the h to set
     */
    public void setH(ArrayList<H> h) {
        this.h = h;
    }

    
}
=======
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.q38.model;

import java.util.ArrayList;

/**
 *
 * @author Lisbeth Tipan
 */
public class B extends A {
    private ArrayList<H> h;

    public B(){
        
    }
    
    public B(ArrayList<H> h, A a) {
        super(a);
        this.h = h;
    }
    
    @Override
    public String toString() {
        return "B{" + "h=" + h + '}';
    }

    
    
    /**
     * @return the h
     */
    public ArrayList<H> getH() {
        return h;
    }

    /**
     * @param h the h to set
     */
    public void setH(ArrayList<H> h) {
        this.h = h;
    }

    
}
>>>>>>> d51cd0def6d5d8cb8c771a77567836ee1c185734
