package d16_9_2021;

public abstract class Ambalaza {

//	Kreirati abstraktnu klasu Ambalaza koja ima:
//	barkod (primer: 328232-2823)
//	naziv artikla
//	neto tezinu
//	bruto tezinu
//	konstuktore (default-ni i sa parametrima)
//	gettere i settere
//	metodu koja racuna tezinu pakovanja kao razliku bruto i neto tezine.
//	abstraktnu metodu koja vraca cenu artikla
//	abstraktnu metodu stampaj
	
	protected String barkod;
	protected String ime;
	protected double netoTezina;
	protected double brutoTezina;
	
	public Ambalaza() {
		
	}
	
	public Ambalaza(String barkod, String ime, double netoTezina, double brutoTezina) {
		super();
		this.barkod = barkod;
		this.ime = ime;
		this.netoTezina = netoTezina;
		this.brutoTezina = brutoTezina;
	}
	
//	METODE
	
	public double tezinaPakovanja() {
		double tezina = brutoTezina - netoTezina;
		return tezina;
	}
	
	public abstract double cenaArtikla();
	
	public abstract void stampa();

//	GETTERS & SETTERS
	
	public String getBarkod() {
		return barkod;
	}

	public String getIme() {
		return ime;
	}

	public double getNetoTezina() {
		return netoTezina;
	}

	public double getBrutoTezina() {
		return brutoTezina;
	}
	
	
	
	
	
	
	
	
	
	
}
