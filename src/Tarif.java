public class Tarif {
    private int prix;
    private Lit lit;
    private Patient patient;
/*
    public Tarif(Service service,Patient patient) {
        this.lit=patient.getLit();

        if (.getNbLit()==1){
            prix=lit.getTarifLit()*2;
        } else {
            prix=lit.getTarifLit();
        }

    }*/

    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

    public Lit getLit() {
        return lit;
    }

    public void setLit(Lit lit) {
        this.lit = lit;
    }

    public void obligation(){
        prix/=2;
    }
}
