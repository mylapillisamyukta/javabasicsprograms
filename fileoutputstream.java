package javaapplication;
import java.io.*;
 public class fileoutputstream{
	public static void main(String[] args) {
		try {
			FileOutputStream fos =new FileOutputStream("C:\\Users\\DT054\\eclipse-workspace\\javaapplication\\src\\javaapplication\\output.txt");
			
			String s="hello world";
			byte b[]=s.getBytes();
			fos.write(b);
			fos.close();
			}
		catch(Exception e)
		{
	
	
	System.out.println(e.getMessage());
}
	}}

