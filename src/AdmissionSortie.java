
public class AdmissionSortie {
    private Hopital hopital;
    private Patient patient;
    private int numeroChambre;
    private Lit lit;
    private Long heureArrivee;

    public AdmissionSortie(Hopital hopital, Patient patient) {
        this.hopital=hopital;
        for (Chambre c : servicePatient(hopital,patient).getChambres()){
            if (c.type().equals(patient.getChambreVoulue().type())){
                if (c.litLibre()){
                    this.patient=patient;
                    this.lit = c.getLitLibre();
                    patient.setLit(c.getLitLibre());
                    patient.setChambre(c);
                    lit.setLibre(false);
                    this.numeroChambre=c.getNumero();
                    hopital.addArchiveAdminssions(this);
                    break;
                }

            }
        }

    }
    public Service servicePatient(Hopital hopital, Patient patient){
        return hopital.getServiceNb(patient.getRaison());
    }

    public String sortiePatient(){
        lit.setLibre(true);
        Tarif tarif = new Tarif(servicePatient(hopital,patient),patient);
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
                "numeroChambre= " + numeroChambre +
                ", lit=" + lit +
                ", heureArrivee= " + heureArrivee +
                "tarif final= " +
                '}';
    }
}
