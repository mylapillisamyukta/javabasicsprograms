package exceptions;
import java.util.*;
class InvalidfundsException extends Exception
{
	String msg;
	InvalidfundsException(String msg)
	{
		super(msg);
	}
}
public class exceptionbankassessment {
	private int amount=3000;
	int totalamount;
	int wamt;
	Scanner sc=new Scanner(System.in);
	void deposit() {
		int damt;
		System.out.println("enter the amount you want to deposit: ");
		damt=sc.nextInt();
	    totalamount =amount+damt;
	    System.out.println("total amount after deposit: "+totalamount);
	}
	void withdraw()
	{
		int wamt;
		System.out.println("enter withdraw amount: ");
	    wamt=sc.nextInt();
	    totalamount = totalamount-wamt;
	    
	}
	void balancecheck() throws InvalidfundsException{
		if(totalamount<wamt)
		{
			throw new InvalidfundsException("InSufficent Balance");
		}
	else
	{
		System.out.println("total amount after withdraw :"+ totalamount);
	}
	}

	public static void main(String[] args) {
		exceptionbankassessment ob=new exceptionbankassessment();
		ob.deposit();
		ob.withdraw();
		try {
			ob.balancecheck();
		}
    catch(Exception e)
		{
    	System.out.println(e.getMessage()+e);
		}
	}

}

