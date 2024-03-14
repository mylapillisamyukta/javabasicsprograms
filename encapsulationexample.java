package encapsulation;

public class encapsulationexample {
	int e;
	private int id;
	private String password;
	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return id;
	}
	public void setPassword(String password) {
		this.password = password;
	}
    
	public String getPassword() {
		return password;
	}
	public static void main(String[] args) {
		encapsulationexample e=new encapsulationexample( );
		e.setId(100);
		e.setPassword("samyukta");
		System.out.println(e.getId());
		System.out.println(e.getPassword());
	}

	}

