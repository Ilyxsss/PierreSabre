package histoire;

import personnages.Commercant;
import personnages.Humain;

public class HistoireTP4 {
	public static void main(String[] args) {
		Humain professeur = new Humain("Prof", "kombucha", 54);
		professeur.direBonjour();
		professeur.acheter("une boisson", 12);
		professeur.boire();
		professeur.acheter("un jeu", 2);
		professeur.acheter("un kimono", 50);

		Commercant marco = new Commercant("Marco", 20);
		marco.direBonjour();
		marco.seFaireExtorquer();
		marco.recevoir(15);
		marco.boire();

	}
}
