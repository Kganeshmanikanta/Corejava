package firstjava;

public class BoxingTask1 {
	int i=22;
	float f=33.3f;
	char c='A';
	String s="bhAAi";
	boolean isCool;

	public static void main(String[] args) {
		int a=10000000;
		Integer a1=a;
		System.out.println("After Auto-Boxing:-"+a1);
		
		int a3=a1;
		System.out.println("After Auto-unBoxing:-"+a3);
		
		BoxingTask1 b=new BoxingTask1();
		System.out.println(b.i);
		System.out.println(b.f);
		System.out.println(b.c);
		System.out.println(b.s);
		System.out.println(b.isCool);





	}

}
