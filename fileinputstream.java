package javaapplication;
import java.io.*;
public class fileinputstream {

	public static void main(String[] args) {
		try {
			FileInputStream fis =new FileInputStream("C:\\Users\\DT054\\eclipse-workspace\\javaapplication\\src\\javaapplication\\input.txt");
			int i=0;
		while( (i=fis.read())!=-1)
		{
		System.out.print((char)i);
			}
		}
		catch(Exception e)
		{
	System.out.println(e.getMessage()+e);
}


	}

}
