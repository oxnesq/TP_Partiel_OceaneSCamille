
import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws HopitalException{
        System.out.printf("Hopital!"+'\n');

        Service serviceUrologie= new Service("Urologie",1,5,5,"Ambulatoire");

        ArrayList<Service> services = new ArrayList<Service>();
        services.add(serviceUrologie);

        Hopital hopital = new Hopital(services);
        System.out.println(hopital);

        Patient patient1 = new Patient("Lucas", 9864, "Urologie");

        }
    }
