import java.util.ArrayList;

public class ChambreSimple extends Chambre{
    private Lit lit;

    public ChambreSimple(Service service) {
        super(service);
        this.lit = creationLit(service);
        super.addLits(lit);
    }
}
