package constructor;

public class Constructor11 {
	String name;
	int age;
	char gender;
	double height;
	float weight;
	boolean admitted;
	String bloodGroup;

	Constructor11() {
		this.name = "Unknown";
		this.bloodGroup = "Unknown";

	}

	Constructor11(String name, int age, char gender) {
		this(name, age, gender, 0.0);

	}

	Constructor11(String name, int age, char gender, double height) {
		this(name, age, gender, height, 0.0f);

	}

	Constructor11(String name, int age, char gender, double height, float weight) {
		this(name, age, gender, height, weight, false);

	}

	Constructor11(String name, int age, char gender, double height, float weight, boolean admitted) {
		this(name, age, gender, height, weight, admitted, "Not Taken");

	}

	Constructor11(String name, int age, char gender, double height, float weight, boolean admitted, String bloodGroup) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.height = height;
		this.weight = weight;
		this.admitted = admitted;
		this.bloodGroup = bloodGroup;

	}

	public static void main(String[] args) {
		Constructor11 p1 = new Constructor11();
		Constructor11 p2 = new Constructor11("Jerry", 23, 'M');
		Constructor11 p3 = new Constructor11("Spike", 24, 'M', 5.11, 89.9f, false, "S+");

		p1.display();
		p2.display();
		p3.display();

	}

	void display() {
		System.out.println("Patient Name:" + name);
		System.out.println("Patient Age:" + age);
		System.out.println("Patient Gender:" + gender);
		System.out.println("Patient Height:" + height);
		System.out.println("Patient Weight:" + weight);
		System.out.println("Patient Admitted?:" + admitted);
		System.out.println("Patient BloodGroup:" + bloodGroup);
		System.out.println("*************************************");

	}

}
