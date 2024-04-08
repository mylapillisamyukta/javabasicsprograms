package collectionassessment;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.LinkedHashSet;
public class removeduplicateassessment {

	public static void main(String[] args) {
		  List<String> t1= new ArrayList<String>();  
	        t1.add("Mango");  
	        t1.add("Banana");  
	        t1.add("Mango");  
	        t1.add("Apple");  
	        System.out.println(t1.toString());  
	        Set<String> s = new LinkedHashSet<String>(t1);  
	        System.out.println(s);  
	        List<Integer> t2= new ArrayList<Integer>();  
	        t2.add(1);  
	        t2.add(3);  
	        t2.add(3);  
	        t2.add(4); 
	        t2.add(5);  
	        t2.add(6);  
	        t2.add(6);  
	        t2.add(8);  
	        Set<Integer> s2= new LinkedHashSet<Integer>(t2);  
	        System.out.println(s2);  
	        


	}

}
