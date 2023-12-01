public abstract class Lit {
    private Boolean libre;
    private int tpsOccupationMax; //en jours
    private int tarifLit;

    public Lit(Boolean libre, int tpsOccupationMax, int tarifLit) {
        this.libre = libre;
        this.tpsOccupationMax = tpsOccupationMax;
        this.tarifLit=tarifLit;
    }

    public Boolean getLibre() {
        return libre;
    }

    public void setLibre(Boolean libre) {
        this.libre = libre;
    }

    public int getTpsOccupationMax() {
        return tpsOccupationMax;
    }

    public void setTpsOccupationMax(int tpsOccupationMax) {
        this.tpsOccupationMax = tpsOccupationMax;
    }

    public int getTarifLit() {
        return tarifLit;
    }

    public void setTarifLit(int tarifLit) {
        this.tarifLit = tarifLit;
    }

    @Override
    public String toString() {
        return "Lit{" +
                "libre=" + libre +
                ", tpsOccupationMax=" + tpsOccupationMax +
                ", tarifLit=" + tarifLit +
                '}';
    }
}
