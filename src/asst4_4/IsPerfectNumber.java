/*Write a program to find the aliquot sum of a given number.  
 *  Print all perfect numbers between 1 to 100.  
 * */

package asst4_4;

//Importing all classes from java's util library
import java.util.*;       

public class IsPerfectNumber  
{
	public static void main(String[] args)   
	{
		
	   // Finding Aliquot sum of a given number & check if the number is a perfect number or not
		
		int inputNumber;       //int variable to store the number input by user.
		int aliquotSum=0;      //int variable to count aliquot sum of inputNumber,initialized to zero.
		
		// Asking value of inputNumber from the user.
		System.out.println("Please Enter the number to find the Aliquot sum :::");
		
        // For taking input from the user, we have to make the object of Scanner class.
      	//And we have to pass System.in stream in the constructor of that object to read input from keyboard.
		Scanner sc=new Scanner(System.in);       //creating object of Scanner class.
		
		inputNumber=sc.nextInt();           //Initializing inputNumber variable by the value input by user.
		
		for(int i = 1 ; i < inputNumber/2 + 1 ; i++)    //for loop to count aliquot sum.
		{
			if(inputNumber % i == 0)         //Conditional statement to check whether inputNumber is divisible by number or not.
			{
				aliquotSum+=i;        
			}
		}
		
		if(aliquotSum == inputNumber)
		       System.out.println("The AliquotSum of number " + inputNumber + " is " + aliquotSum+" and it is a perfect number");
		else 
			System.out.println("The AliquotSum of number " +inputNumber +" is " + aliquotSum+" and its not a perfect number");
		
		
		//Print all perfect numbers between 1 to 100.
		
		System.out.println("\nThe perfect numbers between 1 and 100 are :");
		for(int i = 2 ; i < 100 ; i++)        //Outer for loop to iterate through 1 to 100.
		{
			int countingAliquot=0;        //int variable to count the Aliquot sum of numbers.
			
			for(int j=1 ; j <= i/2 + 1 ; j++)      //Inner for loop to calculate the Aliquot Sum of i'th number of outer loop.
			{
				if(i % j == 0)
					countingAliquot += j;         //Adding divisor to count Aliquot sum of number.
			}
			
			if(countingAliquot == i)        //Conditional loop to check weather the number is perfect or not.
				System.out.println(i);
		}
		
		sc.close();           //Closing the object of Scanner class.
	}   //End of main method.    
}    //End of class.
