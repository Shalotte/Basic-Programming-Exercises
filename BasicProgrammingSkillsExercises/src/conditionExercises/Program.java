package conditionExercises;

public class Program{
	
//Find largest number among 3 numbers
	public  int _largstNumberAmongThree(int x, int y, int z){
		
        if( x >= y && x >= z)
        { return x;}

        else if (y >= x && y >= z)
        { return y;}

        else
        {
        	return z;
        }
	
}
	
//Find second largest number among 3 numbers
	public  int _secondLargstNumberAmongThree(int a, int b, int c){
		
		if( a>b && c> a){
			return a;
		}
		if(b>a && c> b){
			return b;
		}
		else
		{return c;
		}
}

//Find largest number among 7 numbers
	public int _largestNumberAmongstSeven(int a, int b, int c, int d, int e, int f ,int g){

		if(a>=b && a>= c && a>=d && a>=e && a>=f && a>=g){
			return a;
		}
		if(b>=a && b>= c && b>=d && b>=e && b>=f && b>=g){
			return b;
		}
		if(c>=a && c>=b && c>=d && c>=e && c>=f && c>=g){
			return c;
		}
		if(d>=a && d>=b && d>=c && d>=e && d>=f && d>=g){
			return d;
		}
		if(e>=a && e>=b && e>=c && e>=d && e>=f && d>=g){
			return e;
		}
		if(f>=a && f>=b && f>=c && f>=d && f>=e && f>=g){
			return f;
		}
		else{
			return g;
		}
		
	}
	
//Print numbers from 1 to N, But if the number is multiple of 3 then print "FIZZ" and if 
//the number is multiple of 5 then print "BUZZ". But if the number is multiple of both 3
//and 5 then print only "FIZZBUZZ".
	public String _fizzBuzz(int f){
		
		 if (f % 3 == 0 && f % 5 == 0) {
		 return "FizzBuzz";
		 } else if (f % 3 == 0) {
		 return "Fizz";
		 } else if (f % 5 == 0) {
		 return "Buzz";
		 } else {
		 return String.valueOf(f);
		 }
		   	    
	}
	
//Check if a number is negative, positive or zero.
	public String _checkIfANumberIsPNZ(int g){
		
		if(g< 0){
		return "This is a negative number.";
		}
		if(g==0){
		return "This number is equal to zero.";
		} else
		{
		return "This number is positive.";
		}
		
	}
	
	
	
//Check if a number is even or odd
	public String _checkIfAumberEvenOrOdd(int h){
		
		if(h%2==0){
		return "This is an even number.";
		}
		else
		{
		return "This is an odd number";
		
		}
	}
	
//Check if a year is leap year or not
	public boolean _checkLeapYear(int year){
		 
    if (((year % 4 == 0) && (year % 100 !=0)) || (year % 400==0)){
    return true;
    }
    else
    {
	return false;
	}
	}


}
