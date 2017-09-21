package Modele;

import java.util.Calendar;

public class Etudiant extends Personne{
	protected final int birth;
	static int id = 1;
	
	public Etudiant(String nom, String prenom, int naissance){	
		this.birth = naissance;
		this.nom = nom;
		this.prenom = prenom;
		this.id += 1;
	}
	
	public int getAge(){		
		return Calendar.getInstance().get(Calendar.YEAR) - birth;
	}
	
	public int getId(){
		return id;
	}
	
	public String toString(){
		return new String(nom+" "+prenom+" : "+getAge()+" ans, id : "+id);
	}
}
