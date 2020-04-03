import javax.swing.JOptionPane;
public class CDDiscountAPP{
	
    public static void main(String[] args) {
        //local variables
        int numcd,discamt;
        char r;
        do {
            //object
            CDDiscount myCDDisc = new CDDiscount();
            //input
            numcd = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Please enter the number of CD: "));
            myCDDisc.setNumberCD(numcd);
            //process
            myCDDisc.compute();
            //output
            discamt = myCDDisc.getDiscountAmount();
            JOptionPane.showMessageDialog(null,
                    "Having purchased " + numcd
            + " Disc with the discount " + discamt+"%");
            r = JOptionPane.showInputDialog(null,
                    "Do you want to continue shopping?").charAt(0);
        }while (r == 'y' || r =='Y');
    }//end main
}//end class