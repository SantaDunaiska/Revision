import java.util.Scanner;

public class AverageApp {
	/**
	 Develop an application that accepts 5 integers from the user and stores them in an array.
	 The application should then calculate and output the average number in the array.
	 Save the class as AverageApp.java
	*/

	public static void main(String[] args) {
		// declare an array [] 
		int numbers[] = new int [5];
		Scanner input = new Scanner(System.in);
		
//input,
//for loop to promt to user to input 5 numbers
// each interaction of the loop will store  the number provided by the user
for(int i = 0; i < 5; i++) {
	System.out.println("Enter number: ");
	numbers[i] = input.nextInt();
	
}

//process
//the calculation of the arrays avarage
double avg;
int sum = 0;
int counter = numbers.length;

//traverse the array to calculate the sum of all the numbers
for (int i = 0; i < numbers.length; i++) {
	sum = sum + numbers[i];// in each interaction add the current element that is stored in the []
	
}
//compute 
avg = (double) sum/counter;

//outprint
System.out.println("Avarge number is: " + avg);

//display the content of the array
for(int i = 0; i < numbers.length; i++) {
	
	System.out.println("Number at i " + (i +1) + " is " + numbers[i]);
}

	}

}
