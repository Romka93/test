package work;
//наслідування
public class childeTest extends test{
	
	private int  index;

	public childeTest() {
		super();
		index = 12;
	}

	public void setI(int i)
	{
		System.err.println("Massege");
	}
	
	public String toString() {
		return "childetest [index=" + index + "]";
	}

	public childeTest(int i, String str) {
		super(i, str);
		
	}

}
