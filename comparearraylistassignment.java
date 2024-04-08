package collectionassessment;
import java.util.ArrayList;
import java.util.List;

public class comparearraylistassignment {

	public static void main(String[] args) {
        List<String> a1 = new ArrayList<String>(); 
        a1.add("AB");
        a1.add("BC");
        a1.add("CD");
        System.out.println("List: " +a1); 
        List<String> a2 = new ArrayList<String>(); 
        a2.add("AB");
        a2.add("BC");
        System.out.println("List: " +a2); 
        System.out.println("Are all the contents equal? "
                           + a1.containsAll(a2)); 

	}

}
