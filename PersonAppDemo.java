import java.util.Scanner;

public class PersonAppDemo {
	/** 
	Develop an application which creates multiple objects of type Person class
	Store them in an array, retrieve the objects from the array and call different methods on these objects.
	*/
	public static void main(String[] args) {
		//declare array
		Person person[];
		//to store the number of obj, created of Person-from the array
		int n;
		Scanner sc = new Scanner(System.in);
		//promt the messeg for the user to input 
		System.out.print("How many Person obj will be created?: ");
		n = sc.nextInt();
		person = new Person[n];
		
		//declare a local variable to store persons name
		String name;
		int age;
		boolean enjoysReading;
		
	//loop for to take the users input 
	//in each interaction
		for(int i = 0; i<n; i++) {
			System.out.println("Name: ");
			name = sc.next();
		System.out.println("~~~~~~~~~~");
			System.out.println("Age: ");
			age = sc.nextInt();
		System.out.println("~~~~~~~~~~");	
			System.out.println("Does this person like to read ? ");
			enjoysReading = sc.nextBoolean();
		System.out.println("~~~~~~~~~~");
		
		
		
		//create an object type person using constructor with 3 par.
		person[i] = new Person(name, age, enjoysReading );
		
					
	}
		//processing
		//declare variable of type person
		
		Person p;
		boolean enjoy;
		
		
		//one more for loop to retrieve the person at index I 
		
		for (int i = 0; i< person.length; i++) {
		p = person[i];
		
		//method display me 
		p.displayMe();
		enjoy = p.enjoysRading();
		
		if(enjoy == true) {
			System.out.println("enjoy reading.");
		}else{
			System.out.println("Does not enjoy reading.");
		}
		}

}
}













