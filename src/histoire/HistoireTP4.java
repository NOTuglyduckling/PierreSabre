package histoire;

import personnages.principaux.Humain;

public class HistoireTP4 {

	public static void main(String[] args) {
		Humain prof = new Humain("prof",54,"kombucha");
		prof.direBonjour();
		prof.acheter("une boisson", 12);
		prof.boire();
		prof.acheter("un jeu", 2);
		prof.acheter("un kimono", 50);
		
		

		

	}

}
