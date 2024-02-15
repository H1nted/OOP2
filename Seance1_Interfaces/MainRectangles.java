package Seance1_Interfaces;

import java.util.Scanner;

public class MainRectangles {

	public static void main(String[] arg) {
		System.out.println("HELLO WORLD");
		
		Scanner sc = new Scanner(System.in);
		
		Point2d p1 = new Point2d(0,0);
		Point2d p2 = new Point2d(4,4);
		Point2d p3 = new Point2d(2,2);
		
		
		System.out.println("######################## Création des rectangles 1 point 2 lignes ########################");
		System.out.println();
		IRectangle r1 = new Rectangle1pt2lg();
		IRectangle r2 = new Rectangle1pt2lg();
		System.out.println("Rectangle 1 :");		
		r1.saisie(sc);
		System.out.println();
		System.out.println("Rectangle 2 :");
		r2.saisie(sc);
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		System.out.println("######################## Création du rectangle 2 points ########################");
		System.out.println();
		IRectangle r2p1 = new Rectangle2pts();
		System.out.println("Rectangle 3 :");
		r2p1.saisie(sc);
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		System.out.println("######################## Création des carrés 1 point 1 ligne ########################");
		System.out.println();
		ICarre c1 = new Carre1pt1lg();
		System.out.println("Carré 1 :");
		c1.saisie(sc);
		System.out.println();
		ICarre c2 = new Carre1pt1lg();
		System.out.println("Carré 2 :");
		c2.saisie(sc);
		
		
		//######################## DRAWING CREATION ########################
		
		DessinAvecRectangles dessin1 = new DessinAvecRectangles();
				
		dessin1.ajoute(r1);
		dessin1.ajoute(r2);	

		dessin1.ajoute(r2p1);
		
		dessin1.ajoute(c1);
		dessin1.ajoute(c2);
		
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("**aire moyenne  : "+dessin1.aireMoyenne());
		

		

		
	}
}

