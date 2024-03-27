package exceptions;

public class throwkeyworduse {
		void validdateage(int age)
		{
			if(age<18)
			{
				throw new ArithmeticException("invalid age is lessthan 18");
			}
		}
		public static void main(String[] args) {
			throwkeyworduse ob=new throwkeyworduse();
		/*	ob.validdateage(20);
			System.out.println("terminate here");   -->terminate here   */
			try
			{
				ob.validdateage(12);
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
			System.out.println(" terminate here ");
	}

}
