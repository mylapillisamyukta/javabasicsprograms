package mapexample;
import java.util.*;  
public class linkedhashmapexample {

	public static void main(String[] args) {
		  LinkedHashMap<Integer,String> lhm=new LinkedHashMap<Integer,String>();  
		  
		 lhm.put(1,"ram");  
		 lhm.put(2,"sita");  
		 lhm.put(3,"laxman");  
		 lhm.remove(2); 
		for(Map.Entry m:lhm.entrySet()){  
		   System.out.println(m.getKey()+" "+m.getValue());  
		  }  
		   System.out.println("Keys: "+lhm.keySet());  
	       System.out.println("Values: "+lhm.values());  
	       System.out.println("Key-Value pairs: "+lhm.entrySet());  

	}

}
