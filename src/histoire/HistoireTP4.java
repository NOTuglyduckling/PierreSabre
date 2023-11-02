package histoire;

import personnages.principaux.*;

public class HistoireTP4 {

	public static void main(String[] args) {
		Humain prof = new Humain("prof",54,"kombucha");
		Commercant marco = new Commercant("Marco",20);
		Yakuza yaku = new Yakuza("Yaku le Noir",30,"Whisky","Warsong");
		Ronin roro = new Ronin("Roro",60,"shochu",3);
		prof.direBonjour();
		prof.acheter("une boisson", 12);
		prof.boire();
		prof.acheter("un jeu", 2);
		prof.acheter("un kimono", 50);
		marco.direBonjour();
		yaku.direBonjour();
		yaku.extorquer(marco);
		roro.direBonjour();
		roro.donner(marco);
		marco.boire();
		roro.provoquer(yaku);
		
		

	}

}
