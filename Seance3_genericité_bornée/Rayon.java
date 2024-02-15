package Seance3_genericité_bornée;

import java.util.ArrayList;

public class Rayon<E extends ObjetAvecEtiquette> {
	
	private ArrayList<E> contenu = new ArrayList<E>();
	
	public Rayon() {}
	
	public String listingContenu() {
		String listing="";
		for (E p: this.contenu) 
			listing += p.etiquette() + "/ ";
		return listing;}
	

	public void addContenu(E p) {
		if (!this.contenu.contains(p)) {
			this.contenu.add(p);
		                               }
		else {
			System.out.println("Article déjà présent dans le rayon");
			 }
		                          }
	
}

