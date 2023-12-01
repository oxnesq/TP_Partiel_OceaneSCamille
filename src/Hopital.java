import java.util.ArrayList;
public class Hopital {
    private ArrayList<Service> services;
    private final int nbMax = 9;
    private ArrayList<AdmissionSortie> archiveAdminssions;


    public Hopital(ArrayList<Service> services) throws HopitalException {
        if (services.size()<10){
            this.services =services;
        }else{
            throw new HopitalException("Il y a trop de service");
        }

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

    public void addService(Service s)throws HopitalException{
        if (services.size()<10) {
            services.add(s);
        }else{
            throw new HopitalException("Il y a trop de service");
        }
    }

    public Service getServiceNb(String i){
        for (Service s : services){
            if (s.getNom()==i)return s;
        }
        return null;
    }

    @Override
    public String toString() {
        return "Hopital{" +
                "services=" + services +
                "admissions" + archiveAdminssions+
                '}';
    }

    public ArrayList<AdmissionSortie> getArchiveAdminssions() {
        return archiveAdminssions;
    }

    public void addArchiveAdminssions(AdmissionSortie adm) {
        archiveAdminssions.add(adm);
    }
}