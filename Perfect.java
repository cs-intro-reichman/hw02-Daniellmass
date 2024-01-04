/**
 *  Gets a command-line argument (int), and chekcs if the given number is perfect.
 */
public class Perfect {
	public static void main (String[] args) {
		int numToCheck = Integer.parseInt(args[0]);
		int i = 2;
		int sumDivisors = 1;
		String strDivisorSum = "1";
		while (numToCheck > i) {
			if (numToCheck % i == 0) {
				sumDivisors += i;
				strDivisorSum += " + " + i;			 
			}
			i++;
		}
		if (numToCheck == sumDivisors) {
			System.out.println(numToCheck + " is a perfect number since " + numToCheck + " = " + strDivisorSum);
		}
		else {
			System.out.println(numToCheck + " is not a perfect number");
		}
	}
}
