package Modele;

import java.util.Calendar;

public class Etudiant extends Personne{
	protected final int birth;
	protected static int idCpt = 1;
	protected final int id;
	
	public Etudiant(String nom, String prenom, int naissance){	
		this.birth = naissance;
		this.nom = nom;
		this.prenom = prenom;
		this.id = idCpt; // on récupère la valeur du compteur
		this.idCpt += 1;	// puis on l'incrémente pour la prochaine création
	}
	
	public int getAge(){		
		return Calendar.getInstance().get(Calendar.YEAR) - birth;
	}
	
	public int getId(){
		return id;
	}
	
	public String toString(){
		return new String("Etudiant "+nom+" "+prenom+" (noEt = "+id+") : "+getAge()+" ans");
	}
}
