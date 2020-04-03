
public class Avg {

private int numbers[];
private double average;
	
public Avg() {
		//numbers[]c= null
		//avarage=0.0
		//max= - 0
}	
	//declare seter method
			public void setNumbers(int numbers[]) {
			this.numbers = numbers;
}
	//processing method to compute the avg number from the []
			public void calculateAverage() {
			int sum; // to store the sum of all the elements
			int currentElement; //to store the current element from the [] = i
			
			sum = 0;
			for(int i = 0; i<numbers.length; i++) {
				//retrieve the element at index i 
			sum = sum + numbers[i];//update 
			
}
			//compute
			average = (double) sum/numbers.length;
			
			
}
		//getter
		 	public double getAverage(){
		 		return average;
		 		
		
}


			public void setNumbers1(int[] numbers) {
				
}


			public void calculateAverage1() {
				
}
	 			
}
	
	


