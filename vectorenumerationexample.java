package vectorexample;
import java.util.*;

public class vectorenumerationexample {

	public static void main(String[] args) {
		 Vector<String> ob= new Vector<String>();         
         ob.add("apple");  
         ob.add("zoo");  
         ob.add("ball");  
         ob.add("egg");  
         ob.add("cat");  
         ob.add("fish");   
         Enumeration<String> en = Collections.enumeration(ob);  
         System.out.println("The Enumeration List are: ");  
         while(en.hasMoreElements()){  
              System.out.println(en.nextElement());  
         }          

	}

}
