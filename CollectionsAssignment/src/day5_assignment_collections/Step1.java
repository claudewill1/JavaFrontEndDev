package day5_assignment_collections;

import java.util.HashSet;
import java.util.Scanner;

/*
 * Write a program that promps the user to enter a text and displays the number of vowels and consonants in the file. use a set to store vowels
 */
public class Step1 {
	public static void countVowelsAndConsonants(String userInput) {
		// declare variables vowels and consonants to hold count
		int vowels = 0, consonants = 0;
		// declare hashset to hold vowels
		HashSet<Character> vowelSet = new HashSet<Character>();
		
		// userInput.length() to count number of
					// characters in string
		for(int i = 0; i < userInput.length(); i++) {
			char ch = userInput.toLowerCase().charAt(i);
			
			
			if((ch >= 'a' && ch <= 'z')) {
				if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
					vowelSet.add(ch);
					vowels++;
					
				}
				else
				{
					consonants++;
				}
			}
		}
		// print vowels from vowelSet
		System.out.println("Vowels in input: ");
		System.out.println(vowelSet);
		// print number of vowels and consonants
		System.out.println(vowels+" vowels"+'\n'+consonants+" consonants");
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a word: ");
		String userInput = sc.next();
		
		countVowelsAndConsonants(userInput);
	}
}
