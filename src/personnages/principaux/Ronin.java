package personnages.principaux;

public class Ronin extends Humain{
	
	private int honneur;

	public Ronin(String nom, int argent, String boissonFavorite, int force) {
		super(nom,argent,boissonFavorite);
		this.honneur = 0;
	}
	
	public void donner(Commercant beneficiaire) {
		int don = getArgent()/10;
		honneur+=1;
		parler(beneficiaire.getNom() + " prend ces "+ don + " sous.");
		beneficiaire.recevoir(don);
	}
	
	public void provoquer(Yakuza adversaire) {
		parler("Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre marchand!");
		if (adversaire.getReputation() <= honneur*2) {
			honneur+=1;
			parler("Je t’ai eu petit yakusa!");
			this.gagnerArgent(adversaire.perdre());
			} else {
				honneur-=1;
				parler(" J'ai perdu contre ce yakuza, mon honneur et ma bourse ont en pris un coup.");
				adversaire.gagner(getArgent());
				this.perdreArgent(getArgent());
			}
	}
}
