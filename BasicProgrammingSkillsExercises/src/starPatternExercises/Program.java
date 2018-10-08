package starPatternExercises;

public class Program {
	
//Square Star Pattern
	public void _squareStarPattern(int n) {

	for(int i =1; i<= n; i++) {
	for(int j=1; j<=n; j++) {
	System.out.print("*");
	}
	System.out.println(" ");
	}	
		
		
    }

//Hollow Square Star Pattern
	public void _hollowSquareStarPattern(int n) {
		
	for(int i =1; i <= n; i++) {
	for(int j=1; j<=n; j++) {
	if( i==1 || i ==n || j==1 || j ==n) {
	System.out.print("*");
	}
	else
	{
	System.out.print(" ");	
	}
	}
	System.out.print("\n");
	}
	}
	
//Hollow Square Star Pattern with Diagonal
	public void _hollowSquareStarPatternDiagonal( int n) {
		
	for(int i =1; i <= n; i++) {
	for(int j=1; j<=n; j++) {
		
	if(i==1 || i ==n || j==1 || j ==n || i==j || i+j==n+1) {
	System.out.print("*");
	}
	else
	{
	System.out.print(" ");	
	}
	}
	System.out.print("\n");
	}
    }
	
//Rhombus Star Pattern
	public void _rhombusStarPattern(int n) {
		
		
	for(int i= 1; i<= n; i++) {
	for(int j =i; j<n; j++) {
	System.out.print(" ");
	}
	for(int j =1; j<=n; j++) {
	System.out.print("*");
	}
	System.out.print("\n");
	}		
	}
	
//Hollow Rhombus Star Pattern
	public void _hollowRhombusStarPattern(int n) {
		
	for(int i=1; i<= n; i++) {
		
	for(int j=i; j<n; j++) {
	System.out.print(" ");
	}	
	
	for(int j =1; j<= n; j++) {
	if(i == n || i==1 || j==n || j==1) 
	{
	System.out.print("*");
	}
	else 
	{
	System.out.print(" ");	
	}
	
	}
	
	System.out.print("\n");
	}
	} 
	
//Mirrored Rhombus Star Pattern
	public void _mirroredRhombusStarPattern(int n) {
	
	for (int i = 1; i <= n; i++)
	{  
	for (int j = 1; j < i; j++) {
	System.out.print(" ");
	}

	for (int j = 1; j <= n; j++) {
	System.out.print("*");
	}

	System.out.print("\n");
	}
    }
	
//Hollow Mirrored Rhombus Star Pattern
	public void  _hollowMirroredRhombusStarPattern(int n) {

	for (int i = 1; i <= n; i++)
	{
	            
	for (int j = 1; j < i; j++) {
	System.out.print(' ');
	}

	for (int j = 1; j <= n; j++)
	{
	             
	if (i == 1 || i == n || j == 1 || j == n) {
	System.out.print('*');
	}
	else {
	System.out.print(' ');
	}
	}

	System.out.print("\n");
	}
    } 

//Right Triangle Star Pattern
	public void _rightTriangleStarPattern(int n) {
		
    for(int i = 1; i <= n; i++) {
	for(int j = 1; j <= i; ++j) {
	System.out.print("*");
	}
	System.out.print("\n");
	}		
    }
	
//Hollow Right Triangle Star Pattern
	public void _hollowRightAnglePattern (int n) {
		
	for ( int i=1 ; i<=n ; i++ ) {
    for ( int j=1 ; j <= i ; j++ ) {
    if(i==n || j==1 | j==i)
    System.out.print("*");
    else 
    System.out.print(" ");
    }
    System.out.println();
    }
	}
	
//Mirrored Right Triangle Star Pattern
	public void _mirroredRightTriangleStarPattern(int n) {
		 
	for(int i=1;i<=n;i++)
	{
	for(int j=i;j<n;j++)
	{
	System.out.print(" ");
	}
	for(int j=1;j<=i;j++)
	{
	System.out.print("*");
	}
	System.out.println("");
	} 	
	}
	
//Hollow Mirrored Right Triangle Star Pattern
public void _hollowMirroredRightTriangleStarPattern(int n) {
		
		
    for (int i = 1; i <= n; i++)
    {
    for (int j = i; j <n; j++) {
    System.out.print(" ");
    }
    for (int j = 1; j <= i; j++)
    {
    if (i == n || j == 1 || j == i) {
    System.out.print("*");
    }
    else {
    System.out.print(" ");
    }
    }
    System.out.print("\n");
    }	
    }

//Inverted Right Triangle Star Pattern
public void _invertedRightTriangleStarPattern(int n) {
	
	for (int i = n; i >= 1; i--)
    {
    for (int j = 1; j <= i; j++) {
    System.out.print("*");
    }
    System.out.print("\n");
    }	
    }

//Hollow Inverted Right Triangle Star Pattern
public void _hollowInvertedRightTriangleStarPattern(int n) {
	
	for (int i = n; i >= 1; i--)
    {
    for (int j = 1; j <= i; j++) {
    {
    if (i == n || j == 1 || j == i) {
    System.out.print("*");
    }
    else {
    System.out.print(" ");
    }
    }
    }
    
    System.out.print("\n");
    }	
    }

//Inverted Mirrored Right Triangle Star Pattern
public void _invertedMirroredRightTriangleStarPattern (int n) {
	
	
     for(int i=1;i<=n;i++)
     {
     for(int j=1;j<i;j++)
     {
     System.out.print(" ");
     } 
     for(int j=1;j<=n-i+1;j++)
     {
     System.out.print("*");
     }
     System.out.print("\n");
     }
     }

//Hollow Inverted Mirrored Right Triangle Star Pattern
public void hollowInvertedMirroredRightTriangleStarPattern(int n) {
	

    for (int i = 1; i <= n; i++)
    {
    for (int j = 1; j < i; j++) {
    System.out.print(" ");
    }

    for (int j= 1; j <= n+1-i; j++) {
    if (j == 1 || i==1 || j==n-i+1) {
    System.out.print("*");
    }
    else {
    System.out.print(" ");
    }
   
    }

    System.out.print("\n");
    
    }
    }

//Pyramid Star Pattern
public void _pyramidStarPattern(int n) 
{ 
	
for(int i=1; i<=n;i++) {
for(int j=i; j<n; j++) {
System.out.print(" ");	
}
for(int j=1;j<=i;j++) {
System.out.print("*");
}
for(int j=2;j<=i;j++) {
System.out.print("*");
}
System.out.println(); 
}

  
}

//Hollow Pyramid Star Pattern
public void _hollowPyramidStarPattern(int n) {
 
	    for(int i=1; i<=n;i++) {
		for(int j=i; j<n; j++) {
		System.out.print(" ");	
		}
		for(int j=1;j<=i;j++) {
		if(j==1|| i==n) {
		System.out.print("*");
		}
		else
		{
			System.out.print(" ");
			}
		}
		for(int j=2;j<=i;j++) {
		if(j==i|| i==n) {
		System.out.print("*");
		}
		else
		{
		System.out.print(" ");
		}
		}
		System.out.println(); 
		}
    
} 

//Inverted Pyramid Star Pattern

public void	_invertedPyramidStarPattern(int n){

  for(int i=1; i<=n;i++) {
  for(int j=1; j<i; j++) {
  System.out.print(" ");
  }
  for(int j=1; j<=n-i+1;j++) {
	  System.out.print("*");  
  }
  for(int j=2; j<=n+1-i;j++) {
	  System.out.print("*"); 
	  
  }
  System.out.println();
  }
  
}

//Hollow Inverted Pyramid Star Pattern
public void _hollowInvertedPyramidStarPattern(int n){
	
	 
	   for (int i = n; i >= 1; i--)
	   {
	   for (int j = n; j > i; j--) {
	   System.out.print(" ");
	   }
	   for (int j = 1; j < 2*i; j++) {
	   if (i == n || j == 1 || j== 2*i - 1) {
	   System.out.print("*");
	
	   }
	   else {
	   System.out.print(" ");
	
	   }
	   }
	   System.out.print("\n");
	   }
		  
   
   }

//Half Diamond Star Pattern
public void _halfDiamondStarPattern(int n){
		
   for(int i=1;i<=n;i++)
   {
   for(int j=1;j<=i;j++)
   {
   System.out.print("*");
   }
   System.out.println("");
   } 
   for(int i=n;i>=1;i--)
   {
   for(int j=1;j<i;j++)
   {
   System.out.print("*");
   }
   System.out.println("");
   }		
   }

//Mirrored Half Diamond Star Pattern
public void _mirroredHalfDiamondStarPattern(int n) {
	
   for(int i=1;i<=n;i++)
   {
   for(int j=i;j<n;j++)
   {
   System.out.print(" ");
   }
   for(int j=1;j<=i;j++)
   {
   System.out.print("*");
   }
   System.out.println("");
   } 
   for(int i=n;i>=1;i--)
   {
   for(int j=i;j<=n;j++)
   {
   System.out.print(" ");
   }
   for(int j=1;j<i;j++)
   {
   System.out.print("*");
   }
   System.out.println("");
   } 		
   }

}
