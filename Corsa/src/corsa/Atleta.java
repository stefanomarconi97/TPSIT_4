
package corsa;

import static java.lang.System.console;

/**
 * Atleta è il thread che partecipa alla gara
 * @author Andrea Vallorani
 */
public class Atleta extends Thread{
    
    private javax.swing.JLabel nome;
    private javax.swing.JLabel label;
    private Giudice giudice;
    private String atleta;
    public Atleta(javax.swing.JLabel n,javax.swing.JLabel l,Giudice g){
        this.nome = n;
        this.label = l;
        this.giudice = g;
        atleta = this.nome.getText();
    }
    
    public void run(){
        int pos = this.label.getX();
        int posn = this.nome.getX();
        int n;
        while(pos<700){
            //genero un numero casuale da 0 a 20
            n = (int)(Math.random() * 20);
            //sposto l'atleta in base al numero generato
            pos = this.label.getX()+n;
            posn = this.nome.getX() + n;
            this.label.setLocation(pos,this.label.getY());
            this.nome.setLocation(posn,this.nome.getY());
            //prima di un nuovo spostamento il thread aspetta 100 millisecondi
            try{
               Thread.sleep(100);
            }
            catch(Exception e){
               
            }
        }
        this.giudice.hoFinito(this.atleta);
    }
}
