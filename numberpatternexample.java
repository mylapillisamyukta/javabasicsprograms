package numberpattern;

public class numberpatternexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 1. for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");			
		}
		System.out.println( );   ---output 1
		                                   1 2
		                                   1 2 3
		                                   1 2 3 4
		                                   1 2 3 4 5 */
	/*2.	for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++)
			{
				System.out.print(i+" ");			
		}
		System.out.println( ); ----output 1
		                                  2 2
		                                  3 3 3
		                                  4 4 4 4 
		                                  5 5 5 5 5 */
		int k=1;
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++)
			{
				System.out.print(k+" ");
				k++;
		}
		System.out.println( );
		
	}
	}
}


