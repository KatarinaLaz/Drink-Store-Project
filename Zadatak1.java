package d16_9_2021;

public class Zadatak1 {

	public static void main(String[] args) {

//		Kreirati abstraktnu klasu Ambalaza koja ima:
//			barkod (primer: 328232-2823)
//			naziv artikla
//			neto tezinu
//			bruto tezinu
//			konstuktore (default-ni i sa parametrima)
//			gettere i settere
//			metodu koja racuna tezinu pakovanja kao razliku bruto i neto tezine.
//			abstraktnu metodu koja vraca cenu artikla
//			abstraktnu metodu stampaj
//
//			Kreirati klasu Tetrapak koja nasledjuje klasu Ambalaza koja ima:
//			atribut koji kaze da li se moze reciklirati
//			osnovna cena
//			gettere i setter za atribute
//			konstuktori koji su vam potrebni
//			racuna cenu tako da ispunjava uslova:
//			ako je od recikliranog materijala, ( tezina pakovanja ) * 1.5 + (osnovna cena);
//			ako nije u cenu ulazi samo osnovna cena
//			metoda stampaj stampa sve podatke iz klase tetrapak.
//
//			Kreirati klasu StaklenaFlasa koja nasledjuje klasu Ambalaza koja ima:
//			kaucija za flasu
//			atribut koji kaze da li se za flasu placa kaucija
//			osnovna cena
//			gettere i setter za atribute
//			konstuktori koji su vam potrebni
//			racuna cenu
//			ako se kaucija placa, (osnovna cena) * 1.2 + (kaucija);
//			ako se ne placa, (osnovna cena) * 1.2
//			metoda stampaj stampa sve podatke iz klase staklena flasa.
//
//			Kreirati klasu SuperKartica koja ima:
//			broj kartice
//			ime i prezime vlasnika
//			popust (200, 500, … )
//			konstuktore (default-ni i sa parametrima)
//			gettere i settere 
//			metodu stampaj koja stampa karticu u formatu:
//			(broj kartice), (ime i prezime)
//
//
//			Kreirati klasu Korpa koja ima:
//			niz ambalaza
//			metodu dodaj ambalazu
//			metodu izbaci ambalazu, u funkciju se prosledjuje barkod flase (String) koju treba izbaciti
//			privatnu metodu koja vraca cenu svih ambalaza sa popustom, metoda kao parametar prima popust. 
//			metodu koja racuna i vraca ukupncu cenu korpe (sabira sve cene ambalze), kao parametar funkcije se prima Super karticu iz koje se cita popust.
//
//			U glavnom programu kreirati jednu Korpu i u nju dodati nekoliko Ambalaza razlicitih tipova i istestirati
//			sve metode i ispisati ukupnu cenu sa popustom.

		SuperKartica s1 = new SuperKartica("00431", "Katarina Lazic", 500);
		SuperKartica s2 = new SuperKartica("00471", "Slavisa Tutus", 200);
		
		Ambalaza t1 = new Tetrapak("231451-124", "Mleko", 1, 1.1, true, 020);
		Ambalaza t2 = new Tetrapak("231451-127", "Sok od narandze", 1.5, 1.6, false, 120);
		Ambalaza f1 = new StaklenaFlasa("231452-004", "Aqua Viva negazirana voda", 0.75, 0.9, 0, false, 100);
		Ambalaza f2 = new StaklenaFlasa("231452-025", "Stella Artois", 0.5, 0.7, 60, true, 150);
		Ambalaza f3 = new StaklenaFlasa("231452-026", "Mr. Jekyll Absinthe", 1, 1.3, 100, true, 800);
		
		Korpa k = new Korpa();
		k.dodajAmbalazu(t1);
		k.dodajAmbalazu(t2);
		k.dodajAmbalazu(f1);
		k.dodajAmbalazu(f2);
		k.dodajAmbalazu(f3);
		k.izbaciAmbalazu("231451-124");
		k.stampa();
		System.out.println("Ukupno za placanje: " + k.cenaKorpe(s2));
		System.out.println("---------------------------");
		System.out.println("Ukupno za placanje: " + k.cenaKorpe(s1));
		
		
		
		
		
		
		
	}

}
