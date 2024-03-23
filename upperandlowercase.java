package stringrevision;

public class upperandlowercase {

	public static void main(String[] args) {
	
		 String x="THIS is JAVA";    
	        StringBuffer y=new StringBuffer(x);        
	        for(int i = 0; i < x.length(); i++) {       
	            if(Character.isLowerCase(x.charAt(i))) {        
	                y.setCharAt(i, Character.toUpperCase(x.charAt(i)));    
	            }    
	            else if(Character.isUpperCase(x.charAt(i))) {       
	                y.setCharAt(i, Character.toLowerCase(x.charAt(i)));    
	            }    
	        }    
	        System.out.println("String after case conversion : " + y);    
	
	}
}


