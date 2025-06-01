
public class Verkaeufer {
	private String name;
	private double preis;
	private int stueckzahl;
	
	


	public Verkaeufer(String name,double preis, int stueckzahl) {
		this.name = name;
		this.preis = preis;
		this.stueckzahl = stueckzahl;
	}

	/**
	 * @return the preis
	 */
	public double getPreis() {
		return preis;
	}

	/**
	 * @param preis the preis to set
	 */
	public void setPreis(double preis) {
		this.preis = preis;
	}

	/**
	 * @return the stueckzahl
	 */
	public int getStueckzahl() {
		return stueckzahl;
	}

	/**
	 * @param stueckzahl the stueckzahl to set
	 */
	public void setStueckzahl(int stueckzahl) {
		this.stueckzahl = stueckzahl;
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
	
}
