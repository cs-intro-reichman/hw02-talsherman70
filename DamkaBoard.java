/**
 *  Gets a command-line argument n (int), and prints an n-by-n damka board.
 */
public class DamkaBoard {
	public static void main(String[] args) {
		
		int size = Integer.parseInt(args[0]);
		
		for (int i = 0; i < size; i++){
			
			if (i % 2 == 0) {
				System.out.print(" ");
			}
			
			for (int j = 0; j < size; j++){
				System.out.print("* ");
			 
			}		
			System.out.println();
		}
	}
}
