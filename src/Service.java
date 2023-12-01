import java.util.ArrayList;

public class Service {
    private String nom;
    private int numero;
    private int nbChambreSimple;

    private int nbChambreDouble;
    private ArrayList<Chambre> chambres ;
    private String typeLit;
    private final int nbMax=99;

    public Service(String nom, int numero, int nbChambreSimple, int nbChambreDouble, String typeLit) throws HopitalException{
        this.nom = nom;
        this.numero = numero;
        if (nbChambreSimple+nbChambreDouble<100){
            this.nbChambreSimple = nbChambreSimple;
            this.nbChambreDouble = nbChambreDouble;
        }else{
            throw new HopitalException("trop de lit");
        }

        this.typeLit=typeLit;

        this.chambres = new ArrayList<Chambre>();
        for (int i=0; i<nbChambreSimple; i++){
            ChambreSimple chambre = new ChambreSimple(this);
        }

        for (int i=0; i<nbChambreDouble; i++){
            ChambreDouble chambre = new ChambreDouble(this );
        }
    }

    public String getTypeLit() {
        return typeLit;
    }


        public Chambre getChambre(int num ){
            for (Chambre c : chambres){
                if (c.getNumero()==num)return c;
            }
            return null;
        }


    public String getNom(){
        return nom;
    }

    public int getNumero() {
        return numero;
    }

    public int getNbChambreSimple() {
        return nbChambreSimple;
    }

    public int getNbChambreDouble() {
        return nbChambreDouble;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public ArrayList<Chambre> getChambres() {
        return chambres;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setNbChambreSimple(int nbChambreSimple) {
        this.nbChambreSimple = nbChambreSimple;
    }

    public void setNbChambreDouble(int nbChambreDouble) {
        this.nbChambreDouble = nbChambreDouble;
    }

    public int nbChambreTot() {
            return nbChambreSimple+nbChambreDouble;
    }

    @Override
    public String toString() {
        return "Service{" +
                "nom='" + nom + '\'' +
                ", numero=" + numero +
                "chambres: "
                '}';
    }
}
