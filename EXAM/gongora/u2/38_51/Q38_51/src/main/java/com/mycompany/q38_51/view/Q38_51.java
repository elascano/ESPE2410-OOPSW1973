package com.mycompany.q38_51.view;

import com.mycompany.q38_51.model.A;
import com.mycompany.q38_51.model.B;
import com.mycompany.q38_51.model.C;
import com.mycompany.q38_51.model.D;
import com.mycompany.q38_51.model.E;
import com.mycompany.q38_51.model.F;
import com.mycompany.q38_51.model.G;
import com.mycompany.q38_51.model.H;
import com.mycompany.q38_51.model.J;
import java.util.ArrayList;

/**
 *
 * @author Lucas Góngora
 */
public class Q38_51 {

    public static void main(String[] args) {
        A a;
        B b;
        C c;
        D d;
        E e;
        F f;
        G g;
        H h;
        J j;

        a = new A(new ArrayList<A>());
        b = new B(new ArrayList<H>(), new ArrayList<A>());
        c = new C(new ArrayList<E>(), new ArrayList<A>());
        d = new D(new E[5], new ArrayList<F>());
        e = new E();
        f = new F();
        g = new G();
        h = new G();
        j = new J();

        System.out.println("A ->" + a);
        System.out.println("B ->" + b);
        System.out.println("C ->" + c);
        System.out.println("D ->" + d);
        System.out.println("E->" + e);
        System.out.println("F ->" + f);
        System.out.println("G ->" + g);
        System.out.println("H ->" + h);
        System.out.println("J ->" + j);
        g.m(j);
    }
}
