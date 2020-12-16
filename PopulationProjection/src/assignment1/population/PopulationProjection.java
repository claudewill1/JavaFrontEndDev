package assignment1.population;

/*
 * (Population projection) The U.S. Census Bureau projects population based on the
following assumptions:
¦ One birth every 7 seconds
¦ One death every 13 seconds
¦ One new immigrant every 45 seconds
Write a program to display the population for each of the next five years. Assume
the current population is 312,032,486 and one year has 365 days. Hint: In Java, if
two integers perform division, the result is an integer. The fraction part is truncated.
For example, 5 / 4 is 1 (not 1.25) and 10 / 4 is 2 (not 2.5).
 */
public class PopulationProjection {
public static void main(String[] args) {
	int time = 60 * 60 * 24 * 365; // calcuate seconds in year
	int births = time / 7; // calculate births per year
	int deaths = time / 13; // calculate deaths per year
	int immigrant = time / 45; // calcuate immigrants per year
	
	int currentPopulation = 321032486;
	int population = births + immigrant - deaths;
	
	for(int i = 1; i <= 5; i++) {
		currentPopulation = currentPopulation + population;
		System.out.println(i + " year population is : " + currentPopulation);
	}
}
}