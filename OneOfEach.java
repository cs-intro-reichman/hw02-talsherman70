
/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */
public class OneOfEach {
	public static void main (String[] args) {
		 
		 boolean girl = false;
		 boolean boy = false;
		 int count = 0;
		 
		 while (girl == false || boy == false){			 
			count++;
			int rand = (int)Math.floor(Math.random() * (2));			 
			if (rand == 0){
				girl = true;
				System.out.print("g ");
			 }			 
			if (rand == 1){
				boy = true;
				System.out.print("b ");
			}
		 }
		 System.out.println();
		 System.out.println("You made it... and you now have " + count + " children.");
	}
}
