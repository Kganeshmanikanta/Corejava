package firstjava;

public class Javap1 {
	
	static {
		Javap1 j=new Javap1();
		j.name();
	}
	void name() {
		System.out.println("Java");
		name1();
	}
	void name1() {
		System.out.println("Python");
		name3();
	}
	void name3() {
		System.out.println("SQL");
		name4();
	}
	void name4() {
		System.out.println("Java");
	}

	public static void main(String[] args) {
		System.out.println("hi");

	}

}
