package exceptions;

public class Nullpointerexception {

	public static void main(String[] args) {
		System.out.println("welcome to java");
		try {
			String s=null;
			System.out.println(s.length()); // Nullpointerexception
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		System.out.println("hello world");
		
		

	}

}
