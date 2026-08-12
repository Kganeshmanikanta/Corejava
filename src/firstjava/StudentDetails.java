package firstjava;

public class StudentDetails {
	static String collegeName="Parul University";
	static String location="Vadodara,Gujrath";
	
	int rollNo=17;
	String name="ganesh";
	long mobile=8230283028L;
	String email="ganesh685@gmail.com";
	String branch="ECE";

	public static void main(String[] args) {
		System.out.println(collegeName);
		System.out.println(location);
		
		System.out.println("************FirstObject*************");
		
		
	    StudentDetails stu1 =new StudentDetails();
	    stu1.branch="CSE";
	    
		System.out.println(stu1.rollNo);
		System.out.println(stu1.name);
		System.out.println(stu1.mobile);
		System.out.println(stu1.email);
		System.out.println(stu1.branch);
		
		System.out.println("************SecondObject***************");
		
		StudentDetails stu2 =new StudentDetails();
		stu2.rollNo=18;
		stu2.name="virat";
		stu2.mobile=23314112132L;
		stu2.email="Virat@gmail.com";
		
	  
	    
		System.out.println(stu2.rollNo);
		System.out.println(stu2.name);
		System.out.println(stu2.mobile);
		System.out.println(stu2.email);
		System.out.println(stu2.branch);
		
System.out.println("************ThridObject***************");
		
		StudentDetails stu3 =new StudentDetails();
		stu3.rollNo=45;
		stu3.name="rohit";
		stu3.mobile=52482394191L;
		stu3.email="Rohit45@gmail.com";
		
	  
	    
		System.out.println(stu3.rollNo);
		System.out.println(stu3.name);
		System.out.println(stu3.mobile);
		System.out.println(stu3.email);
		System.out.println(stu3.branch);
		

	}

}
