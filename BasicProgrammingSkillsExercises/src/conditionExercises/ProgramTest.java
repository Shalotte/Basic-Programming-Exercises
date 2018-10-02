package conditionExercises;

public class ProgramTest {
	
public static void main(String args[]) {
	
	Program program = new Program();
    //Find largest number among 3 numbers
	int a=100 ; int b=2; int c=3;
	System.out.println("1. The largest number amonsgt the three is"+" "+program._largstNumberAmongThree(a,b,c)+"\n");
	
	//Find second largest number among 3 numbers
	System.out.println("2. The second largest number is"+" "+program._secondLargstNumberAmongThree(1, 100, 20)+"\n");
	
	//Find largest number among 7 numbers
	System.out.println("3. The largest number amongst the seven is"+" "+program._largestNumberAmongstSeven(15,20,34,46,5,6,7)+"\n");
	
	//Print numbers from 1 to N, But if the number is multiple of 3 then print "FIZZ" and if the number is 
	//multiple of 5 then print "BUZZ". But if the number is multiple of both 3 and 5 then print only 
	//"FIZZBUZZ".
	System.out.println("4. The fizz-buzz solution when n is 100 is");
	for(int i=0; i<=100; i++){
	System.out.println(program._fizzBuzz(i));
	}
	System.out.println("\n");
	
	//Check if a number is negative, positive or zero.
	System.out.println("5."+program._checkIfANumberIsPNZ(0)+"\n");
	
	//Check if a number is even or odd
	System.out.println("6."+program._checkIfAumberEvenOrOdd(9)+"\n");
	
	//Check if a year is leap year or not
	System.out.println("7."+program._checkLeapYear(1900)+"\n");
		
}
}
