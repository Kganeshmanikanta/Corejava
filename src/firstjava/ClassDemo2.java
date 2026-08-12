package firstjava;

public class ClassDemo2 {
	
	@Override
	protected void finalize()  {
		System.out.println("Finalize method called");
	}
	
	
	void method1(){
		System.out.println("Hello");
		ClassDemo2 c=new ClassDemo2();
		
	}
	public static void main(String[] args) {
		
		
		
		ClassDemo2 c=new ClassDemo2();
	    System.out.println(c);
	    
	    ClassDemo2 c1=new ClassDemo2();
	    System.out.println(c1);
	    
	    ClassDemo2 c2=new ClassDemo2();
	    System.out.println(c2);
	    
	    new ClassDemo2().method1();

	    
	    c=null;
	    c2=c1;
	    
	    System.gc();
	    System.out.println(c2);
	    System.out.println(c1);


	    
	
	    
	}

	

}
