package collectionassessment;
import java.util.ArrayList;

public class removeallduplicatesassignment {

	public static void main(String[] args) {
		ArrayList<Integer> l1=new ArrayList<Integer>();  
		l1.add(5);  
		l1.add(6);  
		l1.add(8);  
		l1.add(9);
		l1.add(4);  
		l1.add(3);  
		l1.add(2);
		ArrayList<Integer> l2=new ArrayList<Integer>();  
		l2.add(5);  
		l2.add(6);  
		l2.add(8);  
		l2.add(9);
		l2.add(1);  
		l2.add(4);  
		l1.removeAll(l2);  
		System.out.println(l1);  

	}

}
