package methods;
import java.util.Scanner;


public class CricketMethod {
	void displayBatsmens(String a,String b,String c,String d,String e) {
		System.out.println("Top OrderBatsmans are:");
		System.out.println("Striker:"+a);
		System.out.println("Non-Striker:"+b);
		System.out.println("1 Down Batsmen:"+c);
		System.out.println("2 Down Batsmen:"+d);
		System.out.println("3 Down Batsmen:"+e);
	}
	void middleOrder(String f,String g,String h) {
		System.out.println("Middle OrderBatsmans are:");
		System.out.println("4 Down Batsmen:"+f);
		System.out.println("5 Down Batsmen:"+g);
		System.out.println("6 Down Batsmen:"+h);
		
	}
	void Tailenders(String b1,String b2,String b3) {
		System.out.println("TailEnders or Bowlers are:");
		System.out.println("7 Down Batsmen:"+b3);
		System.out.println("8 Down Batsmen:"+b1);
		System.out.println("9 Down Batsmen:"+b2);
		
	}
	
	void pureBatsmen(String a,String b,String c,String d,String e) {
		System.out.println("Pure Batsmen are:");
		System.out.println(a+"\n"+b+"\n"+c+"\n"+d+"\n"+e);
	}
	void AllRounders(String a,String b,String c,String d) {
		System.out.println("All Rounders are:");
		System.out.println(a+"\n"+b+"\n"+c+"\n"+d);
	}
	void pureBowlers(String a,String b,String c) {
		System.out.println("Pure Bowlers are:");
		System.out.println(a+"\n"+b+"\n"+c);
	}
	void spinners(String a,String b) {
		System.out.println("Pure Spinners are:");
		System.out.println(a+"\n"+b);
		
	}
	void Pacers(String a,String b,String c,String d,String e ) {
		System.out.println("Pure pacers are:");
		System.out.println(a+"\n"+b+"\n"+c+"\n"+d+"\n"+e);		
	}

	public static void main(String[] args) {
		
		CricketMethod c1=new CricketMethod();
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your Cricket Team:");
		System.out.println("Enter Your 5 Top Order Batsmens");
		String a,b,c,d,e;
		a=sc.nextLine();	
		b=sc.nextLine();
		c=sc.nextLine();
		d=sc.nextLine();
		e=sc.nextLine();
		c1.displayBatsmens(a, b, c, d, e);
		
		System.out.println("Enter Your middleOrder Batsmens");
		String f,g,h;
		f=sc.nextLine();	
		g=sc.nextLine();
		h=sc.nextLine();
		c1.middleOrder(f, g, h);
		
		System.out.println("Enter Your TailEnders:");
		String b1,b2,b3;
		b1=sc.nextLine();	
		b2=sc.nextLine();
		b3=sc.nextLine();
		c1.Tailenders(b1, b2, b3);
		
		c1.pureBatsmen(a, b,c,d,e);
		c1.AllRounders(e,f,g,h);
		c1.pureBowlers(b1,b2,b3);
		c1.spinners(g,h);
		c1.Pacers(b1,b2,b3,e,f);
		sc.close();

	}

}
