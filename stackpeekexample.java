package collections;
import java.util.Stack;  
public class stackpeekexample {

	public static void main(String[] args) {
		Stack<String> ob= new Stack<>();   
		ob.push("Apple");  
		ob.push("Grapes");  
		ob.push("Mango");  
		ob.push("Orange");  
		ob.push("watermelon");
		System.out.println("Stack: " + ob);  
		String fruits = ob.peek();  
		System.out.println("Element at top: " + fruits);  

	}

}
