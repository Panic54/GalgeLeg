/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import brugerautorisation.transport.rmi.Brugeradmin;
import java.rmi.Naming;

/**
 *
 * @author madsfinnerup
 */
public class TestHent {
    public static void main (String[] args) throws Exception { 
        
    Brugeradmin ba =(Brugeradmin) Naming.lookup("rmi://javabog.dk:11114/galgeserver");
    ba.hentBruger("s154102", "abc123");   
    }
}
