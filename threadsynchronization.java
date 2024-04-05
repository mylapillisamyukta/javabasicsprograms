package threads;

public class threadsynchronization {

	public static void main(String[] args) {
		printer ob=new printer();
		printthread1 t1=new printthread1(ob);
		printthread2 t2=new printthread2(ob);
	t1.start();
	t2.start();

	}

}
