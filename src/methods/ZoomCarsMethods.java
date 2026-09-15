package methods;

public class ZoomCarsMethods {
	String  carCompanyName() {
		String msg="Welcome to ZOOMCAR Rentals!😊😊😊";
		return msg;
	}
	int rentCost(int days) {
		int totalRent=1500*days;
		
		return totalRent;
		
	}
	int insuranceCost() {
		int in=500;
		
		return in;
	}
	public static void main(String[] args) {
		ZoomCarsMethods c1=new ZoomCarsMethods();
		System.out.println(c1.carCompanyName());
		int rent=c1.rentCost(7);
		int ins=c1.insuranceCost();
		System.out.println("Total Rent Is :"+rent);
		System.out.println("Insurance:"+ins);
		int total=(rent+ins);
		
		System.out.println("Total Cost:"+total);
	
		
		

	}

}
