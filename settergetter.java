package constructors;

public class settergetter {
	int id;
	String name;
public void setId(int id) {
	this.id = id;
}
public int getId() {
	return id;
}
public void setName(String  name) {
	this.name = name;
}

public String getName() {
	return name;
}

	public static void main(String[] args) {
		settergetter ob = new settergetter();
		ob.setId(101);
		System.out.println("id is "+ob.getId());
		ob.setName("samyukta");	
		System.out.print( "name is " +ob.getName( ));
	

	}

}
