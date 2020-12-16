package assignments2.datatypesoperators;
import java.util.Scanner;
import java.lang.*;
/*1. Using only the programming techniques you learned in this lesson, write an application that calculates the squares and cubes of between two numbers and prints the resulting values in table format, as shown below. 
number square cube  [ dont use any java built in method]
enter two enters : 0  10

0               0             0 
1               1             1 
2               4             8 
.
.
.
10            100         1000 */

public class Datatypes_Operators {
	public static void main(String[] args) {
		int num, square, cube;
		
		System.out.println("Number\tSquare\tCube");
		
		for(num = 1; num <= 10; num++) {
			square = num * num;
			cube = num * square;
			
			System.out.println(num+"\t"+square+"\t"+cube);
		}
	}
	
	
	
}
