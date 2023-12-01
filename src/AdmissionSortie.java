
public class AdmissionSortie {
    private Patient patient;
    private int numeroChambre;
    private Lit lit;
    private Long heureArrivee;

    public AdmissionSortie(Hopital hopital, Patient patient) {


        this.patient=patient;
        this.lit = getLit();
        lit.setLibre(false);
        this.numeroChambre=getNumeroChambre();
        hopital.addArchiveAdminssions(this);
    }

    public String sortiePatient(){
        lit.setLibre(true);
        Tarif tarif = new Tarif(patient);
        return patient+": "+heureArrivee+""+tarif;
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

    public void setHeureArrivee(Long heureArrivee) {
        this.heureArrivee = heureArrivee;
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
