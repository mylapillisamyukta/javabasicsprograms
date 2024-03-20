package oopsassessment;

public class Personassessment {
   String name;
   int  age;
   Personassessment(String name,int age)
   {
	   this.name=name;
	   this.age=age;
   }
   void display()
   {
	   System.out.println(name+"  "+"is"+" "+age+" "+"years old");
   }
	public static void main(String[] args) {
		Personassessment person1=new Personassessment("samyukta",23);
		Personassessment person2=new Personassessment("shyamala",23);
		person1.display();
		person2.display();

	}

}
