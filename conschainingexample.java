package conschaining;

public class conschainingexample {
		int id;
		String name;
		int fees;
		conschainingexample(int id,String name)
		{
			this.id =id;
			this.name = name;
		}
		conschainingexample(int id,String name,int fees)
		{
			this(id,name);
			this.fees = fees;
		}
		void display()
		{
			System.out.println(id + " "+ name+ " "+fees);
		}

		public static void main(String[] args) {
			conschainingexample ob = new conschainingexample(101,"samyukta",1000);
			ob.display();
			conschainingexample ob1 = new conschainingexample(102,"shyamala",1500);
			ob1.display();

	}

}
