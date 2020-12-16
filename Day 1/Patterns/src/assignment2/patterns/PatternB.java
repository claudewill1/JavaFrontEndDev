package assignment2.patterns;
/*
 * 3.(Display four patterns using loops) Use nested loops that display the following
patterns in four separate programs:
Pattern A        Pattern B  Pattern C    Pattern D
1       	1 2 3 4 5 6       1 	1 2 3 4 5 6
1 2     	1 2 3 4 5       2 1   	  1 2 3 4 5
1 2 3   	1 2 3 4       3 2 1         1 2 3 4
1 2 3 4 	1 2 3       4 3 2 1           1 2 3
1 2 3 4 5 	1 2 	  5 4 3 2 1 	    	1 2
1 2 3 4 5 6 1   	6 5 4 3 2 1 	          1

 */
public class PatternB {
	public static void main(String[] args) {
		for (int i = 7-1; i >= 0; i--)
		{
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}
 