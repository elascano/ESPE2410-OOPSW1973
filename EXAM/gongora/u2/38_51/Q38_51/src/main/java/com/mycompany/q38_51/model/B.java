package com.mycompany.q38_51.model;

import java.util.ArrayList;

/**
 *
 * @author Lucas Góngora
 */
public class B extends A{
    private ArrayList<H>  hs;

    public B(ArrayList<H> hs, ArrayList<A> as) {
        super(as);
        this.hs = hs;
    }
    
    

    /**
     * @return the h
     */
    public ArrayList<H> getH() {
        return hs;
    }

    /**
     * @param h the h to set
     */
    public void setH(ArrayList<H> hs) {
        this.hs = hs;
    }
    
}
