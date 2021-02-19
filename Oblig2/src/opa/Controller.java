package opa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Controller {
	UtleieKontor kontor;

	public static void main (String[]args){
		
		
		
		
		//Opretter en kunde
		Scanner scan =new Scanner(System.in);
		
		List<Kunde>kundeliste=new ArrayList<Kunde>();
		 List<UtleieKontor>utleier= new ArrayList<UtleieKontor>();
		 List<Utleie>utlei=new ArrayList<Utleie>();
		 
		
		
			 
		 
		
		
		
		//Bruker test
		Adresse adresse=new Adresse("Lyngholen",55,"Bryne");
		Adresse adresse2=new Adresse("Rismark",55,"Klebe");
		
		Kunde kunde=new Kunde("Kjetil","Johansen",95335603,adresse,"12345");
		
		System.out.println("kunde registrert : "+ kunde);
		
		//BilUtleie test
		List<Bil>biler =new ArrayList<Bil>();
		Bil b1=new Bil(1111,"Audi",50000, Utleiegruppe.A,"svart",true);
		Bil b2=new Bil(2222,"BMW",50000, Utleiegruppe.B,"blå",true);
		Bil b3=new Bil(3333,"Lambogini",50000, Utleiegruppe.A,"gul",true);
		Bil b4=new Bil(4444,"Mercedes",70000, Utleiegruppe.C,"kvit",true);
		
		biler.add(b1);
		biler.add(b2);
		biler.add(b3);
		biler.add(b4);
		
		//Prøve å leie enn bil
		 UtleieKontor utleier1=new UtleieKontor(1,adresse,12345678,biler,utlei) ;
		 utleier.add(utleier1);
		 
		
		BilUtleie leiebil=new BilUtleie("Kjetil",95335603,adresse,utleier, kundeliste);
		BilUtleie leiebil2=new BilUtleie("Fredrik",12345678,adresse2,utleier, kundeliste);
		kundeliste.add(kunde);
		
		 
		
		System.out.println("skriv inn kortnummer");
		String kort=scan.nextLine();
		
		Kunde kunde1 = BilUtleie.finnKunde(kort);
		
		if(kunde1 != null) {
			System.out.println("Kunden fins"+kunde1);
			leiebil.TilgjengUtleiere();
			
			System.out.println("skriv in id på den du vil leie");
			int id=scan.nextInt();
			 scan.nextLine();
			
			 //Skriv inn ønska plass
			 UtleieKontor ut=BilUtleie.finnUtleie(id);
			 
			 System.out.println("her er alle bilene som er tilgjengelig");
			 ut.bilerTilgjengelig();
			
			 ut.leieBil(kunde1);
			 
			 
			 
			 ut.returBil(kunde1);
			
			
			
		}
		else {
			System.out.println("Finner ingen med dette kortnummeret, venligst registrer deg");
		
			System.out.println("skriv inn fornavn");
			String fornavn =scan.nextLine();
			
			System.out.println("skriv inn etternavn");
			String etternavn = scan.nextLine();
			
			System.out.println("skriv inn telefonnr");
			int tlf=scan.nextInt();
			
			System.out.println("skriv inn gateadresse");
			String ga=scan.nextLine();
			   scan.nextLine();
			
			System.out.println("skriv inn postnr");
			int pnr=scan.nextInt();
		      scan.nextLine();
			
			System.out.println("skriv inn poststed");
			String ps =scan.nextLine();
			
			System.out.println("skriv inn kortnr");
			String kort2=scan.nextLine();
			
			Adresse ad = new Adresse(ga,pnr,ps);
			
			Kunde kunde2=new Kunde(fornavn,etternavn,tlf,ad, kort2);
			
			kundeliste.add(kunde2);
			
			System.out.println("Kunden fins"+kunde1);
			leiebil.TilgjengUtleiere();
			
			System.out.println("skriv in id på den du vil leie");
			int id=scan.nextInt();
			 scan.nextLine();
			
			 //Skriv inn ønska plass
			 UtleieKontor ut=BilUtleie.finnUtleie(id);
			 
			 System.out.println("her er alle bilene som er tilgjengelig");
			 ut.bilerTilgjengelig();
			
			 ut.leieBil(kunde2);
			 
			 
			 
			 ut.returBil(kunde2);
			
			
			
			
		}
		
		
		
		
		
		
		
		
		
	
		
		
	
		
		
	}
}
