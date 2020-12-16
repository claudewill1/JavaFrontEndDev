package day5_assignment_1;
/*
 * 
Given an unsorted array of size n. Array elements are in the range from 1 to n. One number from set {1, 2, …n} is missing and one number occurs 
twice in the array. Find these two numbers.
Examples: 
Input: arr[] = 
Output: Missing = 2, Repeating = 3
Explanation: In the array, 
2 is missing and 3 occurs twice 

Input: arr[] = {4, 3, 6, 2, 1, 1}
Output: Missing = 5, Repeating = 1

 */
public class FindMissingRepeating {
	static void printMissingRepeatingElements(int arr[], int size) {
		int i, repeating = 0, missing = 0;
		
		// repeating element
		System.out.print("Repeating: ");
		for(i = 0; i < size; i++) {
			int absVal = Math.abs(arr[i]);
			if(arr[absVal - 1] > 0) {
				arr[absVal - 1] = -arr[absVal - 1];
			} else
			{
				repeating = absVal;
			}
		}
		
		// find missing element
		System.out.print("Missing: ");
		for (i = 0; i < size; i++) {
			if (arr[i] > 0) {
				missing = (i + 1);
			}
	    }
		
		System.out.println("Missing: "+missing+", Repeating: "+repeating);
		
		
		
	}
	public static void main(String[] args) {
		int[] arr = {1,2,2,3,4,5,7,8};
		int size = arr.length;
		
		printMissingRepeatingElements(arr,size);
	}
}
