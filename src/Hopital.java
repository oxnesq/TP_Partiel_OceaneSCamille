import java.util.ArrayList;
public class Hopital {
    private ArrayList<Service> service;
    private final int nbMax = 9;


    public Hopital(ArrayList<Service> service) {
        this.service=service;
    }

    public int getnbMax(){
        return nbMax;
    }

    public ArrayList<Service> getServiceHopital(){
        return service;
    }
}