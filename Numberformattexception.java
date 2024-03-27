package exceptions;

public class Numberformattexception {

	public static void main(String[] args) {
		try
		{
			int i=Integer.parseInt(x);
			System.out.println(i);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}

	}

}
