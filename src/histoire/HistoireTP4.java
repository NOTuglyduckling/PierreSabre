package histoire;

import personnages.principaux.Humain;

public class HistoireTP4 {

	public static void main(String[] args) {
		Humain prof = new Humain("prof",54,"kombucha");
		Humain marco = new Commerçant("Marco",20);
		prof.direBonjour();
		prof.acheter("une boisson", 12);
		prof.boire();
		prof.acheter("un jeu", 2);
		prof.acheter("un kimono", 50);
		marco.direBonjour();
		marco.seFaireExtorter();
		marco.recevoir(15);
		marco.boire();
		
		

	}

}
