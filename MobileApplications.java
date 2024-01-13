import java.util.Scanner;
public class MobileApplications {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter Account Name");
	String name =sc.nextLine();
	System.out.println("Enter Account Number");
	long accno = sc.nextLong();
	System.out.println("Enter Adress");
	sc.nextLine();
	String add =sc.nextLine();
	
	System.out.println("Enter Mobile No");
	long PhoneNo=sc.nextLong();
    System.out.println("Enter Branch Name");
    String Bname = sc.next();
    
    
    
    Account a1 = new Account("SBI",Bname,accno);
    Customer c1 = new Customer(name,PhoneNo,add,a1);
    UserType u1 = new UserType();
    
    
         
    
//	
	  while(true) {
		  System.out.println("----------------------------------------------------------------------------");
			System.out.println("1.ATM  2.Gpay 3.PhonePe 4.Paytm 5.Check Balance 6.Account Info 7. Exit ");
			 System.out.println("-------------------------------------------------------------------------");
			int ch = sc.nextInt();
		  switch(ch) {
		  case 1:
			  u1.Choice(new ATM(a1));
			  break;
			  
		  case 2:
			  u1.Choice(new Gpay(a1));
			  break;
	
		  case 3:
			  u1.Choice(new PhonePe(a1));
			  break;
			  
		  case 4:
			  u1.Choice(new Paytm(a1));
			  break;
			 
		  case 5:
			  a1.ViewBalance();
			  break;
			  
		  case 6:
			  System.out.println("-----------------------------------");
			  System.out.println("Accout Holder : "  +c1.name);
			  System.out.println("Accout Number : "  +a1.accno);
			  System.out.println("Bank Name : "  +a1.BankName);
			  System.out.println("Contact No : "  +c1.PhoneNo);
			  System.out.println("Adress : " + c1.Adress);
			  System.out.println("Branch : " + a1.branch);
			  System.out.println("-----------------------------------");
			  
			 break;
		 
		  case 7:
			  System.exit(0);
			  break;
	      default:
	    	  System.out.println("Invalid Option");
		  }
		  
		  
	  }
	

	}

}
