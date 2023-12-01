import java.util.ArrayList;

public class Service {
    private String nom;
    private int numero;
    private int nbChambreSimple;

    private int nbChambreDouble;
    private ArrayList<Chambre> chambres ;
    private String typeLit;
    private final int nbMax=99;

    public Service(String nom, int numero, int nbChambreSimple, int nbChambreDouble, String typeLit) throws HopitalException{
        this.nom = nom;
        this.numero = numero;
        if (nbChambreSimple+nbChambreDouble<100){
            this.nbChambreSimple = nbChambreSimple;
            this.nbChambreDouble = nbChambreDouble;
        }else{
            throw new HopitalException("trop de lit");
        }

        this.typeLit=typeLit;

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
        Lit l =new Lit(true, 0, 0);
        l = switch (typeLit) {
            case "Ambulatoire" -> new LitAmbulatoire(true);
            case "MoyenSejour" -> new LitMoyenSejour(true);
            case "LongSejour" -> new LitLongSejour(true);
            default -> throw new IllegalStateException("Unexpected value: " + typeLit);
        };
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

    public int nbChambreTot() {
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
