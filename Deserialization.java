package javaapplications;
import java.io.*;
import java.io.FileInputStream;
import java.io.ObjectOutputStream;

public class Deserialization {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("serializable.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Employee e = (Employee)ois.readObject();
			System.out.println(e.id+e.name);
			}catch(Exception e) {System.out.println(e);}

	}

}
