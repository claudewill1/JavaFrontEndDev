package assignment2.controlstatementloops;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.math.*;
/* 1. (Game: lottery) to generate a lottery of a threedigit
number. The program prompts the user to enter a three-digit number and
determines whether the user wins according to the following rules:
1. If the user input matches the lottery number in the exact order, the award is
$10,000.
2. If all the digits in the user input match all the digits in the lottery number, the
award is $3,000.
3. If one digit in the user input matches a digit in the lottery number, the award is
$1,000. */
public class ControlStatements_Loops {
	static int lotteryNum;
	static ArrayList lotteryNumberList = new ArrayList();
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	Random random = new Random();
	//array to hold individual digits of guess
	String[] guessedNum = {};
	
	int[] lotteryNumArr = {};
	// convert array to array list
	
	// to hold whether or not a digit from the guessed number exists in the lottery number
	// create an array to hold the digits from the string passed in as a guess
    int[] guessNum = new int[guessedNum.length];
		
    // holds list of guessed lottery numbers
	ArrayList guessNumList = new ArrayList();
	// holds true or false to determine if the lottery number contains at least 1 digit from the users number
	boolean exists = false;
	
	for(int i = 1; i <= 3; i++) {
		lotteryNum = random.nextInt(10);
		lotteryNumberList.add(lotteryNum);
		
	}
	
	// combine lotteryNumList into single integer for later comparison
	
	System.out.print("Enter a 3 digit lottery number: ");
	
	String numGuess = in.next();
	while(numGuess.length() != 3) {
		System.out.print("You must only enter a 3 digit number, try again: ");
	} 
	
	guessedNum = numGuess.split("");
	for(int i = 0; i < guessedNum.length; i++) {
		guessNumList.add(Integer.parseInt(guessedNum[i]));
	}
	// determine if guessNums arraylist contains a digit from the lotteryNumberList
	for(int i = 0; i < guessNumList.size(); i++) {
		if(lotteryNumberList.contains(i)) exists = true;
	}
	int lotteryNumSum = sum(lotteryNumberList);
	int guessSum = sum(guessNumList);
    // compared sums of both numbers to determine if they contain the same digits
	if(lotteryNumSum == guessSum) {
		System.out.println("You win $3,000!");
	} 
	// see if the lotteryNumberList is equal to the guessNumList, if true they win $10,000
	else if(lotteryNumberList == guessNumList) {
		System.out.println("You win $10,000!");
	}
	// if contains atleast 1 digit from users number they win 1000$
	else if(contains(guessNumList)) {
		System.out.println("You win $1,000!");
	}
	// user didn't win anything
	else
	{
		System.out.println("Sorry, none of your numbers matched");
		System.out.println("The winning number is: "+lotteryNumberList);
	}
	
	
	
	
}
// Sum method to sum the generated lottery number and guessed number for comparing if all numbers are the same but in a different order
static int sum(List<Integer> list) {
	if(list == null || list.size()<1) return 0;
	
	int sum = 0;
	for(Integer i: list) sum = sum+i;
	
	return sum;
}
// check if arraylist contains element from another list
static boolean contains(List<Integer> list) {
	if(list == null || list.size() < 1) return false;
	boolean exists = false;
	for(Integer i: list) {
		if(lotteryNumberList.contains(i)) {
			exists = true;
		}
		
	}
	return exists;
}
}
