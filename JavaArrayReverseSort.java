import java.util.*;
public class JavaArrayReverseSort 
{
	public static void main(String[] args) 
	{
		Integer[] arr = {8, 4, 3, 5, 6};
		Arrays.sort(arr, Collections.reverseOrder());
		System.out.println("Reverse order array:"+Arrays.toString(arr));
	}
}