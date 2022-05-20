package week1.day1.assignments;

public class TwoWheeler {
   int noOfWheels = 2;
   short noOfMirrors = 2;
   long chasisNumber = 1234567890;
   boolean isPunctured = false;// default false
   String bikeName = "HONDASHINE";
   double runningKM = 1234.123;
   
   public static void main(String[] args) {
	
	   TwoWheeler bike = new TwoWheeler();
	   
	   System.out.println("Name: " +bike.bikeName);
	   System.out.println("No of Wheels: " +bike.noOfWheels);
	   System.out.println("No of Mirrors: " +bike.noOfMirrors);
	   System.out.println("chasisNumber: " +bike.chasisNumber);
	   System.out.println("ispunctured?: " +bike.isPunctured);
	   System.out.println("RunningKm :" +bike.runningKM);		   
}                              
 		   
}
