package Seance6_linked_list;

public class MainMyNode {
	public static void main(String[] arg) {
		
		// On cree 3 MyNode isoles contenant les lettres "e", "n", "z"
		
		MyNode<String> e = new MyNode<String>(null, "e", null);
		MyNode<String> n = new MyNode<String>(null, "n", null);
		MyNode<String> z = new MyNode<String>(null, "z", null);
		
		// On attache les noeuds entre eux pour qu'ils soient dans l'ordre
		// "n" "e" "z
		// celui qui porte "n" est le premier et a pour suivant celui qui porte "e"
		
		n.next=e;
		
		// celui qui porte "e" a pour suivant celui qui porte "z"
		// et pour précédent celui qui porte "n"
		
		e.next=z;
		e.prev=n;
		
		// celui qui porte "z" pour précédent celui qui porte "e"

		z.prev=e;
		
		// Pour vérifier que la chaine est bien construite du début vers la fin, 
		// on parcourt en partant du noeud contenant "n"
		System.out.println("#########################################################################################");
		
		System.out.println("--------------- Avance --------------- ");	
		MyNode<String> courant1 = n;
		while (courant1 !=null) {
			System.out.print(courant1.item);
			courant1 = courant1.next; // on avance
		}
		
		System.out.println();

		// et on le fait en sens inverse
		System.out.println("--------------- Recule ---------------");	
		MyNode<String> courant2 = z;
		while (courant2 !=null) {
			System.out.print(courant2.item);
			courant2 = courant2.prev; // on revient en arrière
		}
		System.out.println();
		System.out.println();
		
		// Exercice 0 : ajouter "o" entre "e" et "z" et vérifier que les liens
		// sont bien reconstitués en parcourant dans un sens puis dans l'autre
		System.out.println("#########################################################################################");
		System.out.println("Exercice 0 : ajouter \"o\" entre \"e\" et \"z\" ");
		System.out.println();
		
		MyNode<String> o = new MyNode<String>(e, "o", z);
		
		e.next =o;
		z.prev =o;
		
		System.out.println("--------------- Avance --------------- ");	
		MyNode<String> ex0go = n;
		while (ex0go !=null) {
			System.out.print(ex0go.item);
			ex0go = ex0go.next;} // on avance
		
		System.out.println();
		
		System.out.println("--------------- Recule ---------------");	
		MyNode<String> ex0back  = z;
		while (ex0back !=null) {
			System.out.print(ex0back.item);
			ex0back = ex0back.prev; // on revient en arrière
		}
		System.out.println();
		System.out.println();
		
		// Exercice 1 : Creer 4 MyNode isoles contenant les lettres "a", "d", "o", "s"
		System.out.println("#########################################################################################");
		System.out.println("Exercice 1 : Creer 4 MyNode isoles contenant les lettres \"a\", \"d\", \"o\", \"s\"");
		System.out.println();
		MyNode<String> a = new MyNode<String>(null, "a", null);
		MyNode<String> d = new MyNode<String>(null, "d", null);
		MyNode<String> s = new MyNode<String>(null, "s", null);
		o.next = null;
		o.prev = null;
		
		if (a.prev != null) {
			System.out.println(" Prev : "+a.prev.item+" | Node : "+a.item+" | Next : "+a.next.item);}
		else {
			System.out.println(" Node isolée : "+a.item);
		}
		System.out.println();
		if (d.prev != null) {
			System.out.println(" Prev : "+d.prev.item+" | Node : "+d.item+" | Next : "+d.next.item);}
		else {
			System.out.println(" Node isolée : "+d.item);
		}
		System.out.println();
		if (o.prev != null) {
			System.out.println(" Prev : "+o.prev.item+" | Node : "+o.item+" | Next : "+o.next.item);}
		else {
			System.out.println(" Node isolée : "+o.item);
		}
		System.out.println();
		if (s.prev != null) {
			System.out.println(" Prev : "+s.prev.item+" | Node : "+s.item+" | Next : "+s.next.item);}
		else {
			System.out.println(" Node isolée : "+s.item);
		}
		System.out.println();	
		// Exercice 2 : attacher les MyNode entre eux 
		// pour qu'ils soient dans l'ordre "a" puis "d" puis "o" puis "s"
		System.out.println("#########################################################################################");
		System.out.println("Exercice 2 : attacher les MyNode entre eux");
		System.out.println();
		
		a.next = d;
		d.prev = a;
		d.next = o;
		o.prev = d;
		o.next = s;
		s.prev = o;

		// Exercice 3 : vérifier que la chaine est bien construite du début vers la fin 
		// cela doit afficher "ados"
		System.out.println("#########################################################################################");
		System.out.println("Exercice 3 : vérifier que la chaine est bien construite du début vers la fin cela doit afficher \"ados\"");
		System.out.println();
		System.out.println("--------------- Avance --------------- ");	
		MyNode<String> ex2go = a;
		while (ex2go !=null) {
			System.out.print(ex2go.item);
			ex2go = ex2go.next;} // on avance
		System.out.println();
		System.out.println();
		// Exercice 4 : vérifier que la chaine est bien construite de la fin vers le début
		// cela doit afficher "soda"
		System.out.println("#########################################################################################");
		System.out.println("Exercice 4 : vérifier que la chaine est bien construite de la fin vers le début cela doit afficher \"soda\"");
		System.out.println();	
		System.out.println("--------------- Recule ---------------");	
		MyNode<String> ex2back  = s;
		while (ex2back !=null) {
			System.out.print(ex2back.item);
			ex2back = ex2back.prev; // on revient en arrière
		}
		System.out.println();
	}
}
