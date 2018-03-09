package galgelegkonsol.serverside;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;

/**
 * @author Morten
 */
public class Galgelegkonsol {

    /**
     * @param args the command line arguments
     * @throws java.net.MalformedURLException
     */
    public static void main(String[] args) throws MalformedURLException {
        URL url = new URL("http://ubuntu4.javabog.dk:11111/galgeleg?wsdl");
        QName qname = new QName("http://serverside.galgelegkonsol/", "GalgelogikImplService");
        Service service = Service.create(url, qname);
        GalgelogikI k = service.getPort(GalgelogikI.class);
        Scanner keyboard = new Scanner(System.in);

        try {
            k.hentOrdFraDr();
        } catch (Exception e) {
            e.printStackTrace();
        }

        while (!k.erSpilletSlut()) {
            System.out.println("Det synlige ord er: " + k.getSynligtOrd() + "\nDu har antal forkerte: " + k.getAntalForkerteBogstaver() + "\nGæt ved at skrive i konsollen.");
            k.gætBogstav(keyboard.nextLine());
        }

        if (k.erSpilletVundet()) {
            System.out.println("Du vandt!");
        } else {
            System.out.println("Du tabte noob!");
        }
        System.out.println("det rigtige ord var " + k.getOrdet());

    }

}
