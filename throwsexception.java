package exceptions;
class ageException extends Exception
{
	//String msg;
	ageException(String msg)
	{
	super(msg);
	}
}
public class throwsexception {

			void validate(int age) throws ageException
			{
				if(age<18)
				{
				throw new ageException("i am userdefinedexception");
				}
			}
			
			
			public static void main(String[] args) throws ageException
			
			{
				
				 throwsexception  udf = new  throwsexception ();
				try {
				udf.validate(10);}
				catch(Exception e)
				{
					System.out.println(e.getMessage());
				}
				System.out.println("rest of code");

			}

		}

	


