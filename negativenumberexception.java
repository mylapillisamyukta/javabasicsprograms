package exceptions;

public class negativenumberexception {
	void validnumber(int number)
	{
		if(number<0)
		{
			throw new ArithmeticException("negative number exception");
		}
	}

	public static void main(String[] args) {
		negativenumberexception ob=new negativenumberexception();
		try
		{
			ob.validnumber(-3);
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
			System.out.println(e);
		}
		
		System.out.println("terminate here");
	}

}
