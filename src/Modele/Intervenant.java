package Modele;

public class Intervenant extends Enseignant{

	public Intervenant(String nom, String prenom, String matiere, int nbHeures){
		this.nom = nom;
		this.prenom = prenom;
		this.matiere = matiere;
		this.nbHeures = nbHeures;
		
		if(this.nbHeures >= 0)
			this.salaireA = calculSalaireAnnuel();
	}
	
	@Override
	protected int calculSalaireAnnuel() {
		int salaireAnnuel = 30 * nbHeures * 2; // 30€ de l'heure, le nombres d'heures comptent double pour Intervenant
		return salaireAnnuel;
	}

}
