package histoire;

import personnages.principaux.*;

public class HistoireTP5 {

	public static void main(String[] args) {
		Commercant marco = new Commercant("Marco", 20);
		Commercant chonin = new Commercant("Chonin", 40);
		Commercant kumi = new Commercant("Kumi", 10);
		Yakuza yaku = new Yakuza("Warsong","Yaku Le Noir","whisky",30 );
		Ronin roro = new Ronin("Roro",60 , "shochu");
		Traitre masako = new Traitre("Miyamoto","Masako","whisky",100);
		Samourai akimoto = new Samourai("Miyamoto","Akimoto","saké",100);
		marco.faireConnaissanceAvec(roro);
		marco.faireConnaissanceAvec(yaku);
		marco.faireConnaissanceAvec(chonin);
		marco.faireConnaissanceAvec(kumi);
		marco.listerConnaissance();
		roro.listerConnaissance();
		yaku.listerConnaissance();
		masako.faireLeGentil();
		masako.ranconner(kumi);
		masako.ranconner(marco);
		akimoto.faireConnaissanceAvec(masako);
		
		
		
		
		
	}

}
