package methodexample;

public class methodclassexample {

			int sum(int a, int b)
			{
				int c = a+b;
				//System.out.println("sum" + c);
				return c;
			}
		     String print1(String x)
		     {
		    	 return "hello" + x;

		     }

		     int sumofarray(int ars[])
		     {
		    	 int sum = 0;
		    	 for(int x: ars)
		    	 {
		    		 sum = sum + x;
		    	 }

		    	 return sum;
		     }



			public static void main(String[] args) {
				methodclassexample ob = new methodclassexample();
				int array1[] = {1,2,3,4,5,8};
				int u = ob.sumofarray(array1);
				System.out.println("sum of array is"+ u );

				int y =ob.sum(4,11);
				System.out.println(y);
				System.out.println(ob.sum(4,8));
				String s = ob.print1("samyukta");
				System.out.println(s);
				System.out.println(ob.print1("rahul"));
				System.out.println(ob.print1("shyamala"));
			

	}

}
