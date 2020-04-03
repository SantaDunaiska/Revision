import java.util.Scanner;

public class PalidromeApp {
	/**
	 A palindrome is a string that reads the same forwards and backwards. For
	 example, noon and madam are spelled the same forward and backward.
	 Develop an application which reads in a string and determines whether it is
	 a palindrome. If the input string is a palindrome, your application should
	 display the message:
	 The string is a palindrome.
	 Otherwise, it should print out the message:
	 The string is not a palindrome.
	 PalindromeApp is an application which does the following tasks
	 -- prompts the user to input a text
	 -- uses the instantiable class Palindrome to compute whether the user's input is a palindrome or not
	 -- retrieves the result of the palindrome check and displays it
	 */
public static void main(String[] args) {
	//local variables, users input
String t;
//palindrome message
String message;

Scanner sc = new Scanner(System.in);
System.out.println("Please enter a text : ");
t  = sc.nextLine();

//instance obj of palindrome
Palindrome palindrome = new Palindrome();
//need to use the setter method to store the users input 
palindrome.setText(t);
palindrome.decidePalindrome();

	message = palindrome.getPalindromeMessage();
	
			System.out.println(message);
	}






}
