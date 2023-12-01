
public class AdmissionSortie {
    private Patient patient;
    private int numeroChambre;
    private Lit lit;
    private Long heureArrivee;

    public AdmissionSortie(Hopital hopital, Patient patient) {
        long start = System.currentTimeMillis();
        this.patient=patient;
        this.lit = getLit();
        lit.setLibre(false);
        this.numeroChambre=getNumeroChambre();
        long end = System.currentTimeMillis();
        this.heureArrivee=end-start;
        hopital.addArchiveAdminssions(this);
    }

    public Tarif sortiePatient(){
        patient.getLit()
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
