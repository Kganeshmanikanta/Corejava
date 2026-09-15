package constructor;

public class AnimalConstructor {
	
	String breed="German Shepard";
	int age=3;
	String color;

	public static void main(String[] args) {
		System.out.println("Animal Class Started!");

	}

}
class DogConstructor extends AnimalConstructor{
	String breed="Pit Bull";
	int age=4;

	public static void main(String[] args) {
		DogConstructor dog1=new DogConstructor();
		System.out.println("Dog Class Started!");
		dog1.dogInfo();
		
	}
	void dogInfo() {
		// Current class data
		System.out.println(this.breed);
		System.out.println(this.age);
		System.out.println("***********************");
		// parent class data
		System.out.println(super.breed);
		System.out.println(super.age);
		System.out.println(super.color);
		System.out.println("***********************");

		super.breed="Tebetain Mastif";
		super.age=6;
		super.color="Light Silver";
		System.out.println(super.breed);
		System.out.println(super.age);
		System.out.println(super.color);
		System.out.println("***********************");

		this.breed="Tebetain Mastif";
		this.age=6;
		System.out.println(this.breed);
		System.out.println(this.age);
		System.out.println("***********************");

	}
	
}
