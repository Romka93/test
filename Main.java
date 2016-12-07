package work;

public class Main {

	public static void main(String[] args) {
		
		Object obj = new childeTest();
		
		test t =new childeTest(); //ןמכ³למנפ³חל
		 t.setI(12);
		System.out.println(obj);
		System.out.println(t);
		test temp1=new test(10 , "Hello");
		test temp2=new test(10 , "Hello");
		System.out.println(temp1.equals(temp2));
		test.print();
	}

}
