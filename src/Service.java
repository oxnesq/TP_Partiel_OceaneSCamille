public class Service {
    private String nom;
    private int numero;
    private int nbChambreSimple;

    private int nbChambreDouble;
    private final int nbMax=99;

    public Service(String nom, int numero, int nbChambreSimple, int nbChambreDouble) {
        this.nom = nom;
        this.numero = numero;
        this.nbChambreSimple = nbChambreSimple;
        this.nbChambreDouble = nbChambreDouble;
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
}
