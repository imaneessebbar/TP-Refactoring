/* *****************
 * ES-SEBBAR Imane 
 * ELMAROUNI Majda 
 ******************* */

// stocker 3.14 dans une constante 

public class Cercle {
	private static final double EVALF2PI = 3.14;
	private int rayon;

	public int getRayon() {
		return rayon;
	}

	public void setRayon(int rayon) {
		this.rayon = rayon;
	}
	public double perimetre() {
		return 2*rayon*3.14;
	}
	public double air() {
		return Math.pow(rayon, 2)*EVALF2PI;
	}
}
