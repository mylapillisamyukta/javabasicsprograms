package hashset;
import java.util.*;
import java.util.Collections;

public class generichashset {

	public static void main(String[] args) {
		HashSet<Integer> h1=new HashSet<Integer>();
		h1.add(1);
		h1.add(3);
		h1.add(2);
		h1.add(4);
		h1.add(6);
		h1.add(8);
		System.out.println(h1);
		System.out.println(h1.contains(9));
		//System.out.println(h1.remove(4));
		h1.remove(4);
		System.out.println(h1);
		//h1.clear();
		System.out.println(h1.size());
		for(Integer i:h1)
		{
			System.out.println(i);
		}
		 for(int i = 1; i <= 10; i++) {
		      if(h1.contains(i)) {
		        System.out.println(i + " was found in the set.");
		      } else {
		        System.out.println(i + " was not found in the set.");
		      }
	}
    
	}
}
