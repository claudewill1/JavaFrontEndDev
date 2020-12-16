package day5_assignment_collections;
/*
 * 2.	Write a program that reads an unspecified number of 
 * integers and finds the one that has the most occurrences. The input ends when the input is 0. For example, 
 * if you entered 2 3 40 3 5 4 –3 3 3 2 0, the number 3 occurred most often. If not one but several numbers have 
 * the most occurrences, all of them should be reported. For example, since 9 and 3 appear twice in the list 9 30 3 9 3 2 4, 
 * both occurrences should be reported.
 */
import java.util.*;
public class Step2 {
	public static void getIntegerWithMostOccurances() {
		int mostOccurrences = 0, number, occurrences = 0;
		
		// create array list to hold numbers from input
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		// arraylist to hold number(s) with the most occurrences
		ArrayList<Integer> mostOccurring = new ArrayList<Integer>();
		// create scanner
		Scanner sc = new Scanner(System.in);
		// ask user to input a number
		/*
		 * get numeric input from user
		 * scan to number variable
		 * add number to numbers arraylist
		 */
		do
		{
			System.out.print("Enter a number: ");
			number = sc.nextInt();
			numbers.add(number);
		}/*while number is not equal to 0 repeat do block of do...while loop */ 
		while (number > 0 || number < 0);
		
		Collections.sort(numbers);
		 for (int i = 0; i < numbers.size(); i++) {
		     for (int j = i + 1 ; j < numbers.size(); j++) {
		          if (numbers.get(i).equals(numbers.get(j))) {
		             occurrences++;
		             // check if the amount of occurrences is greater
		             // than the current value of most occurrences of a number
		             if(occurrences > mostOccurrences) {
		            	 // if true add number to mostOccuring ArrayList
		      		  	 mostOccurring.add(numbers.get(i));
		      		 } else if (occurrences == mostOccurrences) {
		      			 // if another element is found that occurs the same amount of times as the 
		      			 // current number with the most occurrences add that number of ArrayList as well
		      		   	 mostOccurring.add(numbers.get(i));
		      		 }
		          }
		      }
		     
		 }
		
		System.out.print(mostOccurring);
		
		
	}
	public static void main(String[] args) {
		getIntegerWithMostOccurances();
	}
}
