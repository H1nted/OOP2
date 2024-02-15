package Seance2_generique;

public class TacheSimple {
	
	public String name;
	


	public TacheSimple() {}
	public TacheSimple(String name) {

		this.setName(name) ;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String toString() {
		return "TacheSimple [desc=" + name + "]";
	}
	
	
}
