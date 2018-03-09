/*

 * To change this license header, choose License Headers in Project Properties.

 * To change this template file, choose Tools | Templates

 * and open the template in the editor.

 */

package galgelegkonsol;



import java.io.IOException;

import java.util.ArrayList;

import javax.jws.WebMethod;

import javax.jws.WebService;



/**

 *

 * @author Morten

 */

@WebService

public interface GalgelogikI {



    @WebMethod

    ArrayList<String> getBrugteBogstaver();



    @WebMethod

    String getSynligtOrd();



    @WebMethod

    String getOrdet();



    @WebMethod

    int getAntalForkerteBogstaver();



    @WebMethod

    boolean erSidsteBogstavKorrekt();



    @WebMethod

    boolean erSpilletVundet();



    @WebMethod

    boolean erSpilletTabt();



    @WebMethod

    boolean erSpilletSlut();



    @WebMethod

    void opdaterSynligtOrd();



    @WebMethod

    void nulstil();



    @WebMethod

    void gætBogstav(String bogstav);



    @WebMethod

    void logStatus();



    @WebMethod

    String hentUrl(String url) throws IOException;



    @WebMethod

    void hentOrdFraDr() throws Exception;



}