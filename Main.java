package OOP1;

public class Main {

	public static void main(String[] args) {

		Driver person1 = new Driver();
		Programmer person2 = new Programmer();

		//ןמכ³למנפ³חל
		Person.setAddress(person1, "Py street");// The method takes a person.But we polymorphic pass driver or a programmer
		Person.setAddress(person2, "Ny street");

		person1.setName("Ivan");
		person1.setAge(22);
		person1.setDrExp(2);

		person2.setName("Mike");
		person2.setAge(24);
		person2.setProgExp(3);

		person1.descriptionOfPerson();
		person2.descriptionOfPerson();

	}

}
