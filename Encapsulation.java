package work;

public class Encapsulation {
	private int property = 100;
	
	private void metod(int n){
		this.property = n;
	}
	
	public int getProperty() {
		return property;
	}

	public void setProperty(int property) {
		this.property = property;
	}
	
	public void publicMetod(int n){
		this.metod(n);
	}
}
