package Seance8_TreeMaps;

import java.util.*;

public class MyNodeEntry<K extends Comparable<K>,V> extends MyEntry<K,V> {
	MyNodeEntry<K,V> left = null;
	MyNodeEntry<K,V> right = null;
	MyNodeEntry<K,V> parent;
	
	public MyNodeEntry(K key, V value, MyNodeEntry<K,V> parent) {
		super(key,value);
		this.parent=parent;
	}
	
	// écriture récursive de la méthode auxiliaire
	// appelée dans toString() de MyTreeMap
	
	public String toStringRec(String decalage) {
		String res = decalage+this.key.toString()+"\n";
		if (this.left != null)
				res += this.left.toStringRec(decalage+"  ");
		else res+= decalage+"  "+"."+"\n";
		if (this.right != null)
				res += this.right.toStringRec(decalage+"  ");
		else res+= decalage+"  "+"."+"\n";
		return res;
	}
	
	// méthodes demandées
	
	// écriture récursive de la méthode auxiliaire appelée 
	// par V get(K key) de MyTreeMap
	// de recherche d'une clef afin de retourner la valeur associée
	
	public V get(K key) {
//		MyNodeEntry<K,V> courant;
//		courant = this.parent;
//		while (courant != null) {
//			if (key.compareTo(courant.getKey()) > 0 ) {
//				courant = courant.right;}
//				else if (key.compareTo(courant.getKey()) < 0 ) {
//					courant = courant.left;
//				}
//				else
//					return courant.getValue();
//					
//			}
//		return null;

		if (key.compareTo(this.getKey()) > 0 && (this.right != null)) {
			return this.right.get(key);
			}
		else if (key.compareTo(this.getKey()) < 0 && (this.left != null)) {
			return this.left.get(key);			
		}
		else if (key.compareTo(this.getKey()) == 0 ) {
			return this.getValue();
		}
		else
			return null;
		}

	
	public void keySet(Set<K> res) {
		
		res.add(this.getKey());
		
		if ((this.right != null)) {
			this.right.keySet(res);
			}
		if ((this.left != null)) {
			this.left.keySet(res);
		}
	}
	
	public void keySetPrefixe(ArrayList<K> res) {
		// à écrire
	}

	public int nbFeuilles() {
		int res = 0;
		if (this.right == null && this.left == null) {
			res += 1;
		}
		if ((this.right != null)) {
			res+=this.right.nbFeuilles();
			}
		if ((this.left != null)) {
			res+=this.left.nbFeuilles();
		}
		
		return res;
	}
}
