package methodexample;

public class methodmarks {
	int  marks(int marks[])
	{
		int sum=0;
		for(int x:marks)
		{
			sum=sum+x;
		}
		return sum;
		
	}

	public static void main(String[] args) {
	 int a[ ]= {10,20,30,40};
	 methodmarks s=new methodmarks ( );
	 int y=s.marks(a);
	 System.out.print("mark"+y);
	}

}
