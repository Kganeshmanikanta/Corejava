package constructor;

public class Constructor6 {
	String name;
	long employeeId;
	int age;
	char grade;
	double sal;
	boolean permanent;

	Constructor6() {
		System.out.println("No-Arg Constructor Called !!!");
	}

	Constructor6(String name) {
		this.name = name;

	}

	Constructor6(String name, long employeeId) {
		this(name, employeeId, 0);

	}

	Constructor6(String name, long employeeId, int age) {
		this(name, employeeId, age, 'N');

	}

	Constructor6(String name, long employeeId, int age, char grade) {
		this(name, employeeId, age, grade, 0.0);
	}

	Constructor6(String name, long employeeId, int age, char grade, double sal) {
		this(name, employeeId, age, grade, 0.0, false);

	}

	Constructor6(String name, long employeeId, int age, char grade, double sal, boolean permanent) {
		this.name = name;
		this.employeeId = employeeId;
		this.age = age;
		this.grade = grade;
		this.sal = sal;
		this.permanent = permanent;

	}

	public static void main(String[] args) {
		Constructor6 e1 = new Constructor6();
		Constructor6 e2 = new Constructor6("Tom");
		Constructor6 e3 = new Constructor6("Jerry", 46547658585746L);
		Constructor6 e4 = new Constructor6("Spike", 987656789098L, 25);
		Constructor6 e5 = new Constructor6("Muscle", 9876578L, 24, 'O');
		Constructor6 e6 = new Constructor6("Doom", 98989876567L, 26, 'A', 600000);
		Constructor6 e7 = new Constructor6("Ganesh", 9889778998L, 22, 'A', 789099, true);

		e1.display();
		e2.display();
		e3.display();
		e4.display();
		e5.display();
		e6.display();
		e7.display();

	}

	void display() {
		System.out.println("Employee Name:" + name);
		System.out.println("Employee ID:" + employeeId);
		System.out.println("Employee age:" + age);
		System.out.println("Employee grade:" + grade);
		System.out.println("Employee salary:" + sal);
		System.out.println("Is Employee permanent:" + permanent);
		System.out.println("************************************");

	}

}
