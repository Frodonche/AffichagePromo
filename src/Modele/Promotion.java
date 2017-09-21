package Modele;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Promotion {
	protected Set<Etudiant> listeEtudiants;
	private final String nom;
	
	public Promotion(String nom){
		this.nom = nom;
		listeEtudiants = new HashSet<Etudiant>();
	}
	
	public Promotion(String nom, Set<Etudiant> listeEtu){
		this.nom = nom;
		listeEtudiants = new HashSet<Etudiant>(listeEtu);
	}
	
	public void add(Etudiant etu){
		try{
			listeEtudiants.add(etu);
		}catch(Exception e){
			System.out.println("Etudiant deja existant");
			e.printStackTrace();
		}
	}
	
	public String toString(){
		String toReturn = nom+"\n";
		Iterator<Etudiant> ite = listeEtudiants.iterator();
		while(ite.hasNext()){
			toReturn += ite.next()+"\n";
		}
		return toReturn;
	}
}
