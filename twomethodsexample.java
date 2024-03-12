package methodexample;
import java.util.Scanner;

public class twomethodsexample {
		Scanner sc = new Scanner(System.in);
		String name;
		int id ;
		void accept()
		{
			System.out.println("enter name");
			name = sc.next();
		     id = sc.nextInt();

		}
		void display()
		{
			System.out.println("name"+name);
			System.out.println("id"+id);
		}

		public static void main(String[] args) {

			twomethodsexample ob = new twomethodsexample();
			ob.accept();
			ob.display();

		}
	
}