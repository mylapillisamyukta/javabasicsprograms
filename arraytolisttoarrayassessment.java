package collectionassessment;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class arraytolisttoarrayassessment {

	public static void main(String[] args) {
		
		        // Convert array to list
		        int[] array = {1, 2, 3, 4, 5};
		        List<Integer> list = arrayToList(array);
		        System.out.println("Array to List: " + list);

		        // Convert list to array
		        List<Integer> myList = new ArrayList<>(Arrays.asList(6, 7, 8, 9, 10));
		        int[] newArray = listToArray(myList);
		        System.out.println("List to Array: " + Arrays.toString(newArray));
		    }

		    public static List<Integer> arrayToList(int[] array) {
		        List<Integer> list = new ArrayList<>();
		        for (int value : array) {
		            list.add(value);
		        }
		        return list;
		    }

		    public static int[] listToArray(List<Integer> list) {
		        int[] array = new int[list.size()];
		        for (int i = 0; i < list.size(); i++) {
		            array[i] = list.get(i);
		        }
		        return array;
		    }

}
