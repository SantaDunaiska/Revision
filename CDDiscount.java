
public class CDDiscount {

	private int numberCD;
	private int discountAmount;
	
	public CDDiscount() {
	} 

		public void setNumberCD(int numberCD) {
this.numberCD = numberCD;
		}
		public void compute() {
if(numberCD > 40) {
	discountAmount = 50;
}else if (numberCD > 20){
	discountAmount = 30;
}else if (numberCD > 10) {
	discountAmount = 20;
}else {
	discountAmount = 0;
}
}
	public int getDiscountAmount() {
		return discountAmount;
	}

	}

	
	
	
	


