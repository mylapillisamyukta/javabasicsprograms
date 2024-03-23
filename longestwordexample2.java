package stringrevision;

public class longestwordexample2 {

	public static void main(String[] args) {
		String str="this is Java Programming";
		String ch[]=str.split(" ");
		String max=ch[0];
		
		for(int i=0;i<ch.length;i++) {
			
			if(ch[i].length()>max.length()) {
				max=ch[i];
			}}
		
System.out.println(max);
	}

}
