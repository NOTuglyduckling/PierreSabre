package personnages.principaux;

public class Samourai extends Humain{
	
	private String maitre;

	public Samourai(String maitre, String nom, String boissonFavorite, int argent) {
		super(nom,argent,boissonFavorite);
		this.maitre = maitre;
	}
	@Override
	public void direBonjour() {
		super.direBonjour();
		parler("Je suis fier de servir le seigneur " + maitre + ".");
	}
	public void boire(String boisson) {
		parler("Qu'est-ce que je vais choisir comme boisson ? Tiens je vais prendre\r\n"
				+ "du " + boisson + ".");
	}
}
