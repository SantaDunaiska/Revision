import java.util.Scanner;
public class PatternsApp {
    public static void main(String[] args) {
        //declare variables
        int n;
        Scanner scan = new Scanner(System.in);
        //the size of the pattern
        System.out.println("enter a value for n:");
        n = scan.nextInt();
        /*
        Pattern 1
         *
         **
         ***
         ****
         *****
         ******
         */
        System.out.println();
        System.out.println("Pattern 1:");
        System.out.println();
        //two nested loop
        //outer loop: number of rows
        for (int i = 1; i<=n; i++){
            //inner loop:to print the columns, to display info for each row
            for (int j = 1; j <= i; j++){
                System.out.print('*');
            }
            System.out.println();
        }
        /*
        Pattern 2
        *
       **
      ***
     ****
    *****
   ******
         */
        System.out.println();
        System.out.println("Pattern 2:");
        System.out.println();
        //two nested loop
        //outer loop: number of rows
        for (int i = 1; i <= n; i++){
            //inner loop:to print the columns, to display info for each row
            for (int j = 1; j<=n; j++){
                if(i+j < n + 1){
                    System.out.print(" ");
                }else{
                    System.out.print('*');
                }
            }
            System.out.println();
        }
    }
}