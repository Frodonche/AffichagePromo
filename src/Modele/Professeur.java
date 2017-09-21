package Modele;

public class Professeur extends Enseignant{
	
	public Professeur(String nom, String prenom, String matiere, int nbHeures, int salaireH){
		this.nom = nom;
		this.prenom = prenom;
		this.matiere = matiere;
		this.nbHeures = nbHeures;
		this.salaireH = salaireH;
	}

	@Override
	protected int getSalaireAnnuel() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public String toString(){
		return(nom+" "+prenom+", enseigne : "+matiere+" pendant "+nbHeures+" heures pour un salaire horaire de "+salaireH+"€");
	}

}
