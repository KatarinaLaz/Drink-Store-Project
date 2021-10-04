package d16_9_2021;

public class StaklenaFlasa extends Ambalaza {


//	Kreirati klasu StaklenaAmbalaza koja nasledjuje klasu Ambalaza koja ima:
//	kaucija za flasu
//	atribut koji kaze da li se za flasu placa kaucija
//	osnovna cena
//	gettere i setter za atribute
//	konstuktori koji su vam potrebni
//	racuna cenu
//	ako se kaucija placa, (osnovna cena) * 1.2 + (kaucija);
//	ako se ne placa, (osnovna cena) * 1.2
//	metoda stampaj stampa sve podatke iz klase staklena flasa.
	
	private double kaucijaZaFlasu;
	private boolean kaucijaSePlaca;
	private double osnovnaCena;
	
	public StaklenaFlasa() {
		super();
	}

	public StaklenaFlasa(String barkod, String ime, double netoTezina, double brutoTezina, double kaucija, boolean placaSeKaucija, double cena) {
		super(barkod, ime, netoTezina, brutoTezina);
		this.kaucijaZaFlasu = kaucija;
		this.kaucijaSePlaca = placaSeKaucija;
		this.osnovnaCena = cena;
	}

//	METODE
	
	@Override
	public double cenaArtikla() {
		double cena = 0;
		if (kaucijaSePlaca == true) {
			cena = osnovnaCena * 1.2 + kaucijaZaFlasu;
		} else {
			cena = osnovnaCena * 1.2;
		}
		return cena;
	}
	
	@Override
	public void stampa() {
		System.out.println(ime + ", " + barkod);
		System.out.println("Cena: " + this.cenaArtikla());
		System.out.println("Tezina pakovanja: " + this.tezinaPakovanja());
		if (kaucijaSePlaca == true) {
			System.out.print("Placa ");
		} else {
			System.out.print("Ne placa ");
		}
		System.out.println("se kaucija");
		System.out.println();
		
	}

//	GETTERS & SETTERS
	
	public double getKaucijaZaFlasu() {
		return kaucijaZaFlasu;
	}

	public boolean isKaucijaSePlaca() {
		return kaucijaSePlaca;
	}

	public double getOsnovnaCena() {
		return osnovnaCena;
	}
	
	
	
	
	
}
