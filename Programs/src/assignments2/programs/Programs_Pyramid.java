package assignments2.programs;
/*
 * write a java program to display the following series


    *
   * *
  * * *
 * * * *
* * * * *
 */
public class Programs_Pyramid {

public static void main(String[] args) {
	// k = number of spaces 
	int k = 2*5-2, i, j;
	// outer loop to handle number of rows
	for(i = 0; i < 5; i++) {
		// inner loop to handle number spaces
		// values changing acc. to requirement
		for(j = 0; j < k; j++)
		{
			// print spaces
			System.out.print(" ");
		}
		// decrement k after each iteration
		k -= 1;
		
		// inner loop to handle number of columns
		for(j = 0; j <= i; j++)
		{
			// print stars
			System.out.print("* ");
		}
		// end line after each row
		System.out.println();
	}
}
}
