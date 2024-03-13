package javaapplications;
import java.util.Scanner;

public class bankapplication {
	Scanner sc=new Scanner(System.in);
	int BankDetails;
	int Bankbalance;
	int AccountNumber;
	String name;
	void Details( )
	{
		System.out.println("enter your name ");
		System.out.println("enter  AccountNumber");
		System.out.println("Bankbalance");
	     name=sc.next( );
	     AccountNumber=sc.nextInt();
	     Bankbalance=sc.nextInt(); 
	}
	void display( )
	{
		System.out.println(" name"+ name);
		System.out.println("AccountNumber"+AccountNumber);
		System.out.println("Bankbalance"+Bankbalance);
	}
	void  deposit( )
	{
		int n=50;
		Bankbalance= Bankbalance+n;
		System.out.println(" Deposit Bankbalance"+ Bankbalance);
	}
	void withdraw( )
	{
		int withdrawamount=1000;
		if(withdrawamount< Bankbalance)
		{
			Bankbalance=Bankbalance-withdrawamount;
			System.out.println("withdraw Bankbalance"+ Bankbalance);
		}
		else
		{
			System.out.println("insufficient bankbalance");
		}
		
	}
		
	

	public static void main(String[] args) {
		 bankapplication ob=new  bankapplication( );
		 ob.Details( );
		 ob.display();
		 ob.deposit();
		 ob.withdraw();

	}

}
