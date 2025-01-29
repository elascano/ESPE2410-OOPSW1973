package com.mycompany.q38_51.model;

import java.util.ArrayList;

/**
 *
 * @author Lucas Góngora
 */
public class D {
    private E[] es = new E[5];
    private ArrayList<F> fs;

    public D(E[] es,ArrayList<F> fs) {
        this.es = es;
        this.fs = fs;
    }
    
    

    /**
     * @return the es
     */
    public E[] getEs() {
        return es;
    }

    /**
     * @param es the es to set
     */
    public void setEs(E[] es) {
        this.es = es;
    }

    /**
     * @return the fs
     */
    public ArrayList<F> getFs() {
        return fs;
    }

    /**
     * @param fs the fs to set
     */
    public void setFs(ArrayList<F> fs) {
        this.fs = fs;
    }
    
    
    
}
