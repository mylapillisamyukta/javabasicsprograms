package exceptions;

public class Stringoutofboundsexception {

	public static void main(String[] args) {
		try {
			String x="abc";
			System.out.println(x.charAt(3));
		}
		catch(exception e)
		{
			System.out.println(e.getMessage());
		}

	}

}
