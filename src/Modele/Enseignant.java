package Modele;

public abstract class Enseignant extends Personne{
	protected String matiere;
	protected int nbHeures;
	protected int salaireH;
	
	protected abstract int getSalaireAnnuel();
	
}
