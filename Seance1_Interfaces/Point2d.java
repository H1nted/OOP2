package Seance1_Interfaces;

import java.util.Scanner;

/*
 * Cette classe doit décrire des points en 2 dimensions
 * en coordonnées entières et positives.
 * On placera comme attributs les 2 coordonnées :
 * - en abscisse (x)
 * - en ordonnées (y)
 */

public class Point2d {
	
	//attributes
	
	private int abs ; 
	private int ord ;
	
	//Constructor
	
	public Point2d() {}
	
	public Point2d(int x, int y) {
		this.setABS(x);
		this.setORD(y);
	}
	
	//Accessors
	public int getABS() {
		return abs;
	}
	
	public int getORD() {
		return ord ;
	}
	
	public void setABS( int x) {
		if ( x >= 0) {
			this.abs = x ;
		}
		else {
			System.err.println("Coord négative");
			this.abs = 0;
		}
		
	}
	
	public void setORD( int y) {
		if ( y >= 0) {
			this.ord = y ;
		}
		else {
			System.err.println("Coord négative");
			this.ord = 0;
		}
		
	}
	public void saisie(Scanner sc) {
		System.out.println("~~ Création du point ~~");
		System.out.print("Donnez le point d'abscisse : ");
		int exe  = (sc.nextInt());
		while (exe < 0 ) {
			System.err.print("Donnez une coord positive !! --> ");
			exe  = (sc.nextInt());
		}
		System.out.print("Donnez le point d'ordonnée : ");
		int why  = (sc.nextInt());
		while (why < 0 ) {
			System.err.print("Donnez une coord positive !! --> ");
			why  = (sc.nextInt());
	}
		this.setABS(exe);
		this.setORD(why);

}
	
	
}