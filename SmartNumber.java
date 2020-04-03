
public class SmartNumber {
/* smartNumber.java comutes propperty value of the number
 * 
 */
	
		//declarare a  constructor
	public SmartNumber() {	
System.out.println("Starting the app...");
System.out.println("Please enter an integer number: ");
	}

	//compute whether the number is even, retur true if the number is even
	public boolean isNumberEven(int number) {
		//declare a variab;e to store whether the number is even
		boolean isEven = false;
		int reminder = number % 2;
		if(reminder ==0) {
			isEven = true;
			
		}
		return isEven;
		
	}
	
}
