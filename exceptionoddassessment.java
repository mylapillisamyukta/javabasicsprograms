package exceptions;

public class exceptionoddassessment {
	void oddnumber(int number)
	{
		if(number %2 !=0) {
			throw new ArithmeticException(" odd number");
		} 
		
	}

	public static void main(String[] args) {
		exceptionoddassessment ob=new exceptionoddassessment();
		try {
		ob.oddnumber(5);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		System.out.println("not a odd number");
	}
	}
		
