import java.util.Arrays;
import java.util.Scanner;

public class Numbers {
	
	//Method created for next largest element.
	public static int nextLargest (int arr[],int elem) {

		//Creating the variable and accounting for a max value.
		int nextLargestElem = Integer.MAX_VALUE;

		for (int x=0; x < arr.length; x++) {

			//Loop for moving through the array.
			if (arr[x] > elem) {
				nextLargestElem = arr[x];
				
				//Finding the element and stopping.
				break;
			}
		}
		return nextLargestElem;
}

	public static void main (String[] args) {
		
		//Bringing in the scanner for user input.
		Scanner scn = new Scanner (System.in);

		//Declaring integers for arrays and size.
		int arrSize, arr[], arrSort[];

		System.out.println ("Enter the array size you wish to test: ");
		
		arrSize = scn.nextInt();
		arr = new int[arrSize];
		arrSort = new int[arrSize];

		System.out.println ("Please enter the elements of said array: ");

		//Loop for reading information for arrays.
		for (int x=0; x < arrSize; x++) {
			arr[x] = scn.nextInt();
			arrSort[x] = arr[x];

}
		
		//Storage of the sorting.
		Arrays.sort(arrSort);
		System.out.println ("Here's your information: ");

		for (int x=0; x < arrSize; x++) {
			int nextLargestElem = nextLargest(arrSort, arr[x]);

		if (nextLargestElem != -1) {
			System.out.println (arr[x]+": "+nextLargestElem);
			}
		
		else {

			System.out.println (arr[x]);
			}
		
		}
	}
}