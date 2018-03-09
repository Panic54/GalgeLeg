package game;

import java.rmi.Naming;
import java.util.Scanner;

import brugerautorisation.data.Bruger;
import brugerautorisation.transport.rmi.Brugeradmin;
import brugerautorisation.transport.rmi.BrugeradminImpl;
import brugerautorisation.transport.rmi.Brugeradminklient;

public class TestServer {
	
	public static void main(String[] arg) throws Exception {
		java.rmi.registry.LocateRegistry.createRegistry(808080);
		
		Brugeradmin k = new BrugeradminImpl();
		System.setProperty("java.rmi.server.hostname","javabog.dk");
		Naming.rebind("rmi://localhost/brugeradmin", k);
		System.out.println("Tjeneste registeret");
		
		
		Scanner scan = new Scanner (System.in);
		
		String name = scan.nextLine();
		String password = scan.nextLine();
		
		Brugeradminklient test = new Brugeradminklient();
		System.out.println(test.login(name, password));	
	
	}

}
