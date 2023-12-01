import java.util.ArrayList;

public abstract class Chambre {
    private int nbLit;
    private int numero;
    private static int num;
    private ArrayList<Lit> lits;

    public Chambre(Service service, ArrayList<Lit> lits) {
        this.lits = lits;
        nbLit=lits.size();
        this.numero= service.getNumero()*100 + num;
        num+=1;
    }
    public Chambre(Service service) {
        this();
        this.lits = new ArrayList<Lit>();
    }

    public Lit creationLit(Service service){
        Lit l =new Lit(true, 0, 0);
        l = switch (service.getTypeLit()) {
            case "Ambulatoire" -> new LitAmbulatoire(true);
            case "MoyenSejour" -> new LitMoyenSejour(true);
            case "LongSejour" -> new LitLongSejour(true);
            default -> throw new IllegalStateException("Unexpected value: " + service.getTypeLit());
        };
        return l;
    }

    public Chambre() {
    }

    public Boolean litLibre(){
        for (Lit l : lits){
            if (l.getLibre())return true;
        }
        return false;
    }

    public int getNbLit() {
        return nbLit;
    }

    public void setNbLit(int nbLit) {
        this.nbLit = nbLit;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public ArrayList<Lit> getLits() {
        return lits;
    }

    public void addLits(Lit lit) {
        lits.add(lit);
    }

    public String type(){
        String type=null;
        if (nbLit==1){
            type="simple";
        } else{
            type="double";
        }
         return type;
    }
}
