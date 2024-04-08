package collectionassessment;
import java.util.TreeSet;


public class comparetosetsassessment {

	public static void main(String[] args) {
		 TreeSet<String> set1 = new TreeSet<String>();
	          set1.add("Red");
	          set1.add("Green");
	          set1.add("Black");
	          set1.add("White");
	          System.out.println("Frist Tree set: "+set1);
	          TreeSet<String> set2 = new TreeSet<String>();
	          set2.add("Red");
	          set2.add("Green");
	          set2.add("Yellow");
	          set2.add("White");
	          System.out.println("Second Tree set: "+set2);
	         for (String element : set1){
	             System.out.println(set2.contains(element) ? "Yes" : "No");
	         }

	}

}
