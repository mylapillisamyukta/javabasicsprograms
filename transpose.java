package javaapplication;
import java.util.*;
public class transpose {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Sc=new Scanner(System.in);
		int a[][]=new int[2][2];
		for(int i=0;i<2;i++)
		for(int j=0;j<2;j++)
		{
			 a[i][j]=Sc.nextInt();
		}
	
				for(int i=0;i<2;i++)
					for(int j=0;j<2;j++)
					{
			System.out.println(a[j][i]);

}
	}
}

