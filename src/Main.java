
import java.util.ArrayList;
import java.util.concurrent.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws HopitalException{
        long start = System.nanoTime();
        System.out.printf("Hopital!"+'\n');

        Service serviceUrologie= new Service("Urologie",1,5,5,"Ambulatoire");

        ArrayList<Service> services = new ArrayList<Service>();
        services.add(serviceUrologie);

        Hopital hopital = new Hopital(services);
        System.out.println(hopital);


        ChambreSimple chambreSimple = new ChambreSimple(serviceUrologie);

        Patient patient1 = new Patient("Lucas", 9864, "Urologie",chambreSimple );
        AdmissionSortie adm = new AdmissionSortie(hopital, patient1);

        long end = System.nanoTime();
        adm.setHeureArrivee((long) ((end-start)/ 1000000000.0));
        System.out.println(adm);
        }
    }
