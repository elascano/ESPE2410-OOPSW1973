package com.mycompany.q38_51.model;

import java.util.ArrayList;

/**
 *
 * @author Lucas Góngora
 */
public class B extends A{
    private H h;

    public B(H h, ArrayList<A> as) {
        super(as);
        this.h = h;
    }
    
    

    /**
     * @return the h
     */
    public H getH() {
        return h;
    }

    /**
     * @param h the h to set
     */
    public void setH(H h) {
        this.h = h;
    }
    
}
