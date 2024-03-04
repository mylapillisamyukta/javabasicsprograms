package firstprogram;
import java.util.*;
import java.util.Arrays;
import java.util.Scanner;

public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Sc=new Scanner(System.in);
		int a[]=new int[5];
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			a[i]=Sc.nextInt();
			
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
			sum=sum+a[i];
			
	}
		
     System.out.println("sum is"+ sum);
	}

}
