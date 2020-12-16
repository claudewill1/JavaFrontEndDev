package day5_assignment_collections;

import java.util.*;
/*
 * 3.	Write a program that reads words from keyboard and displays all the non-duplicate words in ascending order. 
 */
public class Step3 {
	static void displayNonDuplicateWords() {
		String word = "";
		// arraylist to hold words
		List<String> wordList = new ArrayList<String>();
		// arraylist of non-duplicate words
		List<String> nonDupWordList = new ArrayList<String>();
		// scanner
		Scanner sc = new Scanner(System.in);
		// have user enter words, and prompt them to enter ' . ' to end
		//
		System.out.println("Enter a word");
		word = sc.nextLine();
		// as user to continually enter words while input is not null
		while(word.length() != 0) {
			System.out.print("Enter a word. Press enter with no value to end: ");
			word = sc.nextLine();
			wordList.add(word);
			
		} 
		for(String s: wordList) {
			// use if statement with Collections.frequency method to check for words that only appear once
			// if they only appear once, add to the nonDupWordList
			if(Collections.frequency(wordList, s) == 1) {
				nonDupWordList.add(s);
			}
		}
		// print list of all non duplicate words
		System.out.println("Here are the Non-Duplicate words: "+nonDupWordList);
		
	}
	public static void main(String[] args) {
		// call displayNonDuplicateWords() method to take text input from user
		// and display all non-duplicate words
		displayNonDuplicateWords();
	}
}
