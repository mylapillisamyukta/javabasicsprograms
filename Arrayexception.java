package exceptions;

public class Arrayexception {

	public static void main(String[] args) {
		System.out.println("welcome to java");
		try
		{
			int a[]=new int[6];
			System.out.println(a[6]);
			  a[6]=100/0;
			System.out.println(a[6]);
			
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage()); //Index 6 out of bounds for length 6
		}

	}

}
