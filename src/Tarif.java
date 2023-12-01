public class Tarif {
    private int prix;
    private Lit lit;

    public Tarif(Chambre chambre,Lit lit) {
        for (Lit l : chambre.getLits()){
            if (l.equals(lit))this.lit = lit;
        }
        if (chambre.getNbLit()==1){
            prix=lit.getTarifLit()*2;
        } else {
            prix=lit.getTarifLit();
        }

    }

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
