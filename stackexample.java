package collections;
import java.util.Stack;

public class stackexample {

	public static void main(String[] args) {
		Stack<Integer> sc=new Stack<Integer>();
		sc.push(10);
		sc.push(20);
		sc.push(30);
		sc.pop();
		sc.peek();
	
		System.out.println(sc);

	}

}
