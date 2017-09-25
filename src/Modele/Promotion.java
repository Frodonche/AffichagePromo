package Modele;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Promotion {
	protected Set<Etudiant> listeEtudiants;
	protected Set<Enseignant> listeEnseignants;
	private final String nom;
	
	public Promotion(String nom){
		this.nom = nom;
		listeEtudiants = new HashSet<Etudiant>();
		listeEnseignants = new HashSet<Enseignant>();
	}
	
	public Promotion(String nom, Set<Etudiant> listeEtu, Set<Enseignant> listeEns){
		this.nom = nom;
		listeEtudiants = new HashSet<Etudiant>(listeEtu);
		listeEnseignants = new HashSet<Enseignant>(listeEns);
	}
	
	public void addEtu(Etudiant etu){
		try{
			listeEtudiants.add(etu);
		}catch(Exception e){
			System.out.println("Etudiant deja existant");
			e.printStackTrace();
		}
	}
	
	public void addEns(Enseignant ens){
		try{
			listeEnseignants.add(ens);
		}catch(Exception e){
			System.out.println("Enseignant deja existant");
			e.printStackTrace();
		}
	}
	
	public String toString(){
		String toReturn = nom+"\n";
		toReturn +="Les etudiants : \n";
		
		Iterator<Etudiant> ite = listeEtudiants.iterator();
		while(ite.hasNext()){
			toReturn += "  "+ite.next()+"\n";
		}
		
		toReturn += "Les enseignants : \n";
		
		Iterator<Enseignant> ite2 = listeEnseignants.iterator();
		while(ite2.hasNext()) {
			toReturn += " "+ite2.next()+"\n";
		}
				
		return toReturn;
	}
}
