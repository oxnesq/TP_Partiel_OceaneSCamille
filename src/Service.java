import java.util.ArrayList;

public class Service {
    private String nom;
    private int numero;
    private int nbChambreSimple;

    private int nbChambreDouble;
    private ArrayList<Chambre> chambres ;
    private String typeLit;
    private final int nbMax=99;

    public Service(String nom, int numero, int nbChambreSimple, int nbChambreDouble, String typeLit) {
        this.nom = nom;
        this.numero = numero;
        this.nbChambreSimple = nbChambreSimple;
        this.nbChambreDouble = nbChambreDouble;


        this.chambres = new ArrayList<Chambre>();
        for (int i=0; i<nbChambreSimple; i++){
            ArrayList<Lit> lits = new ArrayList<Lit>();
            lits.add(creationLit());
            Chambre chambre = new Chambre(this, lits);
        }

        for (int i=0; i<nbChambreDouble; i++){
           ArrayList<Lit> lits = new ArrayList<Lit>();
            lits.add(creationLit());
            Chambre chambre = new Chambre(this, lits);
        }
    }

    public Lit creationLit(){
        Lit l = new Lit(true,0,0);
        if (typeLit.equals("Ambulatoire")){
            l = new LitAmbulatoire(true);
        } else if (typeLit.equals("MoyenSejour")) {
            l = new LitMoyenSejour(true);
        } else if (typeLit.equals("LongSejour")){
            l = new LitLongSejour(true);
        }
        return l;
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
