package constructor;
import java.math.BigInteger;

public class Constructor13 {
	String username;
	BigInteger playerId;
	int level;
	double walletBalance;
	float winRate;
	boolean premium;
	String rank;
	Constructor13(){
		
		
	}
	Constructor13(String username){
		this(username,new BigInteger("0"));
	}
	Constructor13(String username,BigInteger playerId){
		this(username,playerId,0);
	}
	Constructor13(String username,BigInteger playerId,int level){
		this(username,playerId,level,0.0);
	}
	Constructor13(String username,BigInteger playerId,int level,double walletBalance){
		this(username,playerId,level,walletBalance,0.0f);
	}
	Constructor13(String username,BigInteger playerId,int level,double walletBalance,float winRate){
		this(username,playerId,level,walletBalance,winRate,false);
	}
	Constructor13(String username,BigInteger playerId,int level,double walletBalance,float winRate,boolean premium){
		this(username,playerId,level,walletBalance,winRate,premium,"Unknown");
	}
	Constructor13(String username,BigInteger playerId,int level,double walletBalance,float winRate,boolean premium,String rank){
		this.username=username;
		this.playerId=playerId;
		this.level=level;
		this.walletBalance=walletBalance;
		this.winRate=winRate;
		this.premium=premium;
		this.rank=rank;
	}
	
	
	
	

	public static void main(String[] args) {
		Constructor13 p1=new Constructor13();
		Constructor13 p2=new Constructor13("I'M Jerry",new BigInteger("876544567654"));
		Constructor13 p3=new Constructor13("I'M Tommy",new BigInteger("567876543456"),66,900,70.5f,true,"GrandMaster");


		p1.display();
		p2.display();
		p3.display();
		
		
		

	}
	void display() {
		System.out.println("Player UserName:"+username);
		System.out.println("Player Id:"+playerId);
		System.out.println("Player WalletBalance:"+walletBalance);
		System.out.println("Player WinRate:"+winRate);
		System.out.println("Player  Has Premium Access?:"+premium);
		System.out.println("Player Rank:"+rank);
		System.out.println("********************************************");





		
	}

}
