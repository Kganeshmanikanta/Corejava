package firstjava;
//
//public class ClassDemo1 {
//
//	static void method1() {
//		ClassDemo1 c=new ClassDemo1();
//
//		//c.method2();
//		System.out.println("Method 1 called");
//		c.method2();
//		method3();
//		c.method4();
//		method5();
//
//	}
//	
//	 void method2() {
//		//method3(); 
//		System.out.println("Method 2 called");
//	}
//	
//	static void method3() {
//		//ClassDemo1 c=new ClassDemo1();
//		//c.method4();
//
//		System.out.println("Method 3 called");
//	}
//	
//	 void method4() {
//
//		System.out.println("Method 4 called");
//	}
//	
//	static void method5() {
//		System.out.println("Method 5 called");
//	}
//	
//	
//
//	public static void main(String[] args) {
//		method1();
//		
//
//	}
//
//}


public class ClassDemo1{
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Finilize method called");
	}
	static void method1() {
		System.out.println("Method 1 started");
		ClassDemo1 c=new ClassDemo1();
		c.method2();
		c.method3();
		
	}
	
	 void method2() {
		System.out.println("Method 2 started");
		
	}
	  void method3() {
			System.out.println("Method 3 started");
			

			
			
		}
		
	 
	
	public static void main(String[]args) {
		method1();
		
		System.gc();
		
	}
}
