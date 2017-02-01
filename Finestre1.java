/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package finestre1;
import java.util.Scanner;
/**
 *
 * @author Studente
 */
public class Finestre1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Inserisci numero di finestre da ripetere");
        int n = input.nextInt();
        for(int i = 0; i < n; i++){
        Finestra f;
        f = new Finestra();
        f.testo.setText("Sono la finestra "+i);
        f.setVisible(true);
        }
    }
    
}
