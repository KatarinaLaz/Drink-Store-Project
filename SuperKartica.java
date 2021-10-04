package d16_9_2021;

public class SuperKartica {

//	Kreirati klasu SuperKartica koja ima:
//	broj kartice
//	ime i prezime vlasnika
//	popust (200, 500, … )
//	konstuktore (default-ni i sa parametrima)
//	gettere i settere 
//	metodu stampaj koja stampa karticu u formatu:
//	(broj kartice), (ime i prezime)
	
	private String brojKartice;
	private String imeVlasnika;
	private double popust;
	
	public SuperKartica() {
		
	}
	
	public SuperKartica(String brojKartice, String imeVlasnika, double popust) {
		super();
		this.brojKartice = brojKartice;
		this.imeVlasnika = imeVlasnika;
		this.popust = popust;
	}

//	METODE
	
	public void stampa() {
		System.out.println(brojKartice + ", " + imeVlasnika);
	}
	
//	GETTERS & SETTERS
	
	public String getBrojKartice() {
		return brojKartice;
	}

	public String getImeVlasnika() {
		return imeVlasnika;
	}

	public double getPopust() {
		return popust;
	}
	
	
	
	
	
	
	
	
	
	
}
