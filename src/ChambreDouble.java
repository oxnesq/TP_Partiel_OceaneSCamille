public class ChambreDouble extends Chambre{
    private Lit lit1;
    private Lit lit2;


    public ChambreDouble(Service service) {
        super(service);
        this.lit1 = creationLit(service);
        this.lit2=creationLit(service);
        super.addLits(lit1);
        super.addLits(lit2);
    }
}
