package collectionassessment;
import java.util.ArrayList;
import java.util.List;


public class arraylisttoarrayassessment {

	public static void main(String[] args) {
		   List<String> fruitList = new ArrayList<>();  
	        //adding String Objects to fruitsList ArrayList  
	        fruitList.add("Mango");  
	        fruitList.add("Banana");  
	        fruitList.add("Apple");  
	        fruitList.add("Strawberry");  
	        fruitList.add("Pineapple");  
	        System.out.println("Converting ArrayList to Array" );  
	        String[] item = fruitList.toArray(new String[fruitList.size()]);  
	        for(String s : item){  
	            System.out.println(s);  
	        }   
	}
	}
