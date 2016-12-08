package OOP1;

public class Driver extends Person {
	protected int drExp = 0;

	public int getDrExp() {
		return drExp;
	}

	public void setDrExp(int drExp) {
		this.drExp = drExp;
	}

	public void descriptionOfPerson(){
		super.descriptionOfPerson();
		System.out.println("| I am driver and my experience is " + this.drExp);
	}
}
