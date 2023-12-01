public class Patient {
    private String nom;
    private int numSecurite;
    private String raison;
    private Lit lit;

    public Patient(String nom, int numSecurite, String raison, Lit lit) {
        this.nom = nom;
        this.numSecurite = numSecurite;
        this.raison = raison;
    }
}
