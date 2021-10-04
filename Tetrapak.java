package d16_9_2021;

public class Tetrapak extends Ambalaza {


//	Kreirati klasu Tetrapak koja nasledjuje klasu Ambalaza koja ima:
//	atribut koji kaze da li se moze reciklirati
//	osnovna cena
//	gettere i setter za atribute
//	konstuktori koji su vam potrebni
//	racuna cenu tako da ispunjava uslova:
//	ako je od recikliranog materijala, ( tezina pakovanja ) * 1.5 + (osnovna cena);
//	ako nije u cenu ulazi samo osnovna cena
//	metoda stampaj stampa sve podatke iz klase tetrapak.
	
	private boolean mozeSeReciklirati;
	private double osnovnaCena;
	
	public Tetrapak() {
		super();
	}

	public Tetrapak(String barkod, String ime, double netoTezina, double brutoTezina, boolean reciklaza, double cena) {
		super(barkod, ime, netoTezina, brutoTezina);
		this.mozeSeReciklirati = reciklaza;
		this.osnovnaCena = cena;
	}

//	METODE
	
	@Override
	public double cenaArtikla() {
		double cena = 0;
		if (mozeSeReciklirati == true) {
			cena = this.tezinaPakovanja() * 1.5 + osnovnaCena;
		} else {
			cena = osnovnaCena;
		}
		return cena;
	}
	
	@Override
	public void stampa() {
		System.out.println(ime + ", " + barkod);
		System.out.println("Cena: " + this.cenaArtikla());
		System.out.println("Tezina pakovanja: " + this.tezinaPakovanja());
		if (mozeSeReciklirati == true) {
			System.out.print("Moze ");
		} else {
			System.out.print("Ne moze ");
		}
		System.out.println("se reciklirati");
		System.out.println();
	}

//	GETTERS & SETTERS
	
	public boolean isMozeSeReciklirati() {
		return mozeSeReciklirati;
	}

	public double getOsnovnaCena() {
		return osnovnaCena;
	}
	
	
	
	
	
}
