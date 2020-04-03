import java.util.Scanner;

/**
 Develop an application that accepts 5 integers from the user and stores them in an array.
 The application should then calculate and output the average number in the array.
 Save the class as AverageApp.java
*/
//runner

public class AvgApp{
	
private static Avg avg;

public static void main(String[] args) {
		//declare [] to store int element 
		int numbers[];
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int size = input.nextInt();//array size
		//te deklarē ievadīto array no system input izmēru no lietotāja
		numbers = new int[size];
		
		//input
		//Loop to input the interaction fro the [] to store the numbers]
		    for(int i = 0; i<size; i++) {
			System.out.println("Enter the value: " + (i+1));
			numbers[i] =input.nextInt();//the numbers
			
}	
		//process to acess avgMax and Avg
						
		AvgMax avgMax = new AvgMax();
		avg = new Avg();
		avgMax.setNumbers1(numbers);//setter to store the numbers provided by the user
		
		 avgMax.calculateAverage();
		 avgMax.computeMax();
		
		
		//output
		double a= avgMax.getMax();
		double b = avgMax.getMax();
/////////////////////////////////////////outprint	
System.out.println("Average is : " + a );
System.out.println("Max is : " + b );
			
}
}
	
	
