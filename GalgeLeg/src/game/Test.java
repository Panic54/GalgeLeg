package game;
import java.util.Scanner;

import brugerautorisation.transport.rmi.Brugeradminklient;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner (System.in);
		
		while(true) {
		String name = scan.nextLine();
		String password = scan.nextLine();
		
		if (name == "n") break;
		
		Brugeradminklient test = new Brugeradminklient();
		System.out.println(test.login(name, password));	
		}
	}

}
