package Seance2_generique;

import java.util.ArrayList;

public class FileAttente<E extends Uwelcome> {
	
	private String nomFile;
	private static int nbEntreesTotal = 0;
	private ArrayList<E> contenu;
	
	
	public FileAttente(){
		contenu=new ArrayList<E>();
		}
	
	
	
	
	public void entre(E p){
		contenu.add(p); 
		nbEntreesTotal++;
		}
	
	public E sort(){
		E p=null;
		if (!contenu.isEmpty())
			{p=contenu.get(0);
			contenu.remove(0);}
	return p;
	}
	
	
	public int nbElements(){
		return contenu.size();
		}
	
	public boolean estVide(){
		return contenu.isEmpty();
		}
	
	private String descriptionContenu()
	{
	String resultat = "";
	for (E p:this.contenu)
		resultat += p + " ";
	return resultat;
	}
	
	public String toString(){
		return ""+descriptionContenu();
		}
	
	public static int allEntries(){
		return nbEntreesTotal;
	}

	public static <A extends Uwelcome> boolean isSimilar(FileAttente <A> e1, FileAttente <A> e2) {
		
//		if (e1.contenu.size() == e2.contenu.size()) {
//			return false;
//		}
//		
		for( A element : e1.contenu) {
			if (!e2.contenu.contains(element)) {
				return false;

			}
			
		}
				
		return true;
	}
	
	public boolean kindaSimiar(FileAttente <E> e) {
		
		for (E element : e.contenu) {
			if (!e.contenu.contains(element)) {
				return false;
			}
		}
		return true;
	}
	
	public boolean lengthSim(FileAttente <?> e) {
		if (this.nbElements() == e.nbElements()) {
			return true;
		}
		return false;
	}
	
	public void ShuffleOut(FileAttente <? super E> e) {
		if (!this.contenu.isEmpty()) {
			e.entre((this.sort()));
		}
		
	}
	
	public void ShuffleInto (FileAttente <? extends E> e) {
		if(!e.contenu.isEmpty()) {
			this.entre(e.sort());
		}
	}
		

}

