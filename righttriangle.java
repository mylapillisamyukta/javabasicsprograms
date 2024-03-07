package javaapplication;

public class righttriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 /* int i,j,row=6;
		for(i=0;i<row;i++) {
			for(j=0;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println( );----output *
			                                 * *
			                                 * * *
			                                 * * * *
			                                 *  * * * *   */
			        
			         
	    int row=6;             
		for(int i=0;i<row;i++)
		{ 
	       for(int j=2*(row-i);j>0;j--) {
			System.out.print(" ");
	       }
			for( int j=0;j<=i;j++)
			{ 
				System.out.print("*");
			}
			 System.out.println( );  
	/*	for(int i=0;i<3;i++) {	
		for(int j=2*(3-i);j>0;j--) {
			{
			for(int k=0;k<=i;k++)
			System.out.println(" ");
			 {		
				
				System.out.print("*");
			}
			}

		}
	} */
	}
}
}



