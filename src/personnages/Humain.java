package personnages;

public class Humain {
	
	private String nom;
	private int argent;
	private String boissonFavorite;
	
	public Humain(String nom, int argent, String boissonFavorite) {
		this.nom = nom;
		this.argent = argent;
		this.boissonFavorite = boissonFavorite;
	}
	
	public String getNom() {
		return nom;
	}
	public int getArgent() {
		return argent;
	}
	private void parler(String texte) {
		System.out.println("("+nom+")- " + texte);
	}
	public void direBonjour() {
		this.parler("Bonjour ! Je m'appelle " + nom +
				" et j'aime boire du " + boissonFavorite);
	}
	public void boire() {
		this.parler("Mmmm, un bon verre de " + boissonFavorite + 
				" ! GLOUPS !");
	}
	public void acheter(String bien, int prix) {
		if (argent>prix) {
			int budget = this.argent;
			this.perdreArgent(prix);
			this.parler( "J'ai " + budget + " sous en poche."
					+ " Je vais pouvoir m'offrir " + bien + 
					" à " + prix + "sous.");
		} else {
			this.parler( "Je n'ai plus que " + argent + " sous en poche. "
					+ "Je ne peux même pas m'offrir " + bien + 
					" à " + prix + " sous.");
		}	
	}
	private void gagnerArgent(int gain) {
		this.argent += gain;
	}
	private void perdreArgent(int perte) {
		this.argent -= perte;
	}
}
