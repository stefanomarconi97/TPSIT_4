
package corsa;

import java.applet.*;
import javax.swing.JApplet;
import java.applet.Applet;

/**
 * Corsa contiene il man
 * @author Stefano Marconi
 */
public class Corsa extends JApplet {

    public static void main(String[] args) {
        Pista p = new Pista();
        p.setVisible(true);
        p.setLocationRelativeTo(null);
    }
    
}
