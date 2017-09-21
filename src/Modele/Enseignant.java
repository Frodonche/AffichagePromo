package Modele;

public abstract class Enseignant extends Personne{
	protected String matiere;
	protected int nbHeures;
	protected final int salaireH = 30;
	
	protected abstract int getSalaireAnnuel();
	
}
