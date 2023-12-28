/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get one command-line argument: an int value
 * 	that determines how many families to simulate.
 */
public class OneOfEachStats1 {
	public static void main (String[] args) {
		
		int T = Integer.parseInt(args[0]);
		int countTwo = 0;
		int countThree = 0;
		int countOverFour = 0;
		double countBirths = 0;
		double avg = 0; 
		int common = 0;
		
		for (int i = 0; i < T; i++){
			boolean girl = false;
			boolean boy = false;
			int count = 0;
		 
			while (girl == false || boy == false){			 
				count++;
				int rand = (int)(Math.random() * 2);			 
				
				if (rand < 0.5 ){
				girl = true;
				}			 
				if (rand >= 0.5){
					boy = true;		
				}
			}
			countBirths = countBirths + count;
			if (count == 2){
				countTwo++;
				if (countTwo > Math.max(countThree , countOverFour )){
					common = 2;	
				}
			}
			if (count == 3){
				countThree++;
				if (countThree > Math.max(countTwo , countOverFour )){
					common = 3;	
				}
			}
			if (count >= 4){
				countOverFour++;
				if (countOverFour > Math.max(countTwo , countThree )){
					common = 4;	
				}
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
		if(countTwo == Math.max(countThree , countOverFour)){
			System.out.println("The most common number of children is " + common);
		}
		
		
	}
}
