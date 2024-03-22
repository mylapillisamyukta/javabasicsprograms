package classprogram;

public class rotationofarraytest {
	public static void main(String[] args)
	{
	 int [] numbers = new int [] {1,2,3,4,5};
	 int n =1;
	 System.out.println("Given array is: ");
	for (int i = 0; i < numbers.length; i++) {
    System.out.print(numbers[i] + " ");
 }
	 for(int i = 0; i < n; i++){
	 int j, firstElement;
	firstElement = numbers[0];
	for(j = 0; j < numbers.length-1; j++){
    numbers[j] = numbers[j+1];
   }
    numbers[j] = firstElement;
			    }
   System.out.println();
  System.out.println("Array after "+n+" left rotations: ");
  for(int i = 0; i< numbers.length; i++){
  System.out.print(numbers[i] + " ");
	}
	}

}
