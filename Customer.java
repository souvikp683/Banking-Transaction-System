

public class Customer {
	
	String name;
	
	long PhoneNo;
	String Adress;
    Account a1;
    
    public Customer(String name,long PhoneNo,String Adress,Account a1)
    {
    	this.name=name;
    	this.PhoneNo=PhoneNo;
    	this.Adress=Adress;
    	this.a1=a1;
    }

    public void WithDraw(int amt){
    	
    	a1.WithdrawAmount(amt);
    }
    
    public void Deposit(int amt) {
    	a1.DepositAmount(amt);
    }
    public void CheckBalance() {
    	a1.ViewBalance();
    }
    
}
