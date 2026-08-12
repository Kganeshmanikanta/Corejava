package firstjava;

public class Blocks {
	static Blocks b=new Blocks();
	
	
	static {
		System.out.println("Static block called");
	}
	{
		System.out.println("Instance block called");
		Blocks b=new Blocks();
	}
	
	public static void main(String[] args) {
		System.out.println("Main Method started");
		
		
		System.out.println("Main method ended");
	}

}
