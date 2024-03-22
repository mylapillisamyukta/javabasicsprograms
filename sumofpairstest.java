package classprogram;

public class sumofpairstest {
static void Pairs(int arr[], int n, int sum)
{
	  for (int i = 0; i < n; i++)
	  for (int j = i + 1; j < n; j++)
	   if (arr[i] + arr[j] == sum)
 System.out.println(" (" + arr[i] + " ,"+ arr[j] + ") ");                                      
}
	    public static void main(String[] arg)
	    {
	        int arr[] = {1,2,3,4,5,6 };
	        int n = arr.length;
	        int sum = 6;
	        Pairs(arr, n, sum);
	    }

	}


