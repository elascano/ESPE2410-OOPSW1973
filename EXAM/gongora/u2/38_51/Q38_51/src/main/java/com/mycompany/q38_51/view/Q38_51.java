
package com.mycompany.q38_51.view;

import com.mycompany.q38_51.model.A;
import com.mycompany.q38_51.model.B;
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
        B b;
        H h;
        G g;
        J j;
        h = new G();
        b = new B(h,new ArrayList<A>());
        g = new G();
        j = new J();
        g.methodUseJ(j);
        
        
        
    }
}
