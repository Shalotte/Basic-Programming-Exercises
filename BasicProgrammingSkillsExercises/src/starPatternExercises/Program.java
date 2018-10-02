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
	System.out.print(System.lineSeparator());
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
	
	System.out.print(System.lineSeparator());
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

	System.out.print(System.lineSeparator());
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

	System.out.print(System.lineSeparator());
	}
    } 

//Right Triangle Star Pattern
	public void _rightTriangleStarPattern(int n) {
		
    for(int i = 1; i <= n; i++) {
	for(int j = 1; j <= i; ++j) {
	System.out.print("* ");
	}
	System.out.print("\n");
	}		
    }
	
//Hollow Right Triangle Star Pattern
	public void _hollowRightAnglePattern (int n) {
		
	for ( int i=1 ; i<=n ; i++ ) {
    for ( int j=1 ; j <= i ; j++ ) {
    if(i==1 || i==2 || i==n || j==1 | j==i)
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
    for (int j = 1; j <= n - i; j++) {
    System.out.print(' ');
    }
    for (int k = 1; k <= i; k++)
    {
    if (i == n || k == 1 || k == i) {
    System.out.print('*');
    }
    else {
    System.out.print(' ');
    }
    }
    System.out.print(System.lineSeparator());
    }	
    }

//Inverted Right Triangle Star Pattern
public void _invertedRightTriangleStarPattern(int n) {
	
	for (int i = n; i >= 1; i--)
    {
    for (int j = 1; j <= i; j++) {
    System.out.print('*');
    }
    System.out.print(System.lineSeparator());
    }	
    }

//Hollow Inverted Right Triangle Star Pattern
public void _hollowInvertedRightTriangleStarPattern(int n) {
	
	for (int i = n; i >= 1; i--)
    {
    for (int j = 1; j <= i; j++) {
    {
    if (i == n || j == 1 || j == i) {
    System.out.print('*');
    }
    else {
    System.out.print(' ');
    }
    }
    }
    
    System.out.print(System.lineSeparator());
    }	
    }

//Inverted Mirrored Right Triangle Star Pattern
public void _invertedMirroredRightTriangleStarPattern (int n) {
	
	int k;
     for(int i=0;i<4;i++)
     {
     for(int j=0;j<i;j++)
     {
     System.out.print(" ");
     }
     for(k=0;k<4-i;k++)
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
    // Loop for printing space
    for (int j = 1; j < i; j++) {
    System.out.print(' ');
    }

    // Loop for printing '*'
    for (int k = i; k <= n; k++) {
    // Print '*' for boundaries
    if (i == 1 || k == i || k == n) {
    System.out.print('*');
    }
    else {
    System.out.print(' ');
    }
    }

    // Move to the next line
    System.out.print(System.lineSeparator());
    }
    }

//Pyramid Star Pattern
public void _pyramidStarPattern(int n) 
{ 
   // number of spaces 
   int k = 2*n - 2; 

   // outer loop to handle number of rows 
   //  n in this case 
   for (int i=0; i<n; i++) 
   { 

   // inner loop to handle number spaces 
   // values changing acc. to requirement 
   for (int j=0; j<k; j++) 
   { 
   // printing spaces 
   System.out.print(" "); 
   } 

   // decrementing k after each loop 
   k = k - 1; 

   //  inner loop to handle number of columns 
   //  values changing acc. to outer loop 
   for (int j=0; j<=i; j++ ) 
   { 
   // printing stars 
   System.out.print("* "); 
   } 

   // ending line after each row 
   System.out.println(); 
   } 
   }

//Hollow Pyramid Star Pattern
public void _hollowPyramidStarPattern(int n) {
 
    int i, j, k = 0; 
    for (i = 1; i <= n; i++) // row=6 
    { 
    // Print spaces 
    for (j = i; j < n; j++) { 
    System.out.print(" "); 
    } 
    // Print *
    while (k != (2 * i - 1)) { 
    if (k == 0 || k == 2 * i - 2) 
    System.out.print("*"); 
    else
    System.out.print(" "); 
    k++; 
    ; 
    } 
    k = 0; 
          
    // print next row 
    System.out.println();  
    } 
    // print last row 
    for (i = 0; i < 2 * n - 1; i++) { 
        System.out.print("*"); 
    } 
    } 

//Inverted Pyramid Star Pattern

public void	_invertedPyramidStarPattern(int n){

    for(int i=n;i>=1;i--)
    {
    for(int j=i;j<n;j++)
    {
        System.out.print(" ");
    }
    for( int j=1;j<=(2*i-1);j++)
    {
        System.out.print("*");
    }
    System.out.println("");}
    }

//Hollow Inverted Pyramid Star Pattern
public void _hollowInvertedPyramidStarPattern(int n){
	
   // Do for each row
   for (int i = n; i >= 1; i--)
   {
    // Print space
   for (int j = n; j > i; j--) {
   System.out.print(' ');
   }

   // Print '*'
   for (int k = 1; k < 2*i; k++) {
   // Print '*' for boundaries
   if (i == n || (k == 1 || k == 2*i - 1)) {
   System.out.print('*');
   }
   else {
   System.out.print(' ');
   }
   }
   // Move to the next line
   System.out.print(System.lineSeparator());
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
