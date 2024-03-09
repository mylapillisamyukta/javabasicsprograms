package arrayassessment;
import java.util.Scanner;
import java.util.*;

public class greatervalue {
    public static void main(String[] args) {
    	 Scanner sc=new Scanner(System.in);
    	 
         int[] inputArray = {2,43,66,92,3,5,13,123,432,44,78};
         System.out.println("Given array: " + Arrays.toString(inputArray));

         int num= 100;
         System.out.println("Greater numbers present in the Array: ");
         greaterNumber(inputArray,num);
      }
 
      public static void greaterNumber(int[] arr,int n) {
         for(int i=0; i<arr.length; i++) {
            if(arr[i]>n) {
               System.out.println(arr[i]+" ");
            }
         }
    	}
}


