package javaclass;

public class employee {
	int eid;
	String ename;
	static String company ="TMF";
    public static void main(String[] args) {
		employee e1=new employee();
		employee e2=new employee();
		e1.eid=8892;
		e1.ename="samyukta";
		e2.eid=8890;
		e2.ename="shyamala";
		System.out.println(e1.eid+" "+e1.ename);
		System.out.println(e2.eid+" "+e2.ename);
	
	}

}
