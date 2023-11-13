package personnages.principaux;

public class Humain {
	
	private String nom;
	private int argent;
	private String boissonFavorite;
	protected int nbConnaissance;
	private int tailleMemoire = 3;
	private int compteur = 0;
	protected Humain[] memoire = new Humain[tailleMemoire];
	
	public Humain(String nom, int argent, String boissonFavorite) {
		this.nom = nom;
		this.argent = argent;
		this.boissonFavorite = boissonFavorite;
		this.nbConnaissance = 0;
	}
	
	public String getNom() {
		return nom;
	}
	
	public int getArgent() {
		return argent;
	}
	
	public void listerConnaissance() {
		String s ="Je connais beaucoup de monde dont :";
		
		for (int i = 0; i < nbConnaissance ; i++ ) {
			s+=" "+(memoire[i].getNom());
		}
		parler(s);
	}
	
	public void parler(String texte) {
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
			this.parler( "J'ai " + argent + " sous en poche."
					+ " Je vais pouvoir m'offrir " + bien + 
					" à " + prix + "sous.");
			this.perdreArgent(prix);
		} else {
			this.parler( "Je n'ai plus que " + argent + " sous en poche. "
					+ "Je ne peux même pas m'offrir " + bien + 
					" à " + prix + " sous.");
		}	
	}
	
	public void gagnerArgent(int gain) {
		this.argent += gain;
	}
	
	public void perdreArgent(int perte) {
		this.argent -= perte;
	}
	
	public void memoriser(Humain autreHumain) {
		if (nbConnaissance<tailleMemoire) {
			nbConnaissance+=1;
		}
		if (compteur>=tailleMemoire) {
			compteur=0;
		}
		memoire[compteur]=autreHumain;
		compteur+=1;
	}
	
	public void faireConnaissanceAvec(Humain autreHumain) {
		direBonjour();
		autreHumain.direBonjour();
		autreHumain.memoriser(this);
		memoriser(autreHumain);
	}
}
