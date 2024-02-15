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
 * - la longueur sur la dimension des abscisses ("en x")
 * - la longueur sur la dimension des ordonnées ("en y")
 */

public class Rectangle1pt2lg implements IRectangle {

	//Attributes
	
	private Point2d  pointHG = new Point2d();
	private int longX ;
	private int longY;
	
	
	//Constructor
	
	public Rectangle1pt2lg() {}
	
	public Rectangle1pt2lg(int x, int y , int lx, int ly) {
		pointHG = new Point2d(x,y);
		this.setLongx(lx);
		this.setLongy(ly);	
	}
		
	public Rectangle1pt2lg(Point2d p, int lx, int ly) {
		this.setpointHG(p);
		this.setLongx(lx);
		this.setLongy(ly);
	}
		
	//Acessors
	public void setpointHG(Point2d p) {
		if ( p == null) {
			this.pointHG = new Point2d();
		}
		else {
			this.pointHG = p ;
		}
	}
	public void setLongx(int lx) {
		if (lx > 0) {
			this.longX = lx;
		}
		else {
			System.err.println("Longueure nulle ou négarive !");
			this.longX = 1;
		}
	}
	
	public void setLongy(int ly) {
		if (ly > 0) {
			this.longY = ly;
		}
		else {
			System.err.println("Longueure nulle ou négarive !");
			this.longY = 1;
		}
	}
	
	public int getLongx() {
		return this.longX;
	}
	
	public int getLongy() {
		return this.longY;
	}
	
	public Point2d getPoint1() {
		return this.pointHG;
	}
	
	public Point2d getPoint2() {
		int x2 = this.pointHG.getABS() + this.longX;
		int y2 = this.pointHG.getORD() + this.longY;
		Point2d p2 = new Point2d(x2,y2);
		return p2;
	}
		
	//Methods
		
	public int aire() {
		return (this.longX * this.longY);
	}	
	
//	public int perimetre() {
//		return ((this.longX + this.longY)*2);
//	}
		
	public void saisie(Scanner sc) {
		this.pointHG.saisie(sc);
		System.out.println("~~ Saisie des longueures ~~");
		System.out.print("Donnez la longeure X : ");
		int exe  = (sc.nextInt());
		while (exe <= 0 ) {
			System.err.print("Donnez une longueure positive !! --> ");
			exe  = (sc.nextInt());
		}
		System.out.print("Donnez la longueure Y : ");
		int why  = (sc.nextInt());
		while (why <= 0 ) {
			System.err.print("Donnez une longueure positive !! --> ");
			why  = (sc.nextInt());
	}
		this.setLongx(exe);
		this.setLongy(why);
		}
}
