package stringassessment;
import java.util.Scanner;
public class englishwords {

	public static void main(String[] args) {
	 Scanner SC = new Scanner(System.in); 
    System.out.println("enter first word : ");
    String a=SC.next();
    System.out.println("enter second word : ");
    String b=SC.next();
    System.out.println("enter third word : ");
    String c=SC .next();
    c=c.toUpperCase();
    String result=" ";
    for(int i=0;i<a.length();i++)
    {
    	char ch=a.charAt(i);
    	if(ch=='a' ||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
    	{
    		a=a.replace(ch,'*');
    	}
    }
    for(int i=0;i<b.length();i++)
    {
    	char ch=b.charAt(i);
    	if(ch=='a' ||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
    	{
    		continue;
    	}
    	else
    	{
    		b=b.replace(ch,'@');
    	}
    }
    result=result.concat(a).concat(b).concat(c);
    System.out.println(result);
    }
    
}
