import java.util.Scanner;

/*uses the instantiable class smartnumber to 
 * determinate the property of a bymber
 * entered by the user
 */
	public class SmartNumberApp {
	public static void main(String[] args) {
		// declare a local variable to store user imput
		int n;
		
		//declare a boolean variable to store the propertyof a number
		
		boolean property;
		Scanner myScanner = new Scanner(System.in);
		System.out.println("Please enter an integer number: ");
		n = myScanner.nextInt();
		
		// create an object of type smart number
		
		SmartNumber number = new SmartNumber();
		property = number.isNumberEven(n);
		System.out.println("is " + n + "even?" + property);
		
	}
	

}
