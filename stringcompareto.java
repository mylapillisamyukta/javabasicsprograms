package string;

public class stringcompareto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String x="Javaprogram";
		String y="javaprogram";
		String z= new String("javaprogram");
		String c="javaprogram";
		int i;
		if(x.equals(y))
		{
			System.out.print(" x is equal to y");
		}
			else
			{ 
				System.out.println( " x is  not equal to y ");
			}
		
		if( x==z)
		{
			System.out.print("x is equal to y");
		}
		else
			{
				System.out.println(" x is  not equal to y");
			}
		if((i=x.compareTo(z))==0)
		{
			System.out.print(" true");
		}
		else
		{
			System.out.println("false");
		}
	}

}
