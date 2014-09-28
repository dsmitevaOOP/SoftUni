import java.util.Scanner;


public class ThreeLetterWord {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		String priv = "";
		String temp = "";
		String setChars = input.nextLine();
		
		char[] chars = setChars.toCharArray();
		
		for (int f = 0; f < chars.length; f++) {
			
			for (int s = 0; s < chars.length; s++) {
				
				for (int t = 0; t < chars.length; t++) {
					
					if (setChars.charAt(0) == setChars.charAt(1) && setChars.charAt(0) == setChars.charAt(2) 
							&& setChars.charAt(0) == setChars.charAt(2)) {
						temp = "" + chars[f] + chars[s] + chars[t] + " ";
		                System.out.print(temp);	 
		                return;
						
					}
					
							temp = "" + chars[f] + chars[s] + chars[t] + " ";
			                System.out.print(temp);	 
				}
				
			}
		 
		}
		 
	}

}

