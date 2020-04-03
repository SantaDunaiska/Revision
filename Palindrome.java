
public class Palindrome {
	/**
	 A palindrome is a string that reads the same forwards and backwards. For
	 example, noon and madam are spelled the same forward and backward.
	 Develop an application which reads in a string and determines whether it is
	 a palindrome. If the input string is a palindrome, your application should
	 display the message:
	 The string is a palindrome.
	 Otherwise, it should print out the message:
	 The string is not a palindrome.
	 The application should make use of instantiable classes.
	 */
	//variables
	private String text;
	private String palindromeMessage;
	
	public Palindrome() {
		text = "";
		palindromeMessage = "";
	}
	//setter
public void setText(String text) {
	this.text = text;
}
//getter
public String getPalindromeMessage() {
	return palindromeMessage;
}
public void decidePalindrome() {
	StringBuffer sb = new StringBuffer();
	//the number of the char in the text
	int len = text.length();
	//traverse the text from the end to the begining
	for(int i = len-1; i>=0; i-- ) {
	//retrieve one char in each interaction of the loop 
	//return the char at a specific index
		char c = text.charAt(i);
		//addeach char to the string buffer
		sb.append(c);
	
}
//converst sb instance to a String instance and store in a local variable(dnt forget to creat one)
	//convert from a mutable representation back to an imutable
	//method is to String
	String reversedText = sb.toString();
	
	if(text.equalsIgnoreCase(reversedText)) {
		palindromeMessage = "The text " + text + " is a PALINDROME";
	}else {
		palindromeMessage = "The text " + " is not a PALINDROME ;( ";
	
}
}
}
