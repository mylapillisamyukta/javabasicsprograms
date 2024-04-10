package map;
import java.util.*;
public class hashmapexample {

	public static void main(String[] args) {
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(1,"orange");
		hm.put(2, "mango");
		hm.put(3, "banana");
		System.out.print(hm); 
		   for(Map.Entry m : hm.entrySet())
		   {    
		    System.out.println(m.getKey()+" "+m.getValue());  
		   }

	}

}
