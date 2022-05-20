package week1.day1.assignments;

public class Factorial 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
      int range = 5;
      int factorial = 1;
      //for loop to compute factorial
      for (int i =1; i<=range; i++)
      {
    	  factorial = factorial*i;
      }	  
      //Print the factorial value
      System.out.println("Factorial:" +factorial);    
	}
}
