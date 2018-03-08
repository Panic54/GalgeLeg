package brugerautorisation.transport.rmi;
import brugerautorisation.data.Bruger;
import brugerautorisation.server.Brugerdatabase;
import brugerautorisation.server.SendMail;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class BrugeradminImpl extends UnicastRemoteObject implements Brugeradmin
{

	protected BrugeradminImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}
	/*
	Brugerdatabase db;

	public BrugeradminImpl() throws java.rmi.RemoteException
	{
	}

	@Override
	public Bruger hentBruger(String brugernavn, String adgangskode) {
		return db.hentBruger(brugernavn, adgangskode);
	}

	@Override
	public Bruger ændrAdgangskode(String brugernavn, String glAdgangskode, String nyAdgangskode) {
		Bruger b = db.hentBruger(brugernavn, glAdgangskode);
    if (nyAdgangskode.isEmpty()) throw new IllegalArgumentException("Tom adgangskode");
    if (nyAdgangskode.contains("\"") || nyAdgangskode.contains("'")) throw new IllegalArgumentException("Ugyldige tegn i adgangskoden");
		b.adgangskode = nyAdgangskode;
		db.gemTilFil(false);
		return b;
	}

	@Override
	public void sendEmail(String brugernavn, String adgangskode, String emne, String tekst) {
		Bruger b = db.hentBruger(brugernavn, adgangskode);
		try {
			SendMail.sendMail("DIST: "+emne, tekst, b.email);
		} catch (Exception ex) {
			ex.printStackTrace();
			throw new IllegalStateException("fejl", ex);
		}
	}

	@Override
	public void sendGlemtAdgangskodeEmail(String brugernavn, String supplerendeTekst) {
		Bruger b = db.brugernavnTilBruger.get(brugernavn);
		try {
			SendMail.sendMail("DIST: Din adgangskode ",
					"Kære "+b.fornavn+",\n\nDit brugernavn er "+b.brugernavn+" og din adgangskode er: "+b.adgangskode
					+(b.sidstAktiv>0?"":"\n\nDu skal skifte adgangskoden for at bekræfte at du følger kurset.\nSe hvordan på https://goo.gl/26pBG9 \n")
					+"\n"+supplerendeTekst,
					b.email);
		} catch (Exception ex) {
			ex.printStackTrace();
			throw new IllegalStateException("fejl", ex);
		}
	}

	@Override
	public Object getEkstraFelt(String brugernavn, String adgangskode, String feltnavn) {
		return db.hentBruger(brugernavn, adgangskode).ekstraFelter.get(feltnavn);
	}

	@Override
	public void setEkstraFelt(String brugernavn, String adgangskode, String feltnavn, Object værdi) {
		db.hentBruger(brugernavn, adgangskode).ekstraFelter.put(feltnavn, værdi);
		db.gemTilFil(false);
	}
	*/

	//Remove this part if need to be redone...
	@Override
	public Bruger hentBruger(String brugernavn, String adgangskode) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Bruger ændrAdgangskode(String brugernavn, String glAdgangskode, String nyAdgangskode)
			throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void sendEmail(String brugernavn, String adgangskode, String emne, String tekst) throws RemoteException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sendGlemtAdgangskodeEmail(String brugernavn, String følgetekst) throws RemoteException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setEkstraFelt(String brugernavn, String adgangskode, String feltnavn, Object værdi)
			throws RemoteException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Object getEkstraFelt(String brugernavn, String adgangskode, String feltnavn) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}
}