package exceptions;

public class uncheckedexception {

	public static void main(String[] args) {
		 System.out.println("welcome to java");
	     try {
	    	 String x="abc";
	    	 // System.out.println(x.charAt(3));
	    	 //int i=Integer.parseInt(x);
	    	 System.out.println(x);
	     } 
	   
	     catch(ArithmeticException e)
	     {
	    	System.out.println(e.getMessage());
	    	System.out.println(e);
	     }
	     catch(Exception e)
	     {
	    	 System.out.println(e.getMessage());
	    	 System.out.println(e);
	     }
	     finally
	     {
	    	System.out.println("full stack java development"); 
	     }
	       System.out.println("hello");
		}

	}

