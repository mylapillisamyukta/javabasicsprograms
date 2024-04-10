package hashset;
import java.util.*;

public class hashsetiterator {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();  
		al.add("apple");  
		al.add("dog");  
		al.add("cat");  
		al.add("fish");  
		al.add("yak");  
		al.add("unicorn");  
		al.add("hat");  
		  
		Collections.sort(al);  
		System.out.println(Collections.min(al));
		System.out.println(Collections.max(al));
		Iterator<String> itr=al.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		
		
		 }  
		} 

	}


