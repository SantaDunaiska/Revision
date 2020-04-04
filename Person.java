
public class Person {
	/** 
	Person.java demonstrates
		-- how to declare an instantiable class
		-- how to declare multiple constructors
			 --- constructor: during a program's execution, a constructor is used to initialize the object's instance variables when that object is created
		-- how to implement a class's attributes by declaring instance variables
		-- how to implement a class's behaviour by implementing a method (i.e. displayMe())
	*/
	//instansiable class
	//declare instance variables
	private String name;
	private int age;
	private boolean enjoysReading;
	
//constractor to inisialize objects, with multiple constructors we need more parameters
	//generate a const. emty defult one
public Person() {
}
	//constructor with 1 par.
	public Person(String name) {
	//when we will create an obj. in the persons app, this is the par. that will be used
	this.name = name;
	}
public Person(String name, int age) {
this.name = name;
this.age = age;
}
	    public Person(String name, int age, boolean enjoysReading) {
		this.name = name;
		this.age = age;
		this.enjoysReading = enjoysReading;		
}

public Person(boolean enjoysReading, String name, int age) {
this.name = name;
this.age = age;
this.enjoysReading = enjoysReading;
}
  
	//declare a desplay method
	public void displayMe() {
	System.out.println("Person's name: " + name);
	System.out.println("Person's age: " + age);
	System.out.println("Person likes to read : " + enjoysReading);
	System.out.println("~~~~~~~~~~");
}
//setter method
	public void setAge(int age) {
		this.age = age;
	}
//getter method to retrieve boolean
    public boolean enjoysRading() {
    	return enjoysReading;
    }
}
