package personnages.principaux;

public class Commercant extends Humain {
		
	public Commercant(String nom, int argent) {
		super(nom,argent,"Thé");
	}
	
	public int seFaireExtorquer() {
		parler("J'ai tout perdu! Le monde est trop injuste...");
		int perdu = getArgent();
		this.perdreArgent(perdu);
		return perdu;
	}
	
	public void recevoir(int argent) {
		parler(argent + " sous ! Je te remercie généreux donateur");
		this.gagnerArgent(argent);
	}

}
