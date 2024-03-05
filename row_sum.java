package javaapplication;
import java.util.*;

public class row_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner Sc=new Scanner(System.in);
      int a[][]=new int[3][3];
      int sum=0;
      
      for( int i=0;i<3;i++) {
    	  for(int j=0;j<3;j++)
    	  {
    		  a[i][j]=Sc.nextInt();
    	  }
      }
      {
    	  int row_sum=0;
    	  int col_sum=0;
    	  for( int i=0;i<3;i++)
    	 for( int j=0;j<3;j++)
    	 {
    	System.out.print(a[i][j]);
    	sum=sum+a[i][j];
    	row_sum=row_sum+a[i][j];
    	col_sum=col_sum+a[j][i];
    	 }
    	 System.out.println();
    	 System.out.println("row sum"+ row_sum);
    	 System.out.println("col sum"+ col_sum);
      }
      
      System.out.println("sum is" + sum);

    	  
	}

}
