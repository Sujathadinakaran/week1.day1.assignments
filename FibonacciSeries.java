package week1.day1.assignments;

public class FibonacciSeries 
{
public static void main(String[] args) 
{//range of fibonacci series
	int range = 8;
	
	//Initialize variables
	int f1 = 0;
	int f2 = 1;
	
	//initialize the sum
	int sum=f1+f2;
	
	//Print first and second numbers
	System.out.println(f1+",");
	System.out.println(f2+",");
	
	//for loop to generate the series
	for (int i = 1;i<=range;i++)
	{
		//when within the range, print ending with comma
		if (i!=range)
			System.out.println(sum+",");
		else
			System.out.println(sum);
		
		//compute the next Fibonacci numbers
		f1=f2;
		f2=sum;
		sum=f1+f2;	
		}
	}
}
