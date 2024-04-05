package collections;
import java.util.*;
class Book
{
		public int getBid() {
			return bid;
		}
		public void setBid(int bid) {
			this.bid = bid;
		}
		public String getBname() {
			return bname;
		}
		public void setBname(String bname) {
			this.bname = bname;
		}
		public Book(int bid, String bname) {
			super();
			this.bid = bid;
			this.bname = bname;
		}
		int bid;
		String bname;

	}
	public class Bookexample {
		public static void main(String[] args) {
			LinkedList<Book> ob = new LinkedList<Book>();
			Scanner sc = new Scanner(System.in);
			System.out.println("enter bookname to remove");
			String bname = sc.next();
			Book b1 = new Book(1,"geeta");
			Book b2 = new Book(2,"mahabharat");
			Book b3 = new Book(3,"bhagwat");
			ob.add(b1);
			ob.add(b2);
			ob.add(b3);
			/*for(Book b : ob)
			{
				System.out.println(b.getBid()+ " "+ b.getBname());
			}  here we get hashcode*/
			for(int i =0; i<ob.size();i++)
			{
				System.out.println(ob.get(i).getBid() + " " + ob.get(i).getBname());
			}
		    Book x = null;
		    boolean r = false;
		    for(int i = 0;i<ob.size();i++)
			{
		    	if(bname.equals(ob.get(i).getBname()))
		    	{
		    		x = ob.get(i);
		    		r = true;
		    		ob.remove(x);
		    	}
		    	
			}

		System.out.println("updated value");	

		for(int i = 0;i<ob.size();i++)
		{
		   System.out.println(ob.get(i).getBid() + ""+ob.get(i).getBname());
		}

		}

	}
	