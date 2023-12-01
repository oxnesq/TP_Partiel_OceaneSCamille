import java.util.ArrayList;

public class ChambreSimple extends Chambre{
    private Lit lit;

    public ChambreSimple(Service service,Lit lit) {
        super(service);
        this.lit = lit;
        super.addLits(lit);
    }
}
