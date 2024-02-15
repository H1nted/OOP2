package Seance4_assertion;

import java.util.ArrayList;

public class Pile<T> implements IPile<T>{
	
	
	// structure de stockage interne des ´el´ements
	private ArrayList<T> elements;
	
	
	// Mise en oeuvre des op´erations
	
	public Pile(){
		initialiser();
		assert this.estVide();
		}
	
		
	public T depiler() throws PileVideException{
		int sizeO = this.elements.size();
		if (this.estVide())
			throw new PileVideException("en depilant");
		T sommet = elements.get(elements.size()-1);
		elements.remove(sommet);
		int sizel = this.elements.size();
		assert sizel == (sizeO - 1) : "diminuer de plus que 1";
		
	return sommet;
	}
	
		
	public void empiler(T t) throws PileVideException {
		int sizeO = this.taille();
		elements.add(t);
		assert this.sommet()==t : "dernier empile ="+this.sommet();
		int sizel = this.taille();
		assert sizel == (sizeO - 1) : "augmenter de plus que 1";
		}
	
	
	public boolean estVide() 
		{return elements.isEmpty();
		}
	
		
	public void initialiser() 
		{elements = new ArrayList<T>();
		}
	
	
	public T sommet() throws PileVideException{
		if (this.estVide())
		throw new PileVideException("en d´epilant");
	return elements.get(elements.size()-1);
		}
	
	
	public int taille()
		{return elements.size();
		}
	
	
	public String toString()
		{return "Pile = "+ elements;
		}
	
	
}