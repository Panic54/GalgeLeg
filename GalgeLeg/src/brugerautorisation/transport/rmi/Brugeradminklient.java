package brugerautorisation.transport.rmi;

import brugerautorisation.data.Diverse;
import brugerautorisation.data.Bruger;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Scanner;

public class Brugeradminklient {
	public Brugeradmin ba;
	public Brugeradminklient () {
		
	}
	/*public static void main(String[] arg)  {
//		Brugeradmin ba =(Brugeradmin) Naming.lookup("rmi://localhost/brugeradmin");

		//		Brugeradmin ba = (Brugeradmin) Naming.lookup("rmi://javabog.dk/brugeradmin");
//		
//		String etnavn = "", etpassword = "";
//
//		Bruger b = ba.hentBruger(etnavn, etpassword);
//        System.out.println(b.adgangskode);
//               
//		System.out.println("Fik bruger = " + b);
//		System.out.println("Data: " + Diverse.toString(b));
		Scanner scan = new Scanner(System.in);
		String test = scan.nextLine();
		String test2 = scan.nextLine();
		try {
			login(test,test2);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
        //ba.sendGlemtAdgangskodeEmail("s154102", "Dette er en test, husk at skifte kode");
	//ba.ændrAdgangskode("s154102", "abcd1234", "abc123");
		//ba.sendEmail("154102", "kodeomi6ag", "Hurra det virker!", "Jeg er så glad");

                 /*
		Object ekstraFelt = ba.getEkstraFelt("s123456", "kode1xyz", "hobby");
		System.out.println("Brugerens hobby er: " + ekstraFelt);

		ba.setEkstraFelt("s154102", "kodeomi6ag", "Intet", "Fritid"); // Skriv noget andet her

		String webside = (String) ba.getEkstraFelt("s123456", "kode1xyz", "webside");
		System.out.println("Brugerens webside er: " + webside);

	} */
	public boolean login (String navn, String password) {
		Bruger b;
		try {
			ba = (Brugeradmin) Naming.lookup("rmi://javabog.dk/brugeradmin");
		} catch (MalformedURLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (RemoteException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (NotBoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		try {
			b = ba.hentBruger(navn, password);
			System.out.println(b.adgangskode);
			System.out.println("Fik bruger = " + b);
			System.out.println("Data: " + Diverse.toString(b));
			
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return true;
	}
}
