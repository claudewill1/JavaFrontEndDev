package assignment2.positiveandnegatives;
import java.util.*;
/*2. (Count positive and negative numbers and compute the average of numbers) Write
a program that reads an unspecified number of integers, determines how many
positive and negative values have been read, and computes the total and average of
the input values (not counting zeros). Your program ends with the input 0. Display
the average as a floating-point number. Here is a sample run:
Enter an integer, the input ends if it is 0:1 2 -1 3 0
The number of positives is 3
The number of negatives is 1
The total is 5
The average is 1.25

or

Enter an integer, the input ends if it is 0:
No numbers are entered except 0
0 */
public class CountPositive_Negative {
	public static void main(String[] args) {
		Random r = new Random(6);
		Scanner scan = new Scanner(System.in);
		int number = -1;
		int positive = 0;
		int negative = 0;
		int count = 0;
		int total = 0;
		
		float avg = 0.00f;
		
		System.out.print("Enter an integer, the input ends if it is 0: ");
		while(number != 0) {
			// get the next digit from user
			number = scan.nextInt();
			// add the digit to the total
			total += number;
			count++;
			// if number is greater than or less than 0 move to check for positive/negative count
			if(number > 0 || number < 0) {
				if(number > 0) {
					positive++;
				}
				else
				{
					negative++;
				}
			}
		}
		// calculate average
		avg = ((float)total/count);
		// print number of positives and negatives and total and average to console
		System.out.print("The number of positives is: " + positive + '\n' + "The number of negatives is: " + negative + '\n' + "The total is: " + total + '\n' +
				"The average is: " + avg);	
	}
}
