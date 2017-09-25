package Modele;

public class Professeur extends Enseignant{
	private final int BONUS = 10;
	
	public Professeur(String nom, String prenom, String matiere, int nbHeures){
		this.nom = nom;
		this.prenom = prenom;
		this.matiere = matiere;
		this.nbHeures = nbHeures;
		
		if(this.nbHeures >= 0)
			this.salaireA = calculSalaireAnnuel();
			
	}

	@Override
	protected int calculSalaireAnnuel() {
		int salaireAnnuel = 2000 * 12; // 2000 euros par mois en annuel
		
		if(nbHeures > 200)  // si des heures supp ont été faites
			salaireAnnuel += (nbHeures-200) * (30 + BONUS); // on ajoute le bonus sur les heures supp

		return salaireAnnuel;
	}

}
