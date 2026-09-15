package methods;

public class Bank {
	static double bankBalance=10000;
	long getAccountNo(int acc) {
		int ac=acc;
		return ac;
	}
	
	double calculateBalance(double deposit,double withdrawal) {
		double b=bankBalance+deposit;
		double b1=b-withdrawal;
		return b1;
	}
	double calculateInterest(double principal,double rate) {
		double ci=principal*rate;
		return ci;
	}
	float calculateInterest(double principal,double rate,int years) {
		float ci=(float)(principal*rate*years);
		return ci;
	}
	float calculateTax(double income,float tax) {
		float ci=(float)(income*tax);
		return ci;
	}
	
	

	void main(String[] args) {
		double deposit=50000;
		double withdraw=3000;
		double principal=20000;
		double rate=0.07;
		int years=2;
		double income=60000;
		float taxrate=2.2f;

		
		
		System.out.println("Balance after Withdraw:"+calculateBalance(deposit,withdraw));
		System.out.println("Your interest%:"+calculateInterest(principal,rate));
		System.out.println("Your interest:"+calculateInterest(principal,rate,years));
		System.out.println("Your Annualtax:"+calculateTax(income,taxrate));


	}

}
