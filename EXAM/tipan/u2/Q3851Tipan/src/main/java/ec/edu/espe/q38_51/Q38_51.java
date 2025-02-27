/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package ec.edu.espe.q38_51;

import ec.edu.espe.q38.model.*;
import static ec.edu.espe.q38.model.G.useJ;

/**
 *
 * @author Lisbeth Tipan
 */
public class Q38_51 {

    public static void main(String[] args) {
        
        A a = new A(new A());
        B b = new B();
        C c = new C();
        D d = new D();
        E e = null;
        F f;
        G g;
        H h = null;
        J j = null;
        
        System.out.println("A -->" + a);
        System.out.println("B-->" + d);
        System.out.println("C --->" + c);
        System.out.println("D --->" + d);
        System.out.println("F --->" + e);
        System.out.println("G --->" + d);
        System.out.println("J --->" + j);
    }
}
