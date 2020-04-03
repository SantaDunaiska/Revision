/** Home Work:
 Write an application that prompts a student to input a day of the week, and then it will display whether there are classes scheduled for that day.
 Day        Message
 Monday:	Evening classes at 19:00
 Tuesday:   No classes
 Wednesday:	Evening classes at 19:00
 Thursday:  No classes
 Friday:	No classes
 Saturday:	Whole day Labs :)
 Sunday:	It's finally Sunday! : default:   check your input mate/fella/gal
 */
import java.util.Scanner;
public class SwitchDays {
    public static void main(String args[]) {
    	
     System.out.println("Hi! choose a number to find out if you have something planed for that day!");
     System.out.println("Monday -> 1: ");
     System.out.println("Tuesday -> 2");
     System.out.println("Wednesday -> 3");
     System.out.println("Thursday -> 4");
     System.out.println("Friday -> 5");
     System.out.println("Saturday -> 6");
     System.out.println("Sunday -> 7");
    	
     					Scanner input = new Scanner(System.in);
     					int Day = input.nextInt();
     					
     				int Monday = 1;
     			   	int Tuesday = 2;
     			    int Wednesday = 3;
     			    int Thursday = 4;
     			    int Friday = 5;
     			    int Saturday = 6;
     			    int Sunday = 7;
     			    
		switch (Day) {
		case 1:
			System.out.println("Monday's - Evening classes at 19:00");
        break;
		case 2:
			System.out.println("Tuesday's - No Evening classes");
	    break;
		case 3:
			System.out.println("Wednesday's - Evening classes at 19:00");
		break;
		case 4:
			System.out.println("Thursday's - No Evening classes");
		break;
		case 5:
			System.out.println("Friday's - No Evning classes");
		break;
		case 6:
			System.out.println("Saturday's a Lab days :) ");
		break;
		case 7:
			System.out.println("Wooohoooo Sundaaay!");
			
		}
    	
    
		
        // declare a variable to store the day entered by the user
        // declare a variable named scan to be able to work with objects of type Scanner
        // create a Scanner object to read input from the keyboard
        // prompt the user to enter a day of the week
        //System.out.println("Please enter a day of the week to see whether there are any classes scheduled for that day");
        // read the string provided by the user
        // we know that Java is case sensitive, therefore let's convert the word provided by the user to lower case so that the program works independent of the way the user writes the word e.g. Monday, monDAY, MoNdAy
        // toLowerCase() is a method declared in the class String. The method converts all the characters in a given string to lower case
        //switch () {
//note: a switch statement accepts a constant expression/variable of type String only starting with Java version 7; in earlier versions the compiler shows an "incompatible types" error.
            //case "monday":
                //System.out.println("Evening classes at 19:00");
                //break;
        //}
    
						}
    }
    
    