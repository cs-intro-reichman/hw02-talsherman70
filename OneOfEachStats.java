import java.util.Random;
/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get two command-line arguments: an int value
 * 	that determines how many families to simulate, and an int value
 *  that serves as the seed of the random numbers generated by the program.
 *  Example usage: % java OneOfEachStats 1000 1
 */
public class OneOfEachStats {
	public static void main (String[] args) {
		// Gets the two command-line arguments
		int T = Integer.parseInt(args[0]);
		int seed = Integer.parseInt(args[1]);
		// Initailizes a random numbers generator with the given seed value
        Random generator = new Random(seed);  
		
				int countTwo = 0;
		int countThree = 0;
		int countOverFour = 0;
		double countBirths = 0;
		double avg = 0; 
		
		for (int i = 0; i < T; i++){
			boolean girl = false;
			boolean boy = false;
			int count = 0;
		 
			while (girl == false || boy == false){			 
				count++;
						 
				double rand = generator.nextDouble();
				if (rand < 0.5){
				girl = true;
				}			 
				if (rand >= 0.5){
					boy = true;		
				}
			}
			countBirths = countBirths + count;
			if (count == 2){
				countTwo++;
			}
			if (count == 3){
				countThree++;
			}
			if (count >= 4){
				countOverFour++;
			}
		}
		avg = countBirths / T;
		
		System.out.println("Average: " + avg + " children to get at least one of each gender.");
		System.out.println("Number of families with 2 children: " + countTwo);
		System.out.println("Number of families with 3 children: " + countThree);
		System.out.println("Number of families with 4 or more children: " + countOverFour);
		
		if(countOverFour > Math.max(countThree , countTwo)){
			System.out.println("The most common number of children is 4 or more."); 
		}
		if(countTwo > Math.max(countThree , countOverFour )){
			System.out.println("The most common number of children is 2."); 
		}
		if(countThree > Math.max(countTwo , countOverFour )){
			System.out.println("The most common number of children is 3."); 
		}
		
		
		
		
		
		
		//// In the previous version of this program, you used a statement like:
		//// double rnd = Math.random();
		//// Where "rnd" is the variable that stores the generated random value.
		//// In this version of the program, replace this statement with:
		//// double rnd = generator.nextDouble();
		//// This statement will generate a random value in the range [0,1),
		//// just like you had in the previous version, except that the 
		//// randomization will be based on the given seed.
		//// This is the only change that you have to do in the program.
		    
	}
}
