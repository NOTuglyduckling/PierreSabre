package personnages.principaux;

public class Yakuza extends Humain{
	
	private int reputation;
	private String clan;
	
	public Yakuza(String nom, int argent,String boissonFavorite, String clan) {
		super(nom,argent,boissonFavorite);
		this.clan = clan;
		this.reputation = 0 ;
		}
	
	public int getReputation() {
		return reputation;
	}
	
	public void extorquer(Commercant victime) {
		parler(" Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
		parler(victime.getNom() + ", si tu tiens à la vie donne moi ta bourse !");
		int gain = victime.seFaireExtorquer();
		reputation+=1;
		this.gagnerArgent(gain);
		parler("J’ai piqué les " + gain + " sous de " + victime.getNom()
				+ ", ce qui me fait " + getArgent() + " sous dans ma"
				+ "poche. Hi ! Hi !");
	}

	public int perdre() {
		reputation-=1;
		int perte = getArgent();
		parler("J'ai perdu mon duel et mes " + perte + " sous, snif... J'ai déshonoré le clan de " + clan + ".");
		this.perdreArgent(perte);
		return perte;
	}
	public void gagner(int gain) {
		reputation+=1;
		parler(" Ce ronin pensait vraiment battre " + getNom() + " du clan de " + clan +
			" ? Je l'ai dépouillé de ses " + gain + " sous.");
		this.gagnerArgent(gain);
	}
	
	@Override
	public void direBonjour() {
		this.direBonjour();
		parler("Mon clan est celui de " + clan + ".");
	}
}
