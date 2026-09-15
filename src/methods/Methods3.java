package methods;

public class Methods3 {
	static String bankName;
	int accountNumber;
	int balance;
	
	void getDeposite(int amount) {
		balance=balance+amount;
		
	}
	
	void getwithdraw(int amount) {
		balance=balance-amount;
	
	}
	void  checkBalance() {
		System.out.println(balance);
		
	}

	public static void main(String[] args) {
		bankName="ICICI";

		Methods3 m=new  Methods3();
		m.accountNumber=9876567;
		m.balance=8999;
		m.getDeposite(50000);
		m.getwithdraw(3000);
		m.checkBalance();
		
		Methods3 m1=new  Methods3();
		m1.accountNumber=9867866;
		m1.balance=5999;
		m1.getDeposite(5000);
		m1.getwithdraw(2000);
		m1.checkBalance();
		

		
	}

}
