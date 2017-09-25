package Execution;

import java.util.Scanner;

import Modele.Enseignant;
import Modele.Etudiant;
import Modele.Intervenant;
import Modele.Professeur;
import Modele.Promotion;

public class Launcher {
	public static void main(String[] args){
		//test1();
		int inputMenu = -1;
		Scanner scan;
		
		while(inputMenu != 0) {
			displayMenu();
			scan = new Scanner(System.in);
			
			try {
				inputMenu = scan.nextInt();
				
				switch(inputMenu) {
				case 0 : 
					System.out.println("Au revoir");
					break;
				}
				
			}catch(Exception e) {
				System.out.println("Mauvais input\n");
			}
		}
		
		
	}

	private static void displayMenu(){
		System.out.println("--- Menu ---\n"+
						"1- Afficher une promotion\n"+
						"2- Ajouter une promotion\n"+
						"3- Ajouter un etudiant\n"+
						"4- Ajouter un enseignant\n"+
						"5- Ajouter une matiere\n"+
						"0- Quitter"
				);
	}
	
	private static void test1() { // un test de base avec ajout des Etudiants / Enseignants en dur
		
		Etudiant etu1 = new Etudiant("Roth", "Guillaume1", 1995);
		Etudiant etu2 = new Etudiant("Roth", "Guillaume2", 1995);
		Etudiant etu3 = new Etudiant("Roth", "Guillaume3", 1995);
		Etudiant etu4 = new Etudiant("Roth", "Guillaume4", 1995);
		
		Promotion promo = new Promotion("Promo Master 1 2017-2018");
		promo.addEtu(etu1);
		promo.addEtu(etu2);
		promo.addEtu(etu3);
		promo.addEtu(etu4);
		
		Enseignant ens1 = new Professeur("Toupi", "Jean-Jacques", "Info", 220);
		Enseignant ens2 = new Intervenant("Onche", "Jean-Norbert", "Maths", 220);
		
		promo.addEns(ens1);
		promo.addEns(ens2);
		
		System.out.println(promo.toString());
	}

}