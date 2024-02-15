package Seance1_Interfaces;

import java.util.Scanner;

/*
 * On s'intéresse aux rectangles en coordonnées entières 
 * dans un plan. 
 * Le point en haut à gauche du plan a pour cooordonnées (0,0).
 * Les coordonnées vont croissantes en descendant, donc
 * seront toujours positives.
 * 
 * Schéma :
 * 
 * Dans cette classe rectangle, on stocke comme attributs
 * - le point en haut à gauche
 * - le point en bas à droite, dont les coordonnées doivent 
 * être supérieures à celles du point en haut à gauche
 * 
 */

public class Rectangle2pts implements IRectangle{
	//Attributes
	private Point2d PHG = new Point2d();
	private Point2d PBD = new Point2d();
	
	//Constructor
	
	public Rectangle2pts() {}
	
	public Rectangle2pts(Point2d p1, Point2d p2) {
		this.setPoint1(p1);
		this.setPoint2(p2);
	}
		
	//Acessors
	
	public void setPoint1( Point2d p) {
		if ( p == null) {
			this.PHG = new Point2d();
		}
		else {
			this.PHG = p ;
		}
	}
	
	public void setPoint2( Point2d p) {
		if (p == null) {
			this.PBD = new Point2d();
		}
		else {
		if ( ( this.PHG.getABS() > p.getABS() ) && ( this.PHG.getORD() > p.getORD() ) ){
			this.PBD = p;
		}
		}
	}
	
	public Point2d getPoint1() {
		return this.PHG;
	}
	
	public Point2d getPoint2() {
		return this.PBD;
	}
	
	public int getLongx() {
		return ( this.PBD.getORD() - this.PHG.getORD() );
	}
	
	public int getLongy() {
		return ( this.PBD.getABS() - this.PHG.getABS() );
	}
	//Methods

	public int aire() {
		return ( ( this.PBD.getORD() - this.PHG.getORD() ) * ( this.PBD.getABS() - this.PHG.getABS() ) );
	}
		
	public int perimetre() {
		return ( ( ( this.PBD.getORD() - this.PHG.getORD() ) + ( this.PBD.getABS() - this.PHG.getABS() ) ) * 2 );
	}	
		
	public void saisie(Scanner sc) {
		this.PHG.saisie(sc);
		System.out.println("~~ Création du point ~~");
		System.out.print("Donnez point d'abscisse : ");
		int exe  = (sc.nextInt());
		while (exe <= this.PHG.getABS() ) {
			System.err.print("Donnez un abscisse plus grand que abscisse 1 --> ");
			exe  = (sc.nextInt());
		}
		System.out.print("Donnez d'ordonnée : ");
		int why  = (sc.nextInt());
		while (why <= this.PHG.getORD() ) {
			System.err.print("Donnez une ordonnée plus grande que ordonnée 1 --> ");
			why  = (sc.nextInt());
	}
		this.PBD.setABS(exe);
		this.PBD.setORD(why);
	}


}
