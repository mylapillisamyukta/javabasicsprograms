package diagonalarray;
import java.util.*;
public class diagonalarrayexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]= {{3,2,3},{4,6,6},{7,8,1}};
		int sum=0;
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(i == j)
					sum=sum+a[i][j];
			}
		}
      System.out.print("sum is" +sum);
	}

}
