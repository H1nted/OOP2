package seance7_Hashmaps_1;
import java.util.ArrayList;
import java.util.HashMap;

public class PromotionHashMaps {

	
	private HashMap<String,Etudiant> etudiants; 
	
	private String nom = "nom à renseigner";
	
	private int annee = 2020;

	public PromotionHashMaps() {
		this.etudiants = new HashMap<>();
	}
	
	public PromotionHashMaps(int annee){
	    this.setAnnee(annee);
	    this.etudiants = new HashMap<String,Etudiant>();
	 }
	
	public PromotionHashMaps(String nom, int annee){
		this.setNom(nom);
	    this.setAnnee(annee);
	    this.etudiants = new HashMap<String,Etudiant>();
	 }

	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getAnnee() {
		return annee;
	}

	public void setAnnee(int annee) {
		this.annee = annee;
	}
	
	// Dans une version avec Map : le paramètre ne sera plus un entier
	// mais le numéro de l'étudiant
	
	public Etudiant getEtudiant(String i){
		  if(this.etudiants.containsKey(i)){
		    return this.etudiants.get(i);
		  }else{
		    System.out.println("ERREUR: Vous sortez de la liste!");
		    return null;
		  }
		}
	
	public int nbEtudiants() {
		return this.etudiants.size();
	}
	
	public void inscrire(Etudiant e) {
				
		if (this.etudiants.get(e.getNumEtu()) != null )
		{
			System.out.println("déjà présent");
		}		
		else {
			this.etudiants.put(e.getNumEtu(),e);
		}
	}
	
	public double moyenneGénérale(){
	    if (this.etudiants.isEmpty()){ 
	      return 0;
	    }
	    double somme = 0; 
	    for (Etudiant e : this.etudiants.values()) {
	    	somme += e.moyenne();
	    }
	    return somme/this.nbEtudiants();
	  }
	

	  public void afficheResultats()
	   {
	     for(Etudiant e: this.etudiants.values())
	     {
	       System.out.println(e.ligneResultats());
	     }
	   }
	  
	  public Etudiant recherche(String nom)
	   {
	     for(Etudiant e : this.etudiants.values())
	     {
	       if(nom.equals(e.getNom())) 
	       {
	         return e;
	       }	  
	     }     
	     return null;
	   }
	  	  
	  public ArrayList<Etudiant> admis(){
		    
		    ArrayList<Etudiant> resultat = new ArrayList<>();

		    for (Etudiant e: this.etudiants.values()){

		      if(e.moyenne() >= 10) resultat.add(e);
		    }

		    return resultat;
		  }
	  
	  
	  public ArrayList<Etudiant> etuEtrangerNonFranco() {
	        ArrayList<Etudiant> listeN = new ArrayList<>();
	        for (Etudiant e : this.etudiants.values()) {
	            if (e.getCodePays() 
	            		== CodePays.etuEtrangerNonFrancophone) {
	                listeN.add(e);
	            }
	        }
	        return listeN;
	    }

	  // méthode en 2 itérations
	  public ArrayList<Etudiant> majorsv1(){

		    ArrayList<Etudiant> resultat = new ArrayList<>();
		    double moyMax = 0;
 
		    for (Etudiant e: this.etudiants.values()){
		    // moyMax est la meilleure moyenne rencontrée
		    // jusqu'à l'étape courante
	          double moyCourante = e.moyenne();
		      if (moyMax < moyCourante){
		        moyMax = moyCourante;
		      }
		    }
		    
		    // moyMax est la meilleure moyenne
		    // on récupère les étudiants qui ont cette meilleure moyenne
		    
		    for (Etudiant e: this.etudiants.values()){
		      if (moyMax == e.moyenne()){
		        resultat.add(e);
		      }
		    }
		    
		    return resultat;
	  }

		    // méthode en une itération
	    public ArrayList<Etudiant> majors() {
	        ArrayList<Etudiant> listeM = new ArrayList<>();
	        double moyenneM = 0.0;

	        for (Etudiant e : this.etudiants.values()) {
	        	double moyCourante = e.moyenne();
	            if (moyCourante > moyenneM) {
	                listeM.clear();
	                listeM.add(e);
	                moyenneM = moyCourante;
	            } else if (moyCourante == moyenneM) {
	                listeM.add(e);
	            }
	        }
	        return listeM;
	    }

}
