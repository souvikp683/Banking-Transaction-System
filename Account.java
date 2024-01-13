import java.util.Scanner;
public class Account {
	Scanner sc = new Scanner(System.in);
	String BankName;
	double bal;
	long accno;
	String branch;
	
	public Account(String BankName,String branch,long accno)
	{
	    this.BankName=BankName;
	   
	    this.branch=branch;
	    this.accno=accno;
	}
	
	public void WithdrawAmount(int amt) {
		if(bal > amt  && bal > 0 ) {
			bal = bal - amt;
			System.out.println("Withdraw Ammount "  +amt);
		}
		else {
			System.out.println("Insufficient Balance");
		}
	}
	
	
	public void DepositAmount(int amt) {
		if(amt > 0) {
			bal=bal+amt;
			System.out.println("Deposit Ammount " + amt);
		}
		else {
			System.out.println("Invalid Amount");
		}
	}
	
	public void ViewBalance() {
		System.out.println("Current Balance " + bal);
	}

}


