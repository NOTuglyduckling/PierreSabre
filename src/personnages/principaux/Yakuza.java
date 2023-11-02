package personnages.principaux;

public class Yakuza extends Humain{
	
	private int reputation;
	private String clan;
	
	public Yakuza(String nom, int argent,String boissonFavorite, String clan) {
		super(nom,argent,boissonFavorite);
		this.clan = clan;
		this.reputation = 0 ;
		}
	
	void extorquer(Commercant victime) {
		parler(" Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
		parler(victime + ", si tu tiens à la vie donne moi ta bourse !");
		int gain = victime.seFaireExtorquer();
		reputation+=1;
		this.gagnerArgent(gain);
		parler("J’ai piqué les " + gain + " sous de " + victime
				+ ", ce qui me fait " + getArgent() + " sous dans ma"
				+ "poche. Hi ! Hi !");
		
	}

}
