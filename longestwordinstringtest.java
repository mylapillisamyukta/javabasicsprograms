package classprogram;
// import java.util.Arrays;
 //import java.util.Comparator;

public class longestwordinstringtest {
	public static void main(String[] args) {
		  /*      String s = " JAVA WORLD";
		        String longest = Arrays.stream(s.split(" "))
		          .max(Comparator.comparingInt(String::length))
		           .orElse(null);
		        System.out.println(longest);   */
	    
		String string = "JAVA WORLD";    
	      String word = "", large="";    

	      String[] words = new String[50]; 
	      int length = 0;      
	      string = string + " ";    
	          
	      for(int i = 0; i < string.length(); i++){      
	          if(string.charAt(i) != ' '){    
	              word = word + string.charAt(i);    
	          }    
	          else{       
	              words[length] = word;       
	              length++;    
	              word = "";    
	          }    
	      }            
	      large = words[0];     
	      for(int k = 0; k < length; k++){       
	          if(large.length() < words[k].length())    
	              large = words[k];    
	      }    
	     
	      System.out.println("Largest word: " + large);    
	  }  }  
   
