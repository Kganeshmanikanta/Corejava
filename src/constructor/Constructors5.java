package constructor;

public class Constructors5 {
	String name;
	int age;
	char gender;
	boolean isHosteller;
	double cgpa;

	Constructors5() {
		this.name = "Unkonwn";
		this.age = 0;

	}

	Constructors5(String name) {
		this.name = name;

	}

	Constructors5(String name, int age) {
		this.name = name;
		this.age = age;

	}

	Constructors5(String name, int age, char gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;

	}

	Constructors5(String name, int age, char gender, boolean isHosteller) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.isHosteller = isHosteller;

	}

	Constructors5(String name, int age, char gender, boolean isHosteller, double cgpa) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.isHosteller = isHosteller;
		this.cgpa = cgpa;

	}

	public static void main(String[] args) {
		System.out.println("Main method started!!!");
		Constructors5 s1 = new Constructors5();
		Constructors5 s2 = new Constructors5("Tom");
		Constructors5 s3 = new Constructors5("Doom", 24);
		Constructors5 s4 = new Constructors5("jerry", 22, 'M');
		Constructors5 s5 = new Constructors5("Spike", 23, 'M', true);
		Constructors5 s6 = new Constructors5("Ganesh", 22, 'M', true, 7.9);

		s1.display();
		s2.display();
		s3.display();
		s4.display();
		s5.display();
		s6.display();

	}

	void display() {
		System.out.println("Student name:" + name);
		System.out.println("Student age:" + age);
		System.out.println("Student gender:" + gender);
		System.out.println("Student isHosteller or Not:" + isHosteller);
		System.out.println("Student cgpa:" + cgpa);
		System.out.println("*****************************");

	}

}
