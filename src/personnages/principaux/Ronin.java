package personnages.principaux;

public class Ronin extends Humain{

	public Ronin(String nom, int argent, String boissonFavorite) {
		super(nom,argent,boissonFavorite);
	}
	
	public void donner(Commercant beneficiaire) {
		int don = getArgent()/10;
		parler(beneficiaire.getNom() + " prend ces "+ don + " sous.");
		beneficiaire.recevoir(don);
	}
}
