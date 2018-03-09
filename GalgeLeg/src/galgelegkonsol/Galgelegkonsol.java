/*

 * To change this license header, choose License Headers in Project Properties.

 * To change this template file, choose Tools | Templates

 * and open the template in the editor.

 */

package galgelegkonsol;



import galgelegkonsol.GalgelogikI;

import java.net.MalformedURLException;

import java.net.URL;

import java.util.Scanner;

import javax.xml.namespace.QName;

import javax.xml.ws.Service;



/**

 *

 * @author Morten

 */

public class Galgelegkonsol {



    /**

     * @param args the command line arguments

     */

    public static void main(String[] args) throws MalformedURLException {

        URL url = new URL("http://localhost:9901/galgejeneste?wsdl");

        QName qname = new QName("http://galgelegkonsol/", "GalgelogikImplService");

        Service service = Service.create(url, qname);

        GalgelogikI k = service.getPort(GalgelogikI.class);

        Scanner keyboard = new Scanner(System.in);



        try {

            k.hentOrdFraDr();

        } catch (Exception e) {

            e.printStackTrace();

        }



        while (!k.erSpilletSlut()) {

            System.out.println("Det synlige ord er: " + k.getSynligtOrd() + "\nDu har antal forkerte: " + k.getAntalForkerteBogstaver() + "\nG�t ved at skrive i konsollen.");

            k.g�tBogstav(keyboard.nextLine());

        }



        if (k.erSpilletVundet()) {

            System.out.println("Du vandt!");

        } else {

            System.out.println("Du tabte noob!");

        }

        System.out.println("det rigtige ord var " + k.getOrdet());



    }



}