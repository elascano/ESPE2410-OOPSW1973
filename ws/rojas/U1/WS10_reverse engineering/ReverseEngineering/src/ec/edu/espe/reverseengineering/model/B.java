/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.reverseengineering.model;

import java.util.ArrayList;

/**
 *
 * @author USUARIO
 */
public class B {
    private ArrayList<C> cs;           
    private D d[];

    public B(ArrayList<C> cs, D[] d) {
        this.cs = cs;
        this.d = d;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        String ds="";
        for (D d2 : d) {
            String d1 = null;
            ds = ds + ", " + d1;
        }
        
        return "B{" + "cs=" + cs + ", d=" + d + '}';
    }

    
    
    
    /**
     * @return the cs
     */
    public ArrayList<C> getCs() {
        return cs;
    }

    /**
     * @param cs the cs to set
     */
    public void setCs(ArrayList<C> cs) {
        this.cs = cs;
    }

    /**
     * @return the d
     */
    public D[] getD() {
        return d;
    }

    /**
     * @param d the d to set
     */
    public void setD(D[] d) {
        this.d = d;
    }
    
}

