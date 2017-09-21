package Modele;

public abstract class Personne {
	protected String nom;
	protected String prenom;
	
	protected String getNom(){
		return new String(this.nom);
	}
	
	protected String getPrenom(){
		return new String(this.prenom);
	}
}
