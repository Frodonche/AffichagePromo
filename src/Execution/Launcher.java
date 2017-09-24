package Execution;

import Modele.Etudiant;
import Modele.Promotion;

public class Launcher {
	public static void main(String[] args){
		
		Etudiant etu1 = new Etudiant("Roth", "Guillaume1", 1995);
		Etudiant etu2 = new Etudiant("Roth", "Guillaume2", 1995);
		Etudiant etu3 = new Etudiant("Roth", "Guillaume3", 1995);
		Etudiant etu4 = new Etudiant("Roth", "Guillaume4", 1995);
		
		Promotion promo = new Promotion("Promo Master 1 2017-2018");
		promo.add(etu1);
		promo.add(etu2);
		promo.add(etu3);
		promo.add(etu4);
		
		System.out.println(promo.toString());

	}
}

// Ceci est un commentaire de test