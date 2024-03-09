package stringassessment;

import java.util.Arrays;

public class anagramornot {

	public static void main(String[] args) {
	/*	String a="Ramu";
	    String b="umar";
	    if(a.length()== b.length()) 
	    {
	    char c1[]=a.toCharArray();
	    char c2[]=b.toCharArray();
	    Arrays.sort(c1);
	    Arrays.sort(c2);
	    boolean result=Arrays.equals(c1, c2);
	    if(result == true)
	    {
	    	System.out.println("anagram");
	    }
	    else
	    {
	    	System.out.println("not anagram");

	    }  ----->not anagram  */
		String a="Ramu";
	    String b="umaR";
	    if(a.length()== b.length()) 
	    {
	    char c1[]=a.toCharArray();
	    char c2[]=b.toCharArray();
	    Arrays.sort(c1);
	    Arrays.sort(c2);
	    boolean result=Arrays.equals(c1, c2);
	    if(result == true)
	    {
	    	System.out.println("anagram");
	    }
	    else
	    {
	    	System.out.println("not anagram");

	    	
	    }
	    
	}

}

}