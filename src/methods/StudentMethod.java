package methods;
import java.util.Scanner;

public class StudentMethod {
	
	void displayStudentName(String name) {
		System.out.println("Student Name is:-"+name);
	}
	void displayStudentID(int id) {
		System.out.println("Student ID is:-"+id);
	}
	void displayStudentAge(int age) {
		System.out.println("Student age is:-"+age);
	}
	void displayStudentGender(char gender) {
		System.out.println("Student Gender is:-"+gender);
	}
	void displayStudentCourse(String course) {
		System.out.println("Student course is:-"+course);
	}
	void displayStudentCollege(String college) {
		System.out.println("Student College is:-"+college);
	}
	void displayStudentCity(String city) {
		System.out.println("Student city is:-"+city);
	}
	void displayStudentPhoneNumber(long phone) {
		System.out.println("Student Contact No is:-"+phone);
	}
	void displayStudentEmail(String email) {
		System.out.println("Student Email is:-"+email);
	}
	void displayStudentAttendence(float at) {
		System.out.println("Student Name is:-"+at);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Id: ");
		int id=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Name: ");
		String n=sc.nextLine();
	
		System.out.println("Enter Age: ");
		int a=sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter Gender: ");
		char c=sc.next().charAt(0);
		sc.nextLine();
		System.out.println("Enter Course: ");
		String co=sc.nextLine();
		
		System.out.println("Enter College: ");
		String col=sc.nextLine();
		System.out.println("Enter City: ");
		String ci=sc.nextLine();
		System.out.println("Enter PhoneNumber: ");
		long po=sc.nextLong();
		sc.nextLine();
		System.out.println("Enter Email: ");
		String e=sc.nextLine();
		System.out.println("Enter Attendance: ");
		float attendence=sc.nextFloat();

		//Set -2
		System.out.println("Enter Telugu Marks");
		int telugu=sc.nextInt();
		System.out.println("Enter Hindi Marks");
		int hindi=sc.nextInt();
		System.out.println("Enter English Marks");
		int english=sc.nextInt();
		System.out.println("Enter Maths Marks");
		int maths=sc.nextInt();
		System.out.println("Enter Physcis Marks");
		int physcis=sc.nextInt();
		System.out.println("Enter Biology Marks");
		int biology=sc.nextInt();
		System.out.println("Enter Social Marks");
		int social=sc.nextInt();
		System.out.println("Enter GrandTotal"); 
		int total=sc.nextInt();
		System.out.println("Enter Grade: ");
		char grade=sc.next().charAt(0);
		System.out.println("Enter Percentage");
		float percentage=sc.nextFloat();
		
		StudentMethod s1=new StudentMethod();
		s1.displayStudentName(n);
		s1.displayStudentID(id);
		s1.displayStudentAge(a);
		s1.displayStudentPhoneNumber(po);
		s1.displayStudentGender(c);
		s1.displayStudentCourse(co);
		s1.displayStudentCollege(col);
		s1.displayStudentCity(ci);
		s1.displayStudentEmail(e);
		s1.displayStudentAttendence(attendence);
		
		//set-2
		s1.passfail(total,"Pass");
		s1.checkExamEligibility(attendence);
		s1.displayGrade(grade);
		s1.calculateTotalMarks(telugu,hindi,english,maths,physcis,biology,social);
		s1.calculatePercentage(total);
		s1.compareMarks(telugu,hindi);
		s1.checkScholarship(percentage);
		s1.displayStudentDetails(n,a,co);
		s1.displayResult(total, percentage, grade);
		s1.displayCompleteDetails(n,id,a,c,co);
		sc.close();
		
	}
	void passfail(int total,String result) {
		System.out.println("Marks are :"+total);
		System.out.println("Result: "+result);
	}
	void  checkExamEligibility(float attendance) {
		if(attendance>75) {
			System.out.println("Eligible");
		}else {
			System.out.println("Not Eligible");
		}
	}
	void displayGrade(char grade) {
		System.out.println("Student Grade: "+grade);
	}
	void calculateTotalMarks(int t,int h,int e,int m,int p,int b,int s) {
		int total=t+h+e+m+p+b+s;
		System.out.println("Total marks:-"+total);
	}
	void calculatePercentage(int total) {
		int p=(total/700)*100;
		System.out.println("Percentage:"+p);
		
	}
	void compareMarks(int m1,int m2) {
		if(m1>m2) {
			System.out.println("Got More Marks on M1");
		}else {
			System.out.println("Got More Marks on M2");
		}
	}
	void checkScholarship(float percentage) {
		if(percentage>95) {
			System.out.println("Eligible for Scholarship");
		}else {
			System.out.println("Not Eligible for Scholarship");
		}
	}
	void displayStudentDetails(String name,int age,String Course) {
		System.out.println("Name of Student:"+name);
		System.out.println("Age:"+age);
		System.out.println("Course:"+Course);

	}
	void displayResult(int total,float percentage,char grade) {
		System.out.println("Result:");
		System.out.println("Total Marks:"+total);
		System.out.println("percentage:"+percentage);
		System.out.println("Grade:"+grade);
	}
    void displayCompleteDetails(String name, int id, int age, char gender, String course) {
    	System.out.println("Name: "+name);
    	System.out.println("id: "+id);
    	System.out.println("age: "+age);
    	System.out.println("Gender: "+gender);
    	System.out.println("course: "+course);




    }
}
