
public class AdmissionSortie {
    private Patient patient;
    private int numeroChambre;
    private Lit lit;
    private Long heureArrivee;

    public AdmissionSortie(Patient patient, int numeroChambre, Lit lit) {
        this.patient=patient;
        this.numeroChambre = numeroChambre;
        this.lit = lit;
        this.heureArrivee=System.currentTimeMillis();
    }


    public int getNumeroChambre() {
        return numeroChambre;
    }

    public Lit getLit() {
        return lit;
    }

    public Long getHeureArrivee() {
        return heureArrivee;
    }

    public void setNumeroChambre(int numeroChambre) {
        this.numeroChambre = numeroChambre;
    }

    public void setLit(Lit lit) {
        this.lit = lit;
    }

    @Override
    public String toString() {
        return "AdmissionSortie{" +
                "numeroChambre=" + numeroChambre +
                ", lit=" + lit +
                ", heureArrivee=" + heureArrivee +
                '}';
    }
}
