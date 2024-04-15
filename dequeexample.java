package mapexample;
import java.util.*;

public class dequeexample {

	public static void main(String[] args) {
		  Deque<Integer> deque = new ArrayDeque<Integer>();    
		    deque.add(1);  
		    deque.add(2);  
		    deque.add(3); 
		    deque.add(4);  
		    deque.add(5);  
		    deque.add(6); 
		    System.out.println("Inserting three elements : ");  
		    for (Integer integer : deque) {  
		    System.out.println(integer);      
		    }   
		    deque.pop();  
		    System.out.println("After popping : ");  
		    for (Integer integer : deque) {  
		        System.out.println(integer);  
		    }  
		    deque.remove(3);  
		    System.out.println("Removing the element 3 :"+deque);
		    int size =  deque.size();  
		     System.out.println("The number of elements are : "+size);   
		     deque.removeLast();  
		 System.out.println("Deque after removing the last element is given as :  "+deque);  

	}

}
