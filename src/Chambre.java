import java.util.ArrayList;

public class Chambre {
    private int nbLit;
    private int numero;
    private ArrayList<Lit> lits;

    public Chambre( int numero, ArrayList<Lit> lits) {
        this.numero = numero;
        this.lits = lits;
        nbLit=lits.size();
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
}
