/*create a bank class to calculate withdraw and deposit.if amount will be given from user.if amount
is sufficient then 'withdraw successful' will going to print.later on deposit 5000rs in the account balance*/ 

package anudip;
import java.util.*;

public class Bank {
	static int balance=5000;
	static int a=5000;
	static int deposit(int amount)//deposit is a method
	{
		balance=balance+amount;
		return(balance);
	}
		static int withdraw(int with)
		{
			if(a<with) {
				System.out.print("insufficient balance");
			}
			else {
				balance=balance-with;
				System.out.print("withdrawl Successfully");
			}
			return(balance);
		}
	public static void main(String[] args) {
		do {
		System.out.println("1.deposit\n2.withdraw\n3.exit");	
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your choice: ");
		int ch=sc.nextInt();
		
		switch (ch) {
		case 1:
			System.out.println("enter your amount: ");
			int a=sc.nextInt();
			int deposit=Bank.deposit(a);
			System.out.print("Successfully");
			System.out.print("deposit is :- "+balance);
			System.out.println();
			break; 
			
		case 2:
			System.out.println("enter your amount: ");
			int b=sc.nextInt();
			int withdraw=Bank.withdraw(b);
			System.out.println();
			System.out.println("Balance is" +balance);
			break;
		case 3:
			System.exit(0);
		default:System.out.println("insufficient balance");
		}
	}while(true);}
}
