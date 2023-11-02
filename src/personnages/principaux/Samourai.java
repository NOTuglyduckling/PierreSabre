package personnages.principaux;

public class Samourai extends Humain{

	public Samourai(String nom, int argent, String boissonFavorite) {
		super(nom,argent,boissonFavorite);
	}
	@Override
	public void direBonjour() {
		this.direBonjour();
		parler("Je suis fier de servir le seigneur Miyamoto.");
	}
	public void boire(String boisson) {
		parler("Qu'est-ce que je vais choisir comme boisson ? Tiens je vais prendre\r\n"
				+ "du " + boisson + ".");
	}
}
