package game;

public class BenytGalgelogik {

	public static void main(String[] args) {

		Galgelogik spil = new Galgelogik();
		spil.nulstil();

		try {
			spil.hentOrdFraDr();
		} catch (Exception e) {
			e.printStackTrace();
		}
		spil.logStatus();

		spil.g�tBogstav("e");
		spil.logStatus();

		spil.g�tBogstav("a");
		spil.logStatus();
		System.out.println("" + spil.getAntalForkerteBogstaver());
		System.out.println("" + spil.getSynligtOrd());
		if (spil.erSpilletSlut()) return;

		spil.g�tBogstav("i");
		spil.logStatus();
		if (spil.erSpilletSlut()) return;

		spil.g�tBogstav("s");
		spil.logStatus();
		if (spil.erSpilletSlut()) return;

		spil.g�tBogstav("r");
		spil.logStatus();
		if (spil.erSpilletSlut()) return;

		spil.g�tBogstav("l");
		spil.logStatus();
		if (spil.erSpilletSlut()) return;

		spil.g�tBogstav("b");
		spil.logStatus();
		if (spil.erSpilletSlut()) return;

		spil.g�tBogstav("o");
		spil.logStatus();
		if (spil.erSpilletSlut()) return;

		spil.g�tBogstav("t");
		spil.logStatus();
		if (spil.erSpilletSlut()) return;

		spil.g�tBogstav("n");
		spil.logStatus();
		if (spil.erSpilletSlut()) return;

		spil.g�tBogstav("m");
		spil.logStatus();
		if (spil.erSpilletSlut()) return;

		spil.g�tBogstav("y");
		spil.logStatus();
		if (spil.erSpilletSlut()) return;

		spil.g�tBogstav("p");
		spil.logStatus();
		if (spil.erSpilletSlut()) return;

		spil.g�tBogstav("g");
		spil.logStatus();
		if (spil.erSpilletSlut()) return;
	}
}
