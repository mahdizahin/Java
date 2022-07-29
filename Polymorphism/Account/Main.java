import java.lang.*;
import java.util.Scanner;

public class Main
{
	public static void main(String args[])
	{

       System.out.println("How many Accounts you want to Create?");
       Scanner input = new Scanner (System.in);
       int An= input.nextInt();

        System.out.println("Please select the below Option ");
        System.out.println("1.Savings Accounts 2. Fixed Account");
        int NoOfAccount = input.nextInt();


        if(NoOfAccount==1){
        	System.out.print("Account Holder Name :");
        	input.nextLine();
        	String AccountHolderName =input.nextLine();

        	System.out.print("Accout No :");
        	//input.nextInt();
        	int AccountNo = input.nextInt();

        	System.out.print("Balance:");
        	//input.nextDouble();
        	double Balance = input.nextDouble();

        	System.out.print("Interest Rate :");
        	//input.nextDouble();
        	double Interest = input.nextDouble();

        	System.out.println("-------------Out put------------");

        	Account sa = new SavingsAccount(AccountNo,AccountHolderName,Balance,Interest);
            sa.showDetails();

            System.out.println("Total Balance :"+(((Balance*Interest)/100)+Balance));
            //System.out.println("Total Balance :"+Balance+"*"+Interest+"="+((Balance*Interest)/100)+Balance);


        }

        else if (NoOfAccount==2){
        	System.out.print("Account Holder Name :");
        	input.nextLine();
        	String AccountHolderName =input.nextLine();

        	System.out.print("Accout No :");
        	//input.nextInt();
        	int AccountNo = input.nextInt();

        	System.out.print("Balance:");
        	//input.nextDouble();
        	double Balance = input.nextDouble();

        	System.out.print("Tunure Year :");
        	int Year = input.nextInt();


        	Account fa = new FixedAccount(AccountNo,AccountHolderName,Balance,Year);
            fa.showDetails();


        }

          // do{
          // 	System.out.println("");
          // }




		// Customer c = new Customer("+988877655544");
		// Account a1 = new SavingsAccount(10);
		// /*a1.setInterestRate(10);*/
		// a1.setAccountNumber(111);
		// a1.setAccountHolderName("abc");
		// a1.setBalance(500.0);

		// c.addAccount(a1);

		// Account a2 = new FixedAccount(3);
		// /*a2.setTenureYear(3);*/
		// a2.setAccountNumber(222);
		// a2.setAccountHolderName("def");
		// a2.setBalance(20000.0);

		// c.addAccount(a2);

		// c.showAllAccounts();

	}
}