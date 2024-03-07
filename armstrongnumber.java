package armstrong;
import java.util.*;
import java.lang.Math;
import java.util.Scanner;
public class armstrongnumber {

		static boolean isArmstrong(int n) 
		{
		int temp;
		int digits=0;
		int last=0;
		int sum=0;
		 temp=n;
		{
		while(temp>0)
		{
		  temp=temp/10;
		  digits++;
		}
		temp =n;
		
			while(temp>0) {
			last=temp % 10;
	        sum += (Math.pow(last,digits));
			temp=temp/10;
			}
			if(n == sum)
			{
	        return true;
			}
			else 
			{
				return false;
			}
			}
		}
		public static void main(String args[]) {
			int num;
			Scanner Sc=new Scanner(System.in);
			System.out.print("enter the number: ");
			num=Sc.nextInt();
			if(isArmstrong(num))
			{
				System.out.println(" given no. is an armstrong number");
			}
			else
			{
			System.out.println("  given no. is not armstrong");
			}
		}
}
