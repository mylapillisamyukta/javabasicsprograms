package twodarray;
import java.util.*;

public class twodarrayexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]=new int[2][2];
		Scanner Sc=new Scanner(System.in);
		for(int i=0;i<2;i++)
		{
	    for(int j=0;j<2;j++)
	    {
	    	a[i][j]=Sc.nextInt();
	    }

		}
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print(a[i][j]);
			}
			System.out.println( );
		}
		
	}
}



