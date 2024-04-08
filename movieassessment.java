package collectionassessment;
import java.util.*;

class movie
{
	String moviename;
	String company;
	String genre;
	int budget;
movie(String moviename,String company,String genre,int budget)
	{
		super();
		this.moviename=moviename;
		this.company=company;
		this.genre=genre;
		this.budget=budget;
		}

	public String getMoviename() {
		return moviename;
	}
	public void setMoviename(String moviename) {
		this.moviename = moviename;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public int getBudget() {
		return budget;
	}
	public void setBudget(int budget) {
		this.budget = budget;
	}

}
public class movieassessment {
	 public static movie[] getmovieByGenre(movie[] movies, String searchGenre) {
			  int count = 0;
		        for (movie movie : movies) {
		            if (movie.getGenre().equalsIgnoreCase(searchGenre)) {
		                count++;
		            }
		        }
		        movie[] result = new movie[count];
		        int index = 0;
		        for (movie Movie : movies) {
		        	
		            if (Movie.getGenre().equalsIgnoreCase(searchGenre)) {
		                result[index++] = Movie;
		            }
		        }

		        return result;
		    }
	 public static void main(String[] args) {
		   Scanner sc = new Scanner(System.in);
	        movie[] movies = new movie[1];
	        for(int i = 0;i<1;i++){
	            movies[i] = new movie(sc.next(),sc.next(),sc.next(),sc.nextInt());
	            sc.nextLine();
	        }
	        String searchGenre = sc.nextLine();
	        sc.close();
	        movie[] result = getmovieByGenre(movies,searchGenre);
	        for(int i = 0;i < result.length;i++){
	            if(result[i].getBudget() > 80000000)
	                System.out.println("High Budget Movie");
	            else
	                System.out.println("Low Budget Movie");
	        }
	    }
	    
}


