package stringrevision;

public class spacecount {

	public static void main(String[] args) {
		 String test = "This is java programming";
	        count(test);
	    }

	    public static void count(String x) {
	        char[] ch = x.toCharArray();
	        int space = 0;
	        for (int i = 0; i < x.length(); i++) {
	            if (Character.isSpaceChar(ch[i]))
	            space++;
	        }
	        System.out.println(" no.of space: " + space);
	       

	}

}
  