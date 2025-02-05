package ec.edu.espe.q3851.model;

import ec.edu.espe.q3851.view.H;

public class G extends H{
    J j;

    public G(J j) {
        this.j = j;
    }
    
    public void m(J j){
        System.out.println("G, using J");
    }

    @Override
    public String toString() {
        return "G" + "associated" + j;
    }  
    
    @Override
    public void toImplement() {
        System.out.println("G implements H");
    }
}
