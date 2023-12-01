
public class AdmissionSortie {
    private int numeroChambre;
    private Lit lit;
    private Long heureArrivee;

    public AdmissionSortie(int numeroChambre, Lit lit) {
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
}
