import java.util.ArrayList;

public class Chambre {
    private int nbLit;
    private int numero;
    private static int num;
    private ArrayList<Lit> lits;

    public Chambre(Service service, ArrayList<Lit> lits) {
        this.lits = lits;
        nbLit=lits.size();
        this.numero= service.getNumero()*100 + num;
        num+=1;
    }

    public Chambre() {
    }

    public int getNbLit() {
        return nbLit;
    }

    public void setNbLit(int nbLit) {
        this.nbLit = nbLit;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public ArrayList<Lit> getLits() {
        return lits;
    }

    public void setLits(ArrayList<Lit> lits) {
        this.lits = lits;
    }

    public String type(){
        String type=null;
        if (nbLit==1){
            type="simple";
        } else{
            type="double";
        }
         return type;
    }
}
