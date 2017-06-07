
package corsa;

/**
 * Giudice è la classe che determina il vincitore
 * @author Andrea Vallorani
 */
public class Giudice extends Thread{
    
    private Pista pista;
    private String vincitore = "";
    private boolean flag = true;
    private String atleti = "";
    private String[] classifica;
    public Giudice(Pista p){
        this.pista = p;
    }
    
    public void run(){
        Atleta a1 = new Atleta(this.pista.name1,this.pista.icoAtleta1,this);                                    
        Atleta a2 = new Atleta(this.pista.name2,this.pista.icoAtleta2,this);
        Atleta a3 = new Atleta(this.pista.name3,this.pista.icoAtleta3,this);
        Atleta a4 = new Atleta(this.pista.name4,this.pista.icoAtleta4,this);
        a1.start();
        a2.start();
        a3.start();
        a4.start();
        this.pista.statoGara.setText("Gara iniziata");
        try{
            a1.join();
            a2.join();
            a3.join();
            a4.join();
        }
        catch(Exception e){
            
        }
        this.pista.statoGara.setText("Gara conclusa, ha vinto "+this.getVincitore());
        setClassifica();
        this.pista.s1.setEnabled(true);
        pista.ButtonReset.setEnabled(true);
        pista.rename.setEnabled(true);
        pista.jTextField1.setEnabled(true);
        pista.jTextField2.setEnabled(true);
        pista.jTextField3.setEnabled(true);
        pista.jTextField4.setEnabled(true);
    }
    
    synchronized public void hoFinito(String nomeAtleta){
        if(this.vincitore==""){
            this.vincitore = nomeAtleta;
        }
        atleti += nomeAtleta+";";
        classifica = atleti.split(";");
        System.out.println(atleti);
        System.out.println(classifica[1]);
        /*else{
            i++;
            this.classifica[i] = nomeAtleta;
            
            System.out.println(i);
        }
        if(this.classifica[i].compareTo("") != 0){
            i++;
            this.classifica[i] = nomeAtleta;
        }*/
    }
    
    public String getVincitore(){
        return this.vincitore;
    }
    public void setClassifica(){
        this.pista.primo.setText("1. "+this.classifica[0]);
        this.pista.secondo.setText(" 2. "+this.classifica[1]);
        this.pista.terzo.setText("  3. "+this.classifica[2]);
        this.pista.quarto.setText("   4. "+this.classifica[3]);
    }
}
