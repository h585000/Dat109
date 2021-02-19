package opa;

import java.util.Date;

public class Utleie {
	
	    Kunde kunde;
	    int registeringsnummer;
	    Date leieDato;
	    Date returDato;
	    

	    public Utleie(Kunde kunde, int registeringsnummer, Date leieDato, Date returDato ) {
	        this.kunde = kunde;
	        this.registeringsnummer = registeringsnummer;
	        this.leieDato=leieDato;
	        this.returDato=returDato;
	        
	    }

	    public Kunde getKunde() {
	        return kunde;
	    }

	    public void setBruker(Kunde kunde) {
	        this.kunde = kunde;
	    }

	    public int getRegisteringsnummer() {
	        return registeringsnummer;
	    }

	    public void setRegisteringsnummer(int registeringsnummer) {
	        this.registeringsnummer = registeringsnummer;
	    }

		public Date getLeieDato() {
			return leieDato;
		}

		public void setLeieDato(Date leieDato) {
			this.leieDato = leieDato;
		}

		public Date getReturDato() {
			return returDato;
		}

		public void setReturDato(Date returDato) {
			this.returDato = returDato;
		}

		@Override
		public String toString() {
			return "Utleie [kunde=" + kunde + ", registeringsnummer=" + registeringsnummer + ", leieDato=" + leieDato
					+ ", returnDato=" + returDato + "]";
		}

		
	
		

	   

	    

}
