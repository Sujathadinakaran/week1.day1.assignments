package week1.day1.assignments;

public class Car 
{
    //apply Brake Method
	public void applyBrake()
	{
		System.out.println ("Apply Brake");
	}
	//apply Gear Method
	public void applyGear()
	{
	   System.out.println("Apply Gear");
	}
	//switch on AC Method
	public void switchonAc()
	{
		System.out.println("Switch on AC");
	}
	//apply Accelerate Method
	public void applyAccelerate()
	{
		System.out.println("Apply Accelerate");	
	}
	
	public static void main(String[] args) 
	{
		//create object MyCar for class Car
		Car MyCar = new Car();
		MyCar.applyBrake();
		MyCar.applyGear();
		MyCar.switchonAc();
		MyCar.applyAccelerate();
	}
}
