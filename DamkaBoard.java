/**
 *  Gets a command-line argument n (int), and prints an n-by-n damka board.
 */
public class DamkaBoard {
	public static void main(String[] args) {
		int boardSize = Integer.parseInt(args[0]);
		int i = 0;
		while (boardSize > i) {
			if ((i + 1) % 2 == 0) {
				System.out.print(" *");
			}
			else {
				System.out.print("* ");
			}
			int j = 1;
			while (boardSize > j) {
				if ((i + 1) % 2 == 0) {
					System.out.print(" *");	
				}
				else {
					System.out.print("* ");
				}
				j++;				
			}
			System.out.println();
			i++;
		}
	}
}
