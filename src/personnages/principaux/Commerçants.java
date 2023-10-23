package personnages.principaux;

public class Commerçants extends Humain {
		private String boissonFavorite = "Thé";
		
	public Commerçants(String nom, int argent, String boissonFavorite) {
		super(nom,argent);
		this.boissonFavorite = boissonFavorite;
	}
	
	public int seFaireExtorquer() {
		this.parler("J'ai tout perdu! Le monde est trop injuste...");
		int perdu = super(argent);
		this.perdreArgent(perdu);
		return perdu;
	}
	
	public void recevoir(int argent) {
		this.parler(argent + " sous ! Je te remercie généreux donateur");
		this.gagnerArgent(argent);
		
	}

}
