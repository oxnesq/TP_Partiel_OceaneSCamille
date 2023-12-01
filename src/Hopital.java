import java.util.ArrayList;
public class Hopital {
    private ArrayList<Service> services;
    private final int nbMax = 9;


    public Hopital(ArrayList<Service> services) {
        this.services =services;
    }

    public Hopital() {
        this.services=new ArrayList<Service>();
    }

    public int getnbMax(){
        return nbMax;
    }

    public ArrayList<Service> getServicesHopital(){
        return services;
    }

    public void addService(Service s){
        services.add(s);
    }

    @Override
    public String toString() {
        return "Hopital{" +
                "services=" + services +
                '}';
    }
}