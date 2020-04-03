
public class StarWord {

	public static void main(String[] args) {
	}
	
		    //sc
		    //setMethod
		    //compute methods
		    //computeVowels
		    //computeStars
		    //computePigLatin
		    //reverseWord
		    //get method
		    //.toString();

		
				//declare data members
				private String wordInput;
				private int method;
				private String resultWord;
				StringBuffer sb = new StringBuffer();

				
				//constructor
public StarWord () {
				}
				
				//setMethod for input (word, method)
public void setWord (String wordInput) {
this.wordInput = wordInput;
				}
public void setChosenMethod (int m) {
					method = m;
				}
				
				
				//compute methods (4 of them for user to choose)
public void computeVowels () {
					
				for (int i = 0; i<=wordInput.length()-1; i++) {
						
						//retrieve the char from the word located at the index i, and store in the variable l
				char l = wordInput.charAt(i);
						
				if (l =='a' || l== 'A') {
							sb.append(2);
				}else if (l == 'e' || l == 'E') {
							sb.append(6);
				}else if (l == 'i' || l == 'I') {
							sb.append(10);
				}else if (l == 'o' || l == 'O') {
							sb.append(16);
				}else if (l == 'u' || l == 'U') {
							sb.append(22);	
				}else { 
							sb.append(l); // (l) will add the initial letter to the word
				}
						} //end for

				} //end of compute vowels
				
				
				// SECOND computeStars 
public void computeStars ( ) {
		for (int i = 0; i < wordInput.length(); i++) {
						sb.append('*');
					}
				} // end of computeStars
				
				
				
				//THIRD computePigLatin (PigLatin)
			public void computePigLatin () {
				int i = 1;
				while (i < wordInput.length()) {
				char c = wordInput.charAt(i);
					sb.append(c);
					i++;
					
					}// end while
					sb.append(wordInput.charAt(0));
					sb.append("ay");
				}//end method

				
				
				//FORTH reverseWord (check Test)
				public void reverseWord () {
					for (int i = wordInput.length()-1; i >= 0; i--) {
					char c = wordInput.charAt(i);
					sb.append(c);
					}
				} //end of reverseWord
				
				
				public String getStringbuffer () {
					return sb.toString();	
				}
				
			{//end class
		}
	}


