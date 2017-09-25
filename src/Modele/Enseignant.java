package Modele;

public abstract class Enseignant extends Personne{
	protected String matiere;
	protected int nbHeures;
	protected final int salaireH = 30;
	protected int salaireA;
	
	protected abstract int calculSalaireAnnuel();
	
	protected int getSalaireAnnuel() {
		return this.salaireA;
	}
	
	public String toString(){
		return(nom+" "+prenom+" en "+matiere+", salaire annuel : "+salaireA+" euros");
	}
	
}
