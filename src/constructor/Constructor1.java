package constructor;

public class Constructor1 {
	String name;
	int age;
	String loc;
	double sal;
	String hobby;

	Constructor1() {
		System.out.println("Hello Constructor Called!!!");

	}

	Constructor1(int age, String name, double sal, String loc, String hobby) {
		this.age = age;
		this.name = name;
		this.hobby = hobby;
		this.loc = loc;
		this.sal = sal;

	}

	Constructor1(Constructor1 c) {
		this(c.age, c.name, c.sal, c.loc, c.hobby);

	}

	public static void main(String[] args) {
		Constructor1 c1 = new Constructor1();
		Constructor1 c2 = new Constructor1(21, "qefwdv", 66000.0, "HiTech city", "Cricket");
		Constructor1 c3 = new Constructor1(c2);
		Constructor1 c4 = new Constructor1(c3);
		Constructor1 c5 = new Constructor1(c2.age, c2.name, c2.sal, c2.loc, c2.hobby);

		c1.display();
		c2.display();
		c3.display();
		c4.display();
		c5.display();

	}

	void display() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(loc);
		System.out.println(sal);
		System.out.println(hobby);
		System.out.println("*************************");
	}

}
