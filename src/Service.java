import java.util.ArrayList;

public class Service {
    private String nom;
    private int numero;
    private int nbChambreSimple;

    private int nbChambreDouble;
    private ArrayList<Chambre> chambres ;
    private String typeLit;
    private final int nbMax=99;

    public Service(String nom, int numero, int nbChambreSimple, int nbChambreDouble, String typeLits) {
        this.nom = nom;
        this.numero = numero;
        this.nbChambreSimple = nbChambreSimple;
        this.nbChambreDouble = nbChambreDouble;


        this.chambres = new ArrayList<Chambre>();
        for (int i=0; i<nbChambreSimple; i++){
            if (typeLits.equals("Ambulatoire")){
                LitAmbulatoire lit = new LitAmbulatoire(true);
            }
            ArrayList<Lit> lits = new ArrayList<Lit>();
            Chambre chambre = new Chambre(this, lits);
        }

        for (int i=0; i<nbChambreDouble; i++){
            if (typeLits.equals("Ambulatoire")){
                LitAmbulatoire lit = new LitAmbulatoire(true);
            }
            ArrayList<Lit> lits = new ArrayList<Lit>();
            Chambre chambre = new Chambre(this, lits);
        }
    }

    public String getNom(){
        return nom;
    }

    public int getNumero() {
        return numero;
    }

    public int getNbChambreSimple() {
        return nbChambreSimple;
    }

    public int getNbChambreDouble() {
        return nbChambreDouble;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setNbChambreSimple(int nbChambreSimple) {
        this.nbChambreSimple = nbChambreSimple;
    }

    public void setNbChambreDouble(int nbChambreDouble) {
        this.nbChambreDouble = nbChambreDouble;
    }

    public int nbChambreTot(){
        return nbChambreSimple+nbChambreDouble;
    }

    @Override
    public String toString() {
        return "Service{" +
                "nom='" + nom + '\'' +
                ", numero=" + numero +
                '}';
    }
}
