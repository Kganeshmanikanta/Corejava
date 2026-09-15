package constructor;

public class Railway {
	String passengerName;
	int age;
	String source;
	String destination;
	Railway(){
		this("Unknown");
	}
	Railway(String passengerName){
		this(passengerName,0);
	}
	Railway(String passengerName,int age){
		this(passengerName,age,"Unknown");
	}
	Railway(String passengerName,int age,String source){
		this(passengerName,age,source,"Unknown");
	}
	Railway(String passengerName,int age,String source,String destination){
		this.passengerName=passengerName;
		this.age=age;
		this.source=source;
		this.destination=destination;		
	}
	

	public static void main(String[] args) {

	}

}
class Ticket extends Railway{
	int noOfTickets;
	static int ticketPrice=500;
	double finalPrice;
	Ticket(){
		super("Ganesh",22,"Hyderabad","Vijaywada");
	}
	Ticket(String name){
		super(name);
		
	}
	Ticket(String name,int age){
		super(name,age);
		
	}
	Ticket(String name,int age,String source){
		super(name,age,source);
		
	}
	Ticket(String name,int age,String source,String location){
		super(name,age,source,location);
		
	}
	
	public static void main(String []args) {
		Ticket t1=new Ticket();
		t1.noOfTickets=1;
	

		t1.bookTicket(t1.noOfTickets);
		t1.display();
		
		Ticket t2=new Ticket("Tom",21,"Vijaywada","Gujrath");
		t2.noOfTickets=5;
		t2.bookTicket(t2.noOfTickets);
		t2.display();
		Ticket t3=new Ticket("Doom",33);
		t3.noOfTickets=3;
		t3.bookTicket(t3.noOfTickets);
		t3.display();
		
		
	}
	void  bookTicket(int tickets) {
		finalPrice=tickets*ticketPrice;
		
	}
	 void display() {
		 System.out.println("Passenger Name:"+passengerName);
		 System.out.println("Passanger age:"+age);
		 System.out.println("Start Location:"+source);
		 System.out.println("Destination:"+destination);
		 System.out.println("Total Ticket Price:"+finalPrice);
		 System.out.println("******************************************");
	 }
	
}
