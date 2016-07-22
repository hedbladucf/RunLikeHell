/* 
 * Oscar Hedblad
 * PID: o3415424
 * COP3503 - RunLikeHell.java
 * 
 * DESCRIPTION: Program that takes an integer array, then calculates the maximum value, 
 * or "knowledge", one can get by adding non adjacent blocks together. This program is
 * implemented with O(n) run time.
 * 
 * */

public class RunLikeHell{ 

	static int [] blocks = { 15, 3, 6, 17, 2, 1, 20 };
	/* Method that returns the max "knowledge" that can be gained by jumping on the blocks. 
	 * No indexes that are gained are allowed to be adjacent. */	
	public static int maxGain(int [] blocks){
	
		/* BASE CASE. */
		if(blocks == null){
			return 0;
		}
		/* Creation and initialization of variables. */
		int length, takeIn, ruleOut;
		length = blocks.length;
		takeIn = blocks[0];
		ruleOut = 0;
		
		/* Run through the entire length. */
		for (int i = 1; i < length; i++){
			/* Current maximum excluded blocks at [i] */
			int newExcluded = Math.max(takeIn, ruleOut); 
			
			/* Current maximum included blocks at [i] */
			//Current max including blocks[i]  
			takeIn = ruleOut + blocks[i];  
			ruleOut = newExcluded;  
		}
		/* Returns the maximum value of the two. */
		return Math.max(takeIn, ruleOut);  
	}
	/* Difficulty rating method. I found this assignment quite difficult, especially
	 * considering how short of an assignment it was. But, very helpful! */
	public static double difficultyRating(){
	
		return 4.1;
	}
	/* Hours spent method. Including the recursive solution that I worked on before
	 * attempting to solve the DP approach. */
	public static double hoursSpent(){
	
		return 6.5;
	}
}
