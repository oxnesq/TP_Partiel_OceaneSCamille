public class ChambreDouble extends Chambre{
    private Lit lit1;
    private Lit lit2;


    public ChambreDouble(Service service,Lit lit, Lit lit2) {
        super(service);
        this.lit1 = lit;
        this.lit2=lit2;
        super.addLits(lit);
        super.addLits(lit2);
    }
}
