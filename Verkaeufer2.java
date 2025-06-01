import java.util.ArrayList;

public class Verkaeufer2 {
	private String name;
	private ArrayList <Double> preisliste ;
	
	
	


	public Verkaeufer2(String name,ArrayList <Double>preisliste) {
		this.name = name;
		this.preisliste= preisliste;
	}


	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}


	/**
	 * @return the preis
	 */
	public ArrayList<Double> getPreisliste() {
		return preisliste;
	}


	/**
	 * @param preis the preis to set
	 */
	public void setPreisliste(ArrayList<Double> preis) {
		this.preisliste = preis;
	}
	
	
	
	
}
