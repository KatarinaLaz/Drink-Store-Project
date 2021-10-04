package d16_9_2021;

import java.util.ArrayList;

public class Korpa {

//	Kreirati klasu Korpa koja ima:
//	niz ambalaza
//	metodu dodaj ambalazu
//	metodu izbaci ambalazu, u funkciju se prosledjuje barkod flase (String) koju treba izbaciti
//	privatnu metodu koja vraca cenu svih ambalaza sa popustom, metoda kao parametar prima popust. 
//	metodu koja racuna i vraca ukupncu cenu korpe (sabira sve cene ambalze), kao parametar funkcije se prima Super karticu iz koje se cita popust.
	
	ArrayList<Ambalaza> ambalaze = new ArrayList<Ambalaza>();
	
//	METODE
	
	public void dodajAmbalazu(Ambalaza ambalaza) {
		ambalaze.add(ambalaza);
	}
	
	public void izbaciAmbalazu(String barkod) {
		for (int i = 0; i < ambalaze.size(); i++) {
			if (ambalaze.get(i).getBarkod() == barkod) {
				ambalaze.remove(i);
			}
		}
	}
	
	private double cenaSvihAmbalaza(double popust) {
		double ukupno = 0;
		for (int i = 0; i < ambalaze.size(); i++) {
			ukupno = ukupno + ambalaze.get(i).cenaArtikla();
		}
		ukupno = ukupno - popust;
		return ukupno;
	}
//	metodu koja racuna i vraca ukupncu cenu korpe (sabira sve cene ambalze), kao parametar funkcije se prima Super karticu iz koje se cita popust.	
	public double cenaKorpe(SuperKartica kartica) {
		double korpa = this.cenaSvihAmbalaza(kartica.getPopust());
		return korpa;
	}
	
	public void stampa() {
		for (int i = 0; i < ambalaze.size(); i++) {
			ambalaze.get(i).stampa();
		}
	}
	
	
	
	
	
	
}
