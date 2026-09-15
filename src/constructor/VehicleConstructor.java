package constructor;

public class VehicleConstructor {
	String carName;
	String brand;
	double price;
	VehicleConstructor(){
		
	}
	VehicleConstructor(String carName,String brand,double price){
		this.carName=carName;
		this.brand=brand;
		this.price=price;
		
	}

	public static void main(String[] args) {

	}

}
class Car extends VehicleConstructor{
	Car(String carName,String brand,double price){
		super.carName=carName;
		super.brand=brand;
		super.price=price;
		
	}
	Car(){
		super("BMW","x-120",40000000);
	}
	public static void main(String[] args) {
		Car c1= new Car();
		c1.display();
		Car c2= new Car("Benz","Z-200",50000000);
		c2.display();

	}
	void display() {
		System.out.println("Car Name:"+carName);
		System.out.println("Car model:"+brand);
		System.out.println("Car Price:"+price);
		System.out.println("******************************");
	}
}
