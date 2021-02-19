package opa;

public class Kunde {
	private String fornavn;
	private String etternavn;
	private int telefonnummer;
	private Adresse addresse;
	private String kort;

	
	
	public Kunde(String fornavn, String etternavn, int telefonnummer, Adresse addresse,String kort) {
		super();
		this.fornavn = fornavn;
		this.etternavn = etternavn;
		this.telefonnummer = telefonnummer;
		this.addresse = addresse;
		this.kort=kort;
	
		
	}
	
	public String getFornavn() {
		return fornavn;
	}
	public void setFornavn(String fornavn) {
		this.fornavn = fornavn;
	}
	public String getEtternavn() {
		return etternavn;
	}
	public void setEtternavn(String etternavn) {
		this.etternavn = etternavn;
	}
	public int getTelefonnummer() {
		return telefonnummer;
	}
	public void setTelefonnummer(int telefonnummer) {
		this.telefonnummer = telefonnummer;
	}
	public Adresse getAddresse() {
		return addresse;
	}
	public void setAddresse(Adresse addresse) {
		this.addresse = addresse;
	}
	


	public String getKort() {
		return kort;
	}

	public void setKort(String kort) {
		this.kort = kort;
	}

	@Override
	public String toString() {
		return "Kunde [fornavn=" + fornavn + ", etternavn=" + etternavn + ", telefonnummer=" + telefonnummer
				+ ", addresse=" + addresse +", kort="+ kort + "]";
	}

	
	
	
	
}