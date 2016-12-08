package OOP1;

public class Person {
	protected String name = "n/a";
	protected int age = 0;
	protected String address ="n/a";

	public Person(){}
	public Person(String name, int age){
		this.name = name;
		this.age = age;
	}

	public void setName(String n){
		this.name = n;
	}
	public String name(){
		return this.name;
	}
	public void setAge(int a){
		this.age = a;
	}
	public int age(){
		return age;
	}
	public void setAddress(String a){
		this.address = a;
	}
	public String address(){
		return this.address;
	}

	public void descriptionOfPerson(){
		System.out.println("------------------");
		System.out.println("| My name is " + name);
		System.out.println("| I am " + age + " years old");
		System.out.println("| " + address);
	}

	public static void setAddress(Person person, String address){
		if (person instanceof Programmer) {
			address = "I am programmer and I live in " + address;
		} else {
			address = "I am driver and I live in " + address;
		}  

		person.setAddress(address);
	}

}
