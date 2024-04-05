package collections;

import java.util.Vector;
//import java.util.ArrayList;

public class vectorexample {

	public static void main(String[] args) {
		 Vector<String> ob = new Vector<String>(4);  
          ob.add("Tiger");  
          ob.add("Lion");  
          ob.add("Dog");  
          ob.add("Elephant");  
          if(ob.contains("Lion"))  
          {  
               System.out.println("Java is present at the index " +ob.indexOf("Lion"));  
          }  
          else  
          {  
             System.out.println("Java is not present in the list");  
          }  
          System.out.println("Size is: "+ob.size());  
          System.out.println("Default capacity is: "+ob.capacity());  
          System.out.println("Vector element is: "+ob);  
          ob.addElement("Rat");  
          ob.addElement("Cat");  
          ob.addElement("Deer");  
          System.out.println("Vector addelement is: "+ob);
          ob.remove(1);
          System.out.println("Vector removeelement is: "+ob);   
	/*	 ArrayList<Integer>  ob1 = new   ArrayList<Integer>(4);    
		 ob1.add(1);  
		 ob1.add(2);  
		 ob1.add(3);  
          System.out.println("List of first arrayList: "+ob1);  
          ArrayList<Integer>  ob2 = new ArrayList<Integer>(4);  
          ob2.add(4);  
          ob2.add(5);  
          ob2.add(6);  
          System.out.println("List of second arrayList: "+ob2);        
          ob1.addAll(ob2);  
          System.out.println("Final arrayList: "+ob1);      */    
          
	}

}
