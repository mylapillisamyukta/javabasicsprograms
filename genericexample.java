package collections;

import java.util.ArrayList;

public class genericexample {

	public static void main(String[] args) {
		ArrayList<Integer> ob1=new ArrayList<Integer>();
		ob1.add(10);
		ob1.add(20);
		ob1.add(30);
		ob1.add(40);
		ob1.add(10);
		for(Integer x:ob1)
		{
			System.out.println(x);
		}
	
	}

}
