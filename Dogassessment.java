package oopsassessment;

public class Dogassessment {
	String name;
	String breed;
	Dogassessment(String name,String breed)
	{
		this.name=name;
		this.breed=breed;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public static void main(String[] args) {
		Dogassessment dog1=new Dogassessment ("Minnu","Golden Retriever");
		Dogassessment dog2=new Dogassessment ("Mylo","pomeranian");
		System.out.println(dog1.getName() + " is a " + dog1.getBreed() + ".");
		System.out.print(dog2.getName()+" is a "+dog2.getBreed()+".");

	}

}
