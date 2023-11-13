package personnages.principaux;

import java.util.Random;

public class Traitre extends Samourai {

	private int niveauTraitrise=0;
	
	public Traitre(String maitre, String nom,  String boissonFavorite, int argent) {
		super(maitre,nom,boissonFavorite,argent);
	}
	
	@Override
	public void direBonjour() {
		super.direBonjour();
		parler("Mon niveau de Traitrise est de " + niveauTraitrise + ".");
	}

	public void ranconner(Commercant commercant) {
		if (niveauTraitrise<3) {
			int argentRanconner = commercant.getArgent()* 2/10;
			this.gagnerArgent(argentRanconner);
			commercant.perdreArgent(argentRanconner);
			parler("Si tu veux ma protection contre les Yakuzas, il va falloir payer ! Donne moi " + argentRanconner + " sous ou gare à toi");
			commercant.parler("Tout de suite grand " + this.getNom() + ".");
		} else {
			parler("Mince je ne peux plus rançonner sinon un samourai risque de me démasuqer !");
		}
	}
	
	public void faireLeGentil() {
		if (nbConnaissance<1) {
			parler ("Je ne peux faire ami ami avec personne car je ne connais personne ! Snif");
		} else {
			int don = getArgent() * 1/20;
			Random random = new Random();
			Humain ami = memoire[random.nextInt(0,nbConnaissance)];
			String nomAmi = ami.getNom();
			parler("Il faut absolument remonter ma cote de confiance. Je vais faire ami ami avec " + nomAmi + ".");
			parler("Bonjour l'ami ! Je voudrais vous aider en vous donnant" + don + "sous");
			ami.gagnerArgent(don);
			this.perdreArgent(don);
			ami.parler("Merci " + getNom() + ". Vous etes quelqu'un de bien.");
			niveauTraitrise-=1;
		}
	}
}
