package collections;
import java.util.*;
public class listiteratorexample {

	public static void main(String[] args) {
        List<Integer> ob = new LinkedList<>();
        ob.add(12);
        ob.add(23);
        ob.add(34);
        ListIterator<Integer> listIterator=ob.listIterator();
            
        System.out.println("next:");
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }
 
        System.out.println("previous:");
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        } 
	}
	}

