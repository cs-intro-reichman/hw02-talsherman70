/**
 * Prints a given string, backward. Then prints the middle character in the string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {
	public static void main (String[] args){
		String str = args[0]; 
		String reverse = "";
		
		
		for (int i = str.length(); i > 0 ; i--){
			
			reverse = reverse + str.charAt(i - 1);
		
		}
		System.out.println(reverse);
		System.out.println("The middle character is " + reverse.charAt(str.length() / 2);
	}
}
