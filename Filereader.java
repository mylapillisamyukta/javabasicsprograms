package javaapplication;
import java.io.*;

public class Filereader {

	public static void main(String[] args) {
		{
			try
			{
				FileReader fR=new FileReader("C:\\Users\\DT054\\eclipse-workspace\\javaapplication\\src\\javaapplication\\reader.txt");
			     int i=0;
				while((i=fR.read())!=-1)
				{
					System.out.print((char)i);
	
				}
				fR.close();
			}
				catch(Exception e)
				{
					System.out.println(e.getMessage());
			}
		}
		}
	}
