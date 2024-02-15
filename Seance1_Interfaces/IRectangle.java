package Seance1_Interfaces;

import java.util.Scanner;

public interface IRectangle {
	
	public Point2d getPoint1();
	
	public Point2d getPoint2();
	
	public int getLongx();
	
	public int getLongy();
	
	public void saisie(Scanner sc);
		
	default int aire() {return ((this.getLongx() * this.getLongy()));}
	
	default int perimetre() {return ((this.getLongx() + this.getLongy()) * 2);}
	
//	public int perimetre();
	

}
