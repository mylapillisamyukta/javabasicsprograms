package oopsassessment;

public class rectangleassessment {
	int width;
	int height;
	rectangleassessment(int width,int height)
	{
		this.width=width;
		this.height=height;
	}
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	public int getArea() {
	    return width * height;
	  }
	  public int getPerimeter() {
	    return 2 * (width + height);
	  }

	public static void main(String[] args) {
		rectangleassessment rectangle=new rectangleassessment(5,7);	
		System.out.println("The area of the rectangle is " + rectangle.getArea());
	    System.out.println("The perimeter of the rectangle is " + rectangle.getPerimeter());


	}

}
