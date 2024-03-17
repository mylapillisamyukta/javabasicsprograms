package oopsassessment;
public class employdetailsassessment {
	String name;
	int yearofjoining;
	double salary;
	String address;
	employdetailsassessment(String name,int yearofjoining,double salary,String address)
	{
		this.name=name;
		this.yearofjoining=yearofjoining;
		this.salary=salary;
		this.address=address;
	}
	void display()
	{
		System.out.println(name+" "+yearofjoining+"  "+salary+" "+address);
	}
	public static void main(String[] args) {
		
		employdetailsassessment e1=new employdetailsassessment("Ramesh",1994 ,37500.75, "64C- James Street" );
		employdetailsassessment e2=new employdetailsassessment("sandeep",2000 ,42750.85, "68D- Bank Street" );
		employdetailsassessment e3=new employdetailsassessment("sandhya",1999,38785.25,"26B-Temple Lane");
		e1.display( );
        e2.display( );  
        e3.display();
        
	}

}


