public class Patient {
    private String nom;
    private int numSecurite;
    private String raison;
    private Lit lit;
    private Chambre chambreVoulue;

    public Patient(String nom, int numSecurite, String raison, Chambre chambreVoulue) {
        this.nom = nom;
        this.numSecurite = numSecurite;
        this.raison = raison;
        this.chambreVoulue=chambreVoulue;
    }

    public Chambre getChambreVoulue() {
        return chambreVoulue;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNumSecurite() {
        return numSecurite;
    }

    public void setNumSecurite(int numSecurite) {
        this.numSecurite = numSecurite;
    }

    public String getRaison() {
        return raison;
    }

    public void setRaison(String raison) {
        this.raison = raison;
    }

    public Lit getLit() {
        return lit;
    }

    public void setLit(Lit lit) {
        this.lit = lit;
    }
}
