package Execution;

import java.util.HashSet;
import java.util.Set;

import Modele.Enseignant;
import Modele.Etudiant;
import Modele.Matiere;
import Modele.Promotion;

public class Programme {
	protected Set<Etudiant> listeEtudiants;
	protected Set<Enseignant> listeEnseignants;
	protected Set<Promotion> listePromotions;
	protected Set<Matiere> listeMatieres;
	
	public Programme() {
		listeEtudiants = new HashSet<Etudiant>();
		listeEnseignants = new HashSet<Enseignant>();
		listePromotions = new HashSet<Promotion>();
		listeMatieres = new HashSet<Matiere>();
	}
	
	public void ajouterEtudiant() {
		
	}
}
