import java.util.Scanner;
 

public class Student {
	//instance variable
	private String name;
	public Student(String aName){ //mandotory to provide the name
		name = aName;
	}
	public Student(){ //we can provide or not, we dont care 
		name = "";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
		Scanner sc = new Scanner(System.in);
	
	
		System.out.println("please enter your name ");
		name = sc.nextLine();
		
		System.out.println("So your student name is " + getName());
		
	}	
	
}