package stringassessment;

public class string2instring1ornot {

	public static void main(String[] args) {
  /*  String String1="this is java";
    String String2="java";
    boolean result = String2.contains(String1);
    if(result)
    {
    	System.out.println(" true");
    }
    else
    {
    	System.out.println( "false");
    } */
		String String1="this is java";
	    String String2="java";
	   int result = String2.indexOf(String1);
	    if(result == -1)
	    {
	    	System.out.println("true");
	    }
	    else
	    {
	    	System.out.println( "false");
	    }
	}

}
