package firstjava;

public class Mobile {
	static String brand="Vivo";
	String model;
	int price;
	int ram;
	
	static {
		System.out.println("Welcome to Vivo Store");
	}
	
	{
		System.out.println("Here is one of our product ");
	}
	
	void display() {
		System.out.println("Mobile Brand:- "+brand);
		System.out.println("Model:-"+model);
		System.out.println("price:-"+price);
		System.out.println("Ram:-"+ram);


	}
	static void greeting() {
		System.out.println("Thanks for visiting our Store!!!");
	}

	public static void main(String[] args) {
		Mobile mobile=new Mobile();
		mobile.model="Y-Series";
		mobile.price=18000;
		mobile.ram=8;
		mobile.display();

		System.out.println("**************************************");
		
		Mobile mobile1=new Mobile();
		mobile1.model="Z-Series";
		mobile1.price=28000;
		mobile1.ram=6;
		mobile1.display();
		
        System.out.println("**************************************");
		
		Mobile mobile2=new Mobile();
		mobile2.model="x-Series";
		mobile2.price=50000;
		mobile2.ram=16;
		mobile2.display();
		System.out.println("");
		
	
		
        System.out.println("**************************************");
		
		Mobile mobile3=new Mobile();
		mobile3.model="NEO-Series";
		mobile3.price=40000;
		mobile3.ram=12;
		mobile3.display();
		System.out.println("");
		
		greeting();

	}

}
