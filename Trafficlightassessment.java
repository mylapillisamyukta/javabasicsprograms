package oopsassessment;
// import java.util.Scanner;
public class Trafficlightassessment {
	String color;
	int duration;
	Trafficlightassessment(String color,int duration)
	{
		this.color=color;
		this.duration=duration;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public static void main(String[] args) {
	/* Scanner sc=new Scanner(System.in);
	System.out.println("enter color:");
	String color=sc.nextLine();
	System.out.println("enter duration:");
	String duration=sc.next();
	System.out.println("trafficlight color is"+ color+" "+"duration is"+" "+duration);*/
		Trafficlightassessment  light1= new Trafficlightassessment("red", 30);
		Trafficlightassessment light2=new Trafficlightassessment("green",40);
		 System.out.println(light1.getColor()+" " +light1.getDuration());
	     System.out.println(light2.getColor()+" "+ light2.getDuration());
		

	
	} 
	
	}

