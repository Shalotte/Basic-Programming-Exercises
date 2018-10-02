package iterationExercises;

import java.util.Arrays;


public class ProgramTest {

public static void main(String[] args) {
		
	   Program program = new Program();
	
	   //Find largest number from an array of numbers
		int  j[] = {1,9, 20,7,90,58,96};
		System.out.println("1. The largest number amongst this array is"+" "+program._findlargestNumberInArray(j));
		
		//Find second largest number from an array of numbers
		int  k[] = {1,9, 20,7,90,58,96};
		System.out.println("\n"+"2. The second number amongst this array is"+" "+program._findSecondLargestNumberInArray(k));
		
		//Find if a number is present in an array of numbers
		int  z[] = {1,9, 20,7,90,58,96};
		System.out.println("\n"+"3. Number is present in an array of numbers? :"+" "+program.contains(z,9));
		
		//Find number of occurrences of a number in an array of numbers
		int  l[] = {1,90, 20,7,90,58,96};
		System.out.println("\n"+"4. Find number of occurrences of a n in an array of numbers"+" "+program._findNumberOfOccurrencesOfANumber(l, 90));
		
		//Find the number in an array of numbers with maximum occurrences
		int  m[] = {1,90, 20,7,90,58,96};
		System.out.println("\n"+"5. Number in an array of numbers with maximum occurrences is:"+" "+program._numbersWithMaximumOccurrences(m));
		
		//Find number of spaces in a sentence
		String str = "I love Java";
		System.out.print("\n"+"6. The number of spaces in a sentence is"+" "+program._findNumberOfSpacesInASentence(str)+"\n");
		
		//Find number of words in a sentence
		String str1 = "I love Java";
		System.out.println("\n"+"7. The number of words in a sentence"+" "+program._numberOfWordsInASentence(str1));
		
		//Replace all spaces in a sentence with underscore
		String str2 = "I love Java";
		System.out.println("\n"+"8. The spaces in a sentence with underscore produces:"+" "+program._replaceAllSpacesWithUnderscore(str2) );
		
		//Sort an array of numbers in ascending order
		int  n[] = {1,90, 20,7,90,58,96};
		System.out.println("\n"+"9. Sorting this array of numbers in ascending order gives:");
		System.out.println(Arrays.toString(program.sortAnArray(n)));
		
	    //Find all even numbers from an array of numbers
		int  o[] = {1,90, 20,7,90,58,96};
		System.out.println("\n"+"10. All even numbers from an array of numbers are: "+"\n");
		System.out.println(Arrays.toString(program._findEvenNumbersFromArray(o)));
		
		//Generate fibonacci series from 1 to N
		System.out.print("The fibonacci series is: ");
		System.out.print(Arrays.toString(program.fib(6)));
		System.out.print("\n");
		
		//Reverse a string
		String str3 = "I love Java";
		System.out.print("\n"+"12. The string in reverse is: "+program.reverseAString(str3)+"\n");
		
		//Convert numeric string value to number like "1234" -> 1234
		String str4 = "1234";
		System.out.println("\n"+"13. The converted numeric string value of \"1234\" is: "+program._stringToNumber(str4));
		
		//Find the maximum difference between two consecutive items in an array of numbers
		int   q[] = {1, 3, 6};
		System.out.print("\n"+"14. Find the maximum difference between two consecutive items in this array of numbers is:"+" "+program._maximumDifferenceBetweenTwoconsecutiveItems(q)+"\n");
		
		//Calculate sum of digits in a number
		System.out.println("\n"+"15. The sum of digits in this number is: "+program._countNumberOfDigitsInANumber(1230));
		
		//Calculate sum of digits in a number
		System.out.println("\n"+"16. Calculate sum of digits in a number: "+program.SumOfDigitsInNumber(1230));
		
		
		//Find sum of all odd numbers between 1 to N
		System.out.println("\n"+"17. The sum of all odd numbers between 1 to N is:"+" "+program.SumOddNums(100));
		
		//Swap first & last digit of a number
		System.out.println("\n"+"18. wapping the first & last digit of a number gives:"+" "+program._swapFirstLastDigitNumber(1234));
		
		//Check if an alphabet is vowel or consonant
		System.out.println("\n"+"19. Is the alphabet entered a vowel? "+" "+program._checkIfAnAlphabetIsVowelOrConsonant('p'));
		
		//Reverse a number
		System.out.println("\n"+"20. Reversed number is:"+" "+program._reverseANumber(1236));
		

}
}
