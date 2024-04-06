package javaapplications;
import java.io.*;

class Employee implements Serializable
{
	 int id;
	 String name;
	 Employee(int id,String name)
	 {
		 this.id=id;
		 this.name=name;
	 }
}