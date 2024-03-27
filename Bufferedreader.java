package buffered;
import java.io.*;

public class Bufferedreader {

	public static void main(String[] args)throws IOException
	{
		  InputStreamReader reader=new InputStreamReader(System.in);    
		    BufferedReader br=new BufferedReader(reader);   
		 System.out.println("enter name");
		 String name=br.readLine();
		 System.out.println("enter age");
		 int age=Integer.parseInt(br.readLine());
		 System.out.println("enter salary");
		 Float salary=Float.parseFloat(br.readLine());
		 {
			 System.out.println(name+" "+age+" "+salary+" ");
		 }
		 

	}

}
