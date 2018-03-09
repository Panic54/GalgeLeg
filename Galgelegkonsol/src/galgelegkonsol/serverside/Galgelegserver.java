package galgelegkonsol.serverside;

import javax.xml.ws.Endpoint;

/**
 * @author Morten
 */
public class Galgelegserver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("publicerer kontotjeneste");
        GalgelogikI k = new GalgelogikImpl();
        Endpoint.publish("http://ubuntu4.javabog.dk:11111/galgeleg?wsdl", k);
        System.out.println("Galgeleg server er startet.");
    }
}
