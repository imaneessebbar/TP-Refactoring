/* *****************
 * ES-SEBBAR Imane 
 * ELMAROUNI Majda 
 ******************* */

public class Rectangle {

	protected int l;
	protected int L;

	public Rectangle() {
		super();
	}

	public void setl(int l) {
		this.l = l;
	}

	public void setL(int L) {
		this.L = L;
	}

	public int getl() {
		return l;
	}

	public int getL() {
		return L;
	}

	void testCote() {
		int c= L;
		L= Math.max(L,l);
		l= Math.min(c,l);
	}
	public String toString() {
		return "Longeur : "+L+"\nLargeur : "+l;
	}

}