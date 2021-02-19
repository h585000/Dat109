package opa;

public class Bil {
	private int regNummer;
	private String merke;
	private int km;
	private Utleiegruppe utleiegruppe;
	private String farge;
	private boolean ledig;
	
	
	public Bil(int regNummer, String merke,int km, Utleiegruppe utleiegruppe, String farge,boolean ledig) {
	
		this.regNummer = regNummer;
		this.km = km;
		this.utleiegruppe = utleiegruppe;
		this.merke = merke;
		this.farge = farge;
		this.ledig = true;
	}
	
	public int getRegNummer() {
		return regNummer;
	}
	public void setRegNummer(int regNummer) {
		this.regNummer = regNummer;
	}
	public String getMerke() {
		return merke;
	}
	public void setMerke(String merke) {
		this.merke = merke;
	}
	public int getKm() {
		return km;
	}
	public void setKilometerstand(int km) {
		this.km = km;
	}
	public Utleiegruppe getUtleiegruppe() {
		return utleiegruppe;
	}
	public void setUtleiegruppe(Utleiegruppe utleiegruppe) {
		this.utleiegruppe = utleiegruppe;
	}
	public String getFarge() {
		return farge;
	}
	public void setFarge(String farge) {
		this.farge = farge;
	}
	public boolean isLedig() {
		return ledig;
	}
	public void setLedig(boolean ledig) {
		this.ledig = ledig;
	}

	@Override
	public String toString() {
		return "Bil [regNummer=" + regNummer + ", merke=" + merke + ", km=" + km + ", utleiegruppe=" + utleiegruppe
				+ ", farge=" + farge + ", ledig=" + ledig + "]";
	}
	
	

}
