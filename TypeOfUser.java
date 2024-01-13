import java.util.*;
public interface TypeOfUser {
	
	void Server();

}

class ATM implements TypeOfUser{
	Scanner sc = new Scanner(System.in);
	Account a1;
	
	public ATM(Account a1) {
		this.a1=a1;
	}
	
	
	public void Server() {
		System.out.println("1. WithDraw 2.Deposit");
		int ch = sc.nextInt();
	 
		switch(ch) {
		case 1: 
			
	    	System.out.println("Enter Amount");
	    	int amt1 = sc.nextInt();
	    	a1.WithdrawAmount(amt1);
	    	
	    	break;
	    
		case 2:
			
		    	System.out.println("Enter Amount");
		    	int amt2= sc.nextInt();
		    	a1.DepositAmount(amt2);
		    	break;
		
		 default: 
			 System.out.println("Invalid Option");
		}
		
	}
	
}

class Gpay implements TypeOfUser{
	Scanner sc = new Scanner(System.in);
	Account a1;
	public Gpay(Account a1) {
		this.a1=a1;
	}
	
	public void Server() {
		
		System.out.println("1. Send 2. Recieve");
		int ch = sc.nextInt();
		switch(ch) {
		case 1:
			System.out.println("Enter Amount");
			int amt1 = sc.nextInt();
			a1.WithdrawAmount(amt1);
			break;
			
		
		
		case 2:
			System.out.println("Enter Amount");
			int amt2 = sc.nextInt();
			a1.DepositAmount(amt2);
			break;
		
		default: 
			System.out.println("Invalid Option");
		
		} 
	}
}

class PhonePe implements TypeOfUser{
	Scanner sc = new Scanner(System.in);
	Account a1;
	public PhonePe(Account a1) {
		this.a1=a1;
	}
	
	public void Server() {
		
		System.out.println("1. Send 2. Recieve");
		int ch = sc.nextInt();
		switch(ch) {
		case 1:
			System.out.println("Enter Amount");
			int amt1 = sc.nextInt();
			a1.WithdrawAmount(amt1);
			break;
			
		
		
		case 2:
			System.out.println("Enter Amount");
			int amt2 = sc.nextInt();
			a1.DepositAmount(amt2);
			break;
		
		default: 
			System.out.println("Invalid Option");
		
		} 
	}
	
}

class Paytm implements TypeOfUser{
	Scanner sc = new Scanner(System.in);
	Account a1;
	public Paytm(Account a1) {
		this.a1=a1;
	}
	
	public void Server() {
		
		System.out.println("1. Send 2. Recieve");
		int ch = sc.nextInt();
		switch(ch) {
		case 1:
			System.out.println("Enter Amount");
			int amt1 = sc.nextInt();
			a1.WithdrawAmount(amt1);
			break;
			
		
		
		case 2:
			System.out.println("Enter Amount");
			int amt2 = sc.nextInt();
			a1.DepositAmount(amt2);
			break;
		
		default: 
			System.out.println("Invalid Option");
		
		} 
	}
	
}

class UserType{
	public void Choice(TypeOfUser t) {
		t.Server();
	}
}
