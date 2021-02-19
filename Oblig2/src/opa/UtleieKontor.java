package opa;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class UtleieKontor {
	private int id;
	private Adresse adresse;
	private int tlf;
	private List<Bil>biler;
	private List<Utleie>utleieliste;
	
	public UtleieKontor(int id,Adresse adresse, int tlf,List<Bil>biler, List<Utleie>utleieliste) {
		this.id=id;
		this.adresse=adresse;
		this.tlf=tlf;
		this.biler=biler;
		this.utleieliste=utleieliste;
		
	}

	public int getId() {
		return id;
	}

	public void setNummer(int id) {
		this.id=id;
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	public int getTlf() {
		return tlf;
	}

	public void setTlf(int tlf) {
		this.tlf = tlf;
	}
	public Bil finnbil(int nr) {
		Bil fant=null;
		for(Bil b:biler) {
			if(b.getRegNummer()==nr) {
				fant=b;
			}
			
			
		}
		return fant;
	}
	
	//Metode for og reservere bil
	public int leieBil(Kunde kunde) {
		
		Scanner scan=new Scanner(System.in);
		
		  System.out.println("Skriv inn registreningsnummer på ønsket bil");
	       int regBil = scan.nextInt();
	       
	       System.out.println("Stardato");
           System.out.println("Skriv inn: åååå");
           int år = scan.nextInt();
           scan.nextLine();

           System.out.println("Skriv inn: mm");
           int måne = scan.nextInt();
           scan.nextLine();

           System.out.println("Skriv inn: dd");
           int dag = scan.nextInt();
           scan.nextLine();

           System.out.println("Skriv inn: hh");
           int hh = scan.nextInt();
           scan.nextLine();

           System.out.println("Skriv inn: minutter");
           int min = scan.nextInt();
           scan.nextLine();

           Date startDato = new Date(år, måne, dag);

           System.out.println("Sluttdato");
           System.out.println("Skriv inn: åååå");
           int sluttår = scan.nextInt();
           scan.nextLine();

           System.out.println("Skriv inn: mm");
           int sluttmm = scan.nextInt();
           scan.nextLine();

           System.out.println("Skriv inn: dd");
           int sluttdd = scan.nextInt();
           scan.nextLine();

           System.out.println("Skriv inn: hh");
           int slutthh = scan.nextInt();
           scan.nextLine();

           System.out.println("Skriv inn: minutter");
           int sluttmin = scan.nextInt();
           scan.nextLine();

           Date sluttDato = new Date(sluttår, sluttmm, sluttdd, slutthh, sluttmin);

           Utleie utleie = new Utleie(kunde, regBil, startDato, sluttDato);
           System.out.println("denne karen skal leie bil: " + utleie);
           utleieliste.add(utleie);
           System.out.println("listen av de som leier "+utleieliste);
           
           finnbil(regBil).setLedig(false);
	       return regBil;
		
	}
	public void returBil(Kunde kunde) {
		
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("skriv inn reg nummeret på bilen du skal levere");
		int regbil=scan.nextInt();
		
		System.out.println("skriv hvor mange kilometer du har kjørt");
		int km=scan.nextInt();
		
		for(Utleie ut:utleieliste) {
			if(ut.getKunde().getKort().equals(kunde.getKort())){
				Date start=ut.getLeieDato();
				Date slutt=ut.getReturDato();
				 Utleie utleie = new Utleie(kunde, regbil, start, slutt);
				 utleieliste.remove(utleie);
				 Bil bil= finnbil(regbil);
				 bil.setKilometerstand(km+bil.getKm());
				 bil.setLedig(true);
				 
				 long diff = slutt.getTime()-start.getTime();

	                long diffHour = diff / (60 * 60 * 1000);

	                System.out.println("Regningen kommer på: " + BilUtleie.regning(diffHour, km, bil.getUtleiegruppe()));
				System.out.println("Bilen er nå returnert, ha en fin dag videre "+ utleie);
				
			}
			
		}
		
		
	
        		
        		 
        	 }
        	
      
	
	public void bilerTilgjengelig() {
		//for(Bil bila:biler) {
		//	System.out.println(bila.toString());
		//}
		for(int i=0;i<biler.size();i++) {
			System.out.println(biler.toString());
		}
	}

	@Override
	public String toString() {
		return "UtleieKontor [id=" + id + ", adresse=" + adresse + ", tlf=" + tlf + "]";
	}
	
	
	


}
