package exceptionassessment;
class ageException extends Exception
{

	ageException(String msg)
	{
	super(msg);
	}
}


public class exceptionlessthanageassessment {

		void validate(int age) throws ageException
		{
			if(age<18)
			{
			throw new ageException("invalid age exception");
			}
		}
		
		public static void main(String[] args) throws ageException
		
		{
			
			exceptionlessthanageassessment udf = new   exceptionlessthanageassessment();
			try {
			udf.validate(13);
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
			System.out.println("rest of code");

		}


	}


