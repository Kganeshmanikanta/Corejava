package constructor;

public class ConstructorCopy {
	 int eid;
	 String name;
	 double sal;
	 String role;
	 ConstructorCopy(){
		 
	 }
	 ConstructorCopy(ConstructorCopy c){
		 this.eid=c.eid;
		 this.name=c.name;
		 this.sal=c.sal;
		 this.role=c.role;
	 }
	 

	public static void main(String[] args) {
		ConstructorCopy e1= new ConstructorCopy();
		e1.eid=101;
		e1.name="Ganesh";
		e1.sal=67000;
		e1.role="Java Developer";
		e1.display();
		ConstructorCopy e2= new ConstructorCopy(e1);
		e2.display();
		
		// both objects share same data but different reference
		System.out.println(e1);
		System.out.println(e2);


	}
	void display() {
		System.out.println("Employee Id:"+eid);
		System.out.println("Employee Name:"+name);
		System.out.println("Employee Monthly Salary:"+sal);
		System.out.println("Employee Role:"+role);
		System.out.println("*************************************");
	}

}
