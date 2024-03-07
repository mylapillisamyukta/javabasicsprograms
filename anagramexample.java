package string;

import java.util.Arrays;

public class anagramexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="keep";
		String b="peek";
		if(a.length( )==b.length( ))
		{
			char c1[ ]=a.toCharArray( );
			char c2[ ]=b.toCharArray( );
			Arrays.sort(c1);
			Arrays.sort(c2);
			boolean result=Arrays.equals(c1,c2);
			if(result == true) {
				System.out.print("Anagram");
			}
			else
			{
				System.out.println(" is not Anagram");
				
			}
		}

	}

}
