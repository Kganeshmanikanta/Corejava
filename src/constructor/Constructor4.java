package constructor;

public class Constructor4 {
	int id;
	String name;
	double sal;
	Constructor4(){
		this.id=0;
		this.name="Unknown";
		this.sal=0.0;
	}
	Constructor4(int id){
		this(id,"Unkown",0.0);
		
	}
	Constructor4(int id,String name){
		this(id,name,0.0);
		
	}
	Constructor4(int id,String name,double sal){
		this.id=id;
		this.name=name;
		this.sal=sal;
		
	}
	public static void main(String[] args) {
		Constructor4 e1=new Constructor4();
		Constructor4 e2=new Constructor4(22);
		Constructor4 e3=new Constructor4(22,"ganesh");
		Constructor4 e4=new Constructor4(22,"ganesh",666000);


		e1.display();
		e2.display();
		e3.display();
		e4.display();
		

	}
	void display(){
		System.out.println("Employee ID:"+id);
		System.out.println("Employee name:"+name);
		System.out.println("Employee sal:"+sal);
		System.out.println("*****************************");
	}

}
