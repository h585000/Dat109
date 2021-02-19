package opa;

import java.util.List;

public class BilUtleie {
	private String navn;
	private int tlf;
	private Adresse adresse;
	private static List<UtleieKontor>utleier;
	private static List<Kunde>kundeliste;
	
	public BilUtleie(String navn, int tlf, Adresse adresse,List<UtleieKontor>utleier,List<Kunde>kundeliste) {
		this.navn=navn;
		this.tlf=tlf;
		this.adresse=adresse;
		this.utleier=utleier;
		this.kundeliste=kundeliste;
	}

	public String getNavn() {
		return navn;
	}

	public void setNavn(String navn) {
		this.navn = navn;
	}

	public int getTlf() {
		return tlf;
	}

	public void setTlf(int tlf) {
		this.tlf = tlf;
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}
	public  void TilgjengUtleiere() {
		
		for(UtleieKontor ut:utleier) {
			System.out.println(ut.toString());
		}
	}
	public static UtleieKontor finnUtleie(int id) {
		UtleieKontor res=null;
		for(UtleieKontor utleie:utleier) {
			if(utleie.getId()==id) {
				res=utleie;
				System.out.println(res.toString());
			}
		}
		return res;
	}
	
	public static Kunde finnKunde(String kort) {
		Kunde kunde = null;
		for(Kunde kund:kundeliste) {
			if(kund.getKort().equals(kort)) {
				kunde=kund;
			}
		}
		return kunde;
	}
	
	 public static long regning(long timer, int kilometer, Utleiegruppe typ){
	        long sum = 150*timer;
	        int ekstra = velgBil(typ);
	        sum = sum + ekstra;

	        return sum;
	    }
	
	
	 public static int velgBil(Utleiegruppe utleie) {
	        int pris=1;
	        switch (utleie) {
	            case A:
	                pris = 200;
	                break;

	            case B:
	                pris = 350;
	                break;

	            case C:
	                pris = 500;
	                break;

	            case D:
	                pris = 650;
	                break;
	            default:
	                
	        }
	        return pris;
	    }

	@Override
	public String toString() {
		return "BilUtleie [navn=" + navn + ", tlf=" + tlf + ", adresse=" + adresse + "]";
	}
	
	

}
