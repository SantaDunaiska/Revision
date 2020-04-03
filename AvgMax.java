/**
 Develop an application that accepts 5 integers from the user and stores them in an array.
 The application should then calculate and output the average number in the array.
 Save the class as AverageApp.java
*/
public class AvgMax{
	// declare instance variables
	
	private int numbers[];
	private double average;
	private int max;
	
	//defult constructor
	public AvgMax() {
	//numbers[]c= null
		//avarage=0.0
		//max= - 0
			
}


//declare seter method
	public void setNumbers1(int numbers[]) {
		this.numbers = numbers;
}
	 	
	//............Starts the Maximum
	 	public int computeMax() {
	 		
	 		for(int i = 0; i<numbers.length; i++) {
	 			//if the current element [] is located at i and is > than the val.stored in the max
	 			//need to update the max with the current element
	 		if(numbers[i]>max) {
	 			//update the max with current higher value
	 			max = numbers[i];
	 			
	 	}
	 	}
	 		return max;
	 	}
	 		public int getMax() {
	 		return max;
	 		
	 		}


			public void calculateAverage() {
				// TODO Auto-generated method stub
				
			}
}

	 	//getter method to retrieve the max
	 	
	 		
	 	
	

