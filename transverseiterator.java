package collections;
import java.util.*;

public class transverseiterator {

	public static void main(String[] args) {
		ArrayList<String>ob1=new ArrayList<String>();
		ob1.add("apple");
		ob1.add("banana");
		ob1.add("grapes");
		ob1.add("orange");
		ob1.add("watermelon");
		Iterator<String >itr=ob1.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		ArrayList<String>ob2=new ArrayList<String>();
		ob2.add("blueberry");
		ob2.addAll(ob1);
		System.out.print("final list");
        System.out.println(ob2);
        ArrayList<String>ob3=new ArrayList<String>();
        ob3.add("potato");
        System.out.println(ob3);
        ob1.remove(1);
        System.out.println("after removing");
        System.out.print(ob1);
        System.out.println(ob1.size());
        System.out.println(ob1.get(0));
        //System.out.println(ob3.set(1,"samyu");
        ob1.set(1,"samyu");
        //ob3.clear();
       System.out.print(ob1);
       
        
        
        }

}
