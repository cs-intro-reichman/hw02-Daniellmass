/**
 * Prints a given string, backward. Then prints the middle character in the string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {
	public static void main (String[] args){
		String strOrig = args[0];
		String strRevrs = "";
		for (int i = strOrig.length() - 1; i >= 0; i--) {
			strRevrs += strOrig.charAt(i);	 
		}
		System.out.println(strRevrs);
		char midChar;
		if (strOrig.length() % 2 == 0) {
			midChar = strOrig.charAt(strOrig.length() / 2 - 1);
		}
		else {
			midChar = strOrig.charAt(strOrig.length() / 2);
		}
		
		System.out.println("The middle character is " + midChar);
	}	
}
