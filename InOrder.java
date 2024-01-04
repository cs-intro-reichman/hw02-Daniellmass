/**
 *  Generates and prints random integers in the range [0,10),
 *  as long as they form a non-decreasing sequence.
 */
public class InOrder {
	public static void main (String[] args) {
		int firstRand = (int)(Math.random() * 10);
		System.out.print(firstRand);
		int prev = firstRand;
		int current;
		do {
			current = (int)(Math.random() * 10);
			if (current >= prev) {
			System.out.print(" " + current);
			prev = current; 
		    } 
			else {
	     	 break; 
		}
	} while (current >= prev);
   }	
  }
