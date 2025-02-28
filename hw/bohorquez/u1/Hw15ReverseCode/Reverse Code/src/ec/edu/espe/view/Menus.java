package ec.edu.espe.view;

/**
 *
 * @author Camila Bohorquez
 */
public class Menus{
    private String[] opciones;

   
    public Menus(String[] opciones) {
        this.opciones = opciones;
    }

    
    public String[] getOpciones() {
        return opciones;
    }

    public void setOpciones(String[] opciones) {
        this.opciones = opciones;
    }

   
    @Override
    public String toString() {
        StringBuilder menu = new StringBuilder("--- MENU ---\n");
        for (int i = 0; i < opciones.length; i++) {
            menu.append(i).append(1).append(". ").append(opciones[i]).append("\n");
        }
        return menu.toString();
    }
}

