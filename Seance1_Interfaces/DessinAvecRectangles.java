package Seance1_Interfaces;

import java.util.ArrayList;

public class DessinAvecRectangles {
	// attributs
	
		private ArrayList<IRectangle> listeRectangles
											= new ArrayList<>();
		
		// constructeurs
		
		public DessinAvecRectangles() {}
		
		// méthodes
		
		public void ajoute(IRectangle r) {
			if (! listeRectangles.contains(r))
				listeRectangles.add(r);
		}
		
		public int aireMoyenne() {
			int sommeAires=0;
			for (IRectangle r : listeRectangles)
				sommeAires+=r.aire();
			if (listeRectangles.isEmpty())
			{
				return 0;
			}
			else 
			{
				return sommeAires/listeRectangles.size();
			}
		}
}
