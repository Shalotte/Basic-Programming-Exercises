package iterationExercises;

public class Program {
	
	
//Find largest number from an array of numbers
	public int _findlargestNumberInArray(int[] lagst_num){
		
		int temp;
		
	    for(int i =0; i<lagst_num.length; i++){
	    for(int j=i+1; j<lagst_num.length;j++){
	    if(lagst_num[i]>lagst_num[j]){
	    	temp = lagst_num[i];
	    	lagst_num[i] = lagst_num[j];
	    	lagst_num[j] =temp;
	    }
	    }
	    }
		return lagst_num[lagst_num.length-1];
	}
	
//Find second largest number from an array of numbers
	public int _findSecondLargestNumberInArray(int[] x){
		
		int largest = x[0]; 
		int second_lgst = x[0];
		
		for(int i=0; i<x.length; i++){
		if(x[i]>largest){
		second_lgst=largest; 
		largest=x[i];
		}
		
		else if(x[i]>second_lgst && x[i] !=largest){
		second_lgst = x[i];
		}}
		return second_lgst;
	}
	
//Find if a number is present in an array of numbers
	 public boolean contains(int[] x, int n) {
	  for (int y : x) {
	         if (n == y) {
	            return true;
	         }
	      }
	      return false;
	   }
	
//Find number of occurrences of a number in an array of numbers
	public int _findNumberOfOccurrencesOfANumber(int[] x, int n) {
		
		int count = 0;
		for(int i=0; i< x.length; i++) {
			if(x[i]==n) {
				count++;
		}
		}
		return count;
	 }
	
//Find the number in an array of numbers with maximum occurrences
	public int _numbersWithMaximumOccurrences(int[] x) {
		
	int count= 0, tempCount;
	int freq= x[0];
	int temp = 0;
	
	for(int i= 0; i< x.length; i++) {
	
	temp = x[i];
	tempCount= 0;
	
	for(int j= i+1; j <x.length; j++) {
	
	if(temp == x[j]) {
	tempCount ++;
	}
	}
	if(tempCount> count) {
	freq = temp;
	count = tempCount;
	}
	}
	return freq;
}
	
//Find number of spaces in a sentence
	public int _findNumberOfSpacesInASentence (String str) {
		
		
		int count = 0;
		
		for(int i=0;i< str.length(); i++) {
		if( str.charAt(i) ==' ') {
		count++;	
		}	
		}
		return count;
	}

//Find number of words in a sentence
     public int _numberOfWordsInASentence(String str) {
		 
		 int count= 0;
		 for(int i=0; i< str.length(); i++) {
		 if (str.charAt(i)==' ') {
			 count ++;
		 }
		 }
		 return count+1;	 
    }

//Replace all spaces in a sentence with underscore

   public String _replaceAllSpacesWithUnderscore (String str) {
 	
     char[] str2 = str.toCharArray();
 	for(int i =0; i< str.length(); i++) {
 	if(str2[i]==' ') {
 	str2[i] ='_';
 	}
 	}
 	return new String(str2);
    }
 
//Sort an array of numbers in ascending order
	public int[] sortAnArray (int[] x) {
		
	int temp;
	for(int i=0; i<x.length; i++) {
	for(int j=i+1; j<x.length; j++) {
	if(x[i]>x[j]) {
	
   temp=x[i];
   x[i]=x[j];
   temp=x[j];
   
	}
	}
	}
	return x;
    }
	
//Find all even numbers from an array of numbers
	public int[] _findEvenNumbersFromArray(int[] x) {
		
	int count =0;
	
	for(int i= 0; i< x.length; i++) {
	if(x[i]%2==0) {
		count ++;
	}
	}

	int[] y = new int[count];
	count=0;
	
	for(int i=0; i< x.length; i++) {
	if(x[i]%2==0) {
		y[count] = x[i];
		count++;
	}
	}
	return y;
    }
	
//Generate fibonacci series from 1 to N
	 public int[] fib(int n) 
	 { 
	    
	
	  int[] x = new int[n];
	  
	  for(int i=2; i<n; i++){
	  x[0]=1;
	  x[1]=1;
	  x[i]=x[i-1] + x[i-2]; 
	  }
	  
	  return x;
      }
	
//Reverse a string
	public String reverseAString(String str) {
		
	char[] str1 = str.toCharArray(); 
	int begin=0;
	int end =str1.length-1;
	char temp;
	
	while(end>begin) {
		
	temp= str1[begin];
	str1[begin] = str1[end];
	str1[end]= temp;
	
	end --;
	begin ++;
	}
	return new String(str1);
    }
	
//Convert numeric string value to number like "1234" -> 1234
	 public int _stringToNumber(String str) {
		  
     int i= 0, n=0, sign=1;
		  
	 if(str.charAt(0) == '-') {
	 i =1;
	 sign= -1;
	 }
		  
	 for(; i< str.length(); i++) {
	 n*=10;
	 n+= str.charAt(i)-48;
	 }
		  
	 return sign*n;
				
	 }
	 
//Find the maximum difference between two consecutive items in an array of numbers
	 public int _maximumDifferenceBetweenTwoconsecutiveItems(int[] x) {
			
	 if(x.length <2) {
	 return 0;
	 }
			
	 int max= x[1]-x[0];
			
	 for(int i=0; i< x.length-1; i++) {
	 if(max < x[i+1] - x[i])
	 {
	 max = x[i+1] - x[i];
	 }
	 }

	 return max;
	 }
	 
//Count number of digits in a number
	 public int _countNumberOfDigitsInANumber(int x) {
	    	
     int count =0;
		    
	 while (x!= 0) {
		    
	 x/= 10;
	 count++;
	 }
	 return count;
	 }
	 
//Calculate sum of digits in a number
	 
	 public int SumOfDigitsInNumber(int m) {
	 
	 int sum= 0;
	 int n;
		 
	 while(m > 0)
	 
	 {
	 n = m % 10;
	 sum = sum + n;
	 m = m / 10;
	 }
	 return sum; 
	 }
	 
	 
//Find sum of all odd numbers between 1 to N
	 public int SumOddNums(int n) {
			
	 int sum= 0;
	 for(int i=0; i< n; i++) {
	 if(i%2!= 0) {
	 sum = sum + i;
	 }
	 }	
	 return sum;
	 }
	 
//Swap first & last digit of a number
	 public int _swapFirstLastDigitNumber(int x) {

	 String s = Integer.toString(x);
	 char[] ch = s.toCharArray();
		    
			
	 for(int i =0; i< ch.length; i++) {
				
	 int k = i;
		    
	 while( i< ch.length) {
     i ++;	
	 }
		    
	 char temp = ch[k]; 
	 ch[k] = ch[i - 1]; 
	 ch[i - 1] = temp;
	 }
			
     String num = new String(ch);	
	 int swapped_number = Integer.parseInt(num);
	 return swapped_number;
			
	 }

//Check if an alphabet is vowel or consonant
	public String _checkIfAnAlphabetIsVowelOrConsonant(char x) {
			
	if( x == 'a' || x == 'A' || x == 'e' || x == 'E' ||
	x == 'i' ||x == 'I' ||x == 'o' ||x == 'O' ||x == 'u' ||x == 'U') 
	{
	return "This is a vowel.";
	} 
	else 
	{
	return "This is a consonant.";
	}
	}
	
//Reverse a number
	public int _reverseANumber(int x) {
		
	String s = Integer.toString(x);
	char[] str1 = s.toCharArray();

	int begin=0;
	int end =str1.length-1;
	char temp;
	
	while(end>begin) {
		
	temp= str1[begin];
	str1[begin] = str1[end];
	str1[end]= temp;
	
	end --;
	begin ++;
	}
	
	String num = new String(str1);	
	int swapped_number = Integer.parseInt(num);
	return swapped_number;
		
}
	 
}
