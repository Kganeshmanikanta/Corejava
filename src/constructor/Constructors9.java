package constructor;
import java.math.BigInteger;

public class Constructors9 {
	BigInteger orderId;
	String customerName;
	String productName;
	int quantity;
	double price;
	float discount;
	boolean paid;
	Constructors9(){
		
	}
	Constructors9(BigInteger orderId){
		this(orderId,"Unknown");
		
	}
	Constructors9(BigInteger orderId,String customerName){
		this(orderId,customerName,"Unknown");
		
	}
	Constructors9(BigInteger orderId,String customerName,String productName){
		this(orderId,customerName,productName,0);
		
	}
	Constructors9(BigInteger orderId,String customerName,String productName,int quantity){
		this(orderId,customerName,productName,quantity,0.0);
		
	}
	Constructors9(BigInteger orderId,String customerName,String productName,int quantity,double price){
		this(orderId,customerName,productName,quantity,price,0.0f);
		
	}

	Constructors9(BigInteger orderId,String customerName,String productName,int quantity,double price,float discount){
		this(orderId,customerName,productName,quantity,price,discount,false);
		
	}
	Constructors9(BigInteger orderId,String customerName,String productName,int quantity,double price,float discount,boolean paid){
		this.orderId=orderId;
		this.customerName=customerName;
		this.productName=productName;
		this.quantity=quantity;
		this.price=price;
		this.discount=discount;
		this.paid=paid;
		
		
	}
	
	
	

	public static void main(String[] args) {
		Constructors9 o1=new Constructors9();
		Constructors9 o2=new Constructors9( new BigInteger("09876567890"));
		Constructors9 o3=new Constructors9(new BigInteger("98765432345678876"),"Tom");
		Constructors9 o4=new Constructors9(new BigInteger("5678982345678876"),"Jerry","shirts",6);
		Constructors9 o5=new Constructors9(new BigInteger("5678982345678876"),"Spike","shorts",3);
		Constructors9 o6=new Constructors9(new BigInteger("5678982345678876"),"tom","protein powder",2,10.0f,1999,true);
		Constructors9 o7=new Constructors9(new BigInteger("5678982345678876"),"Jerry","shirts",6);
		Constructors9 o8=new Constructors9(new BigInteger("5678982345678876"),"Jerry","shirts",6,8999,25.0f,true);
		
		o1.display();
		o2.display();
		o3.display();
		o4.display();
		o5.display();
		o6.display();
		o7.display();
		o8.display();







		
		


		

	}
	void display() {
		System.out.println("OrderId:"+orderId);
		System.out.println("Customer Name:"+customerName);
		System.out.println("ProductName:"+productName);
		System.out.println("quantity:"+quantity);
		System.out.println("price:"+price);
		System.out.println("payment status:"+paid);
		System.out.println("*****************************");





	}

}
