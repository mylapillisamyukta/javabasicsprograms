package primenumber;
import java.util.*;
import java.util.Scanner;

public class primenumberscanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		System.out.print("enter a number: ");
		int n=s.nextInt();
		if(isprime(n)) {
			System.out.println(n+"is a prime number");
		}
		else {
			System.out.println(n+"is not a prime number");
		}
	}
	public static boolean isprime(int n) {
		if(n<=1) {
			return false;
		}
		for(int i=2;i<Math.sqrt(n); i++) {
			if(n %i==0) {
				return false;
			}
		}
		return true;
	}

}
