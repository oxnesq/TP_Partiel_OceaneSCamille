public class Patient {
    private String nom;
    private int numSecurite;
    private String raison;
    private Lit lit;

    public Patient(String nom, int numSecurite, String raison, Chambre chambre) {
        this.nom = nom;
        this.numSecurite = numSecurite;
        this.raison = raison;
    }

    public Service serviceRaison(){
        s = switch (s.getTypeLit()) {
            case "Ambulatoire" ->
            default -> throw new IllegalStateException("Unexpected value: ");
        };
        return s;
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
