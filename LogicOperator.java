import java.util.Scanner;

public class LogicOperator {

	public static void main(String[] args) {
	//== equal to  x==y
		//!= not equal  x!=y
		//> greater than  x>y
		//<less than x<y
		//>= greather than or equal ; <=less than or equal
		
	Scanner sc = new Scanner(System.in);
	System.out.println("Please enter your age: ");
	int age = sc.nextInt();
	
	if(age >= 10 && age <= 15)
		 System.out.println("Its a teens age!!!");
	else if (age >= 16 && age <=18);
		
	 if(age == 20) 
		System.out.println("Its a grownups age!!!"); 
	
	
	
		// system outprint neko nerāda, jo apgalvojums nav pareizs 
		//if(num==1) {
		//system out print uzrāda ka tā ir taisnība 
		//if(num!=1) {
			//System.out.println("That is true! ");
		
	}
}




