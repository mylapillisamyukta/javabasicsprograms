package javaapplications;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Serializableexample {

	public static void main(String[] args) {
		try {
			 Employee ob = new  Employee(101,"samyukta");
		FileOutputStream fos = new FileOutputStream("serializable.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(ob);
		System.out.println("success");
		}catch(Exception e)
		{
		   System.out.println(e);	
		}

	}

}
