package exceptions;

public class Arithemeticexception {

	public static void main(String[] args) {
	 /*  System.out.println("welcome to java"); // welcome to java
		int d=100/0;
		System.out.println(d);
		System.out.println("FULL STACK JAVA DEVELOPMENT"); // DOES NOT DISPLAYED THE OUTPUT   */
		// BY USING TRY-CATCH
		System.out.println("welcome to java");
		try {
			int d=100/0 ;
		   System.out.println(d);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		System.out.println("FULL STACK JAVA DEVELOPMENT");
		

	}

}
