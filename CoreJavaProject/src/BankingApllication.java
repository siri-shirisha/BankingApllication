import java.util.Scanner;

public class BankingApllication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount obj1=new BankAccount("karthik","12345678912");
		obj1.showmenu();
		Scanner scanner=new Scanner(System.in);
		int a=scanner.nextInt();	
	}

}
class BankAccount{
	int balance; //which  the money  having u r is account
	int previousTransaction;//which indicates which laste amount withdral from the account
	String CustomerName;
	String CustomerId; // i taken 4 variable from bank account
	
	BankAccount(String cname, String cid)//using constracter
	{
		CustomerName=cname;
		CustomerId=cid;}
	
	void deposit(int amount) // amount is parameter using 
	{
		if(amount !=0)
		{
		balance =balance +amount;
		previousTransaction=amount;
		}
	}
	
	void withdraw(int amount)
	{
		if(amount !=0)
		{
			balance =balance -amount;
			previousTransaction= -amount;
		}
	}
	void  getpreviousTransaction() {//this method will return to tell deposite or withdrall amount
		if (previousTransaction>0) {
			System.out.println("Deposited:"+previousTransaction);}
		else if (previousTransaction<0) {
			System.out.println(" withdraw:"+Math.abs(previousTransaction));//obslute 
		}
		else {
			System.out.println(" no transaction occured");
		}
	}
	void showmenu() {
		int option='\0';//intiallize with any Whats
		Scanner scanner=new Scanner(System.in);
			
		System.out.println(" Welcome:" +	CustomerName);
		System.out.println(" your id is:"+CustomerId);
		System.out.println("  ");//line break statement 
		System.out.println("A. Check Balance");
		System.out.println("B. Deposite");
		System.out.println("C. Withdraw");
		System.out.println("D. previousTransaction");
		System.out.println("E. Exit");
		
		do {
			System.out.println("---------------------------------------------------------------------------------------------------");
			System.out.println("Enter an option");
			System.out.println("---------------------------------------------------------------------------------------------------");
			option=scanner.next().charAt(0);
			System.out.println("  ");
			
			
			
			switch(option) {
			case '1':
				System.out.println("---------------------------------------------------------------------------------------------------");
				System.out.println("Balance="+balance);
				System.out.println("---------------------------------------------------------------------------------------------------");
				System.out.println("  ");
				break;
				
			case '2':
				System.out.println("---------------------------------------------------------------------------------------------------");
				System.out.println("Enter an amount to Deposite:");
				System.out.println("---------------------------------------------------------------------------------------------------");
				int amount1=scanner.nextInt();
				deposit(amount1);
				System.out.println("  ");
				break;
				
			case'3':
				System.out.println("---------------------------------------------------------------------------------------------------");
				System.out.println("Enter an amount to withdraw:");
				System.out.println("---------------------------------------------------------------------------------------------------");
				int amount2=scanner.nextInt();
				withdraw(amount2);
				System.out.println("  ");
				break;
				
				
			case'4':
				System.out.println("---------------------------------------------------------------------------------------------------");
				getpreviousTransaction();
				System.out.println("---------------------------------------------------------------------------------------------------");
				System.out.println("  ");
				break;
				
			case '5':
				System.out.println("---------------------------------------------------------------------------------------------------");
				break;
				
				
				default:
					System.out.println("Invalid option! 1.please enter again:");
					break;
			}
		}
		while(option !='5');
		System.out.println("Thank you for using our services:");
	}
}