/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package galgelegkonsol.serverside;

import javax.xml.ws.Endpoint;

/**
 *
 * @author Morten
 */
public class Galgelegserver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("publicerer kontotjeneste");
        GalgelogikI k = new GalgelogikImpl();
        // Ipv6-addressen [::] svarer til Ipv4-adressen 0.0.0.0, der matcher alle maskinens netkort og 
        Endpoint.publish("http://[::]:9901/galgejeneste", k);
        System.out.println("Galgeleg server er startet.");
    }
}
