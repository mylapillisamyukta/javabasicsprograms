package javaapplication;

import java.io.FileWriter;

public class Filewriter {

	public static void main(String[] args) {
	try {
		FileWriter fw=new FileWriter("C:\\Users\\DT054\\eclipse-workspace\\javaapplication\\src\\javaapplication\\writer.txt");
	    fw.write("full stack java development");
	    fw.close();
	}
	    	catch(Exception e)
	    	{
	    		System.out.print(e.getMessage());
	    	}
	    }
	}

	


