package Seance1_Interfaces;

import java.util.Scanner;

public class Carre1pt1lg implements ICarre
{

	private Point2d pointCarr = new Point2d();
	private int	L;
	
	
	public Carre1pt1lg() {}
	
	public Carre1pt1lg(Point2d p1, int l) {
		this.setPoint(p1);
		this.setLong(l);
	}
	
	public void setPoint(Point2d p) {
		if ( p == null) {
			this.pointCarr = new Point2d();
		}
		else {
			this.pointCarr = p ;
		}
	}
	
	
	public void setLong(int lx) {
		if (lx > 0) {
			this.L = lx;
		}
		else {
			System.err.println("Longueure nulle ou négarive !");
			this.L = 1;
		}
	}
	
	public Point2d getPoint1() {
		return this.pointCarr;
	}
	
	public Point2d getPoint2() {
		int x2 = this.pointCarr.getABS() + L;
		int y2 = this.pointCarr.getORD() + L;
		Point2d p2 = new Point2d(x2, y2);
		return p2;
	}

	
	public int getLongx() {
		return L;
	}

	
	public int getLongy() {
		return L;
	}

	
	public int cote() {
		return L;
	}
	
	public void saisie(Scanner sc) {
		this.pointCarr.saisie(sc);
		System.out.print("Donnez la Cote : ");
		int exe  = (sc.nextInt());
		while (exe <= 0 ) {
			System.err.print("Donnez une longueure positive !! --> ");
			exe  = (sc.nextInt());
	}
		this.setLong(exe);
		
	}

	


}
