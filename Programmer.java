package OOP1;

public class Programmer extends Person {
	protected int  progExp = 0;

	public int progExp() {
		return progExp;
	}

	public void setProgExp(int progExp) {
		this.progExp = progExp;
	}
	public void descriptionOfPerson(){
		super.descriptionOfPerson();
		System.out.println("| I am programmer and my experience is " + this.progExp);
	}

}
