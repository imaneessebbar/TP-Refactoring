/* *****************
 * ES-SEBBAR Imane 
 * ELMAROUNI Majda 
 ******************* */

// remplacer le rectangle qui est un attribut de la classe rectangleColore de sort que la classe RectangleColore h?rite de la classe Rectangle

public class RectangleColore extends Rectangle {

	private String color;
	
	RectangleColore(){
		super();
	}
	
	public RectangleColore(int l, int L, String color) {
		super();
		this.l = l;
		this.L = L;
		this.color = color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	public String getColor() {
		return color;
	}
	public String toString() {
		return super.toString()+"\nCouleur : "+color;
	}
}
