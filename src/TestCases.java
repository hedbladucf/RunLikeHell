// Sean Szumlanski
// COP 3503, Fall 2013

// TestCases.java
// ==============
// When you have your RunLikeHell class implemented properly, you should be able
// to run this program and produce the following output:
//
//   Test Case #1: PASS
//   Test Case #2: PASS
//   Test Case #3: PASS
//   Test Case #4: PASS
//   Test Case #5: PASS
//   Test Case #6: PASS
//   Test Case #7: PASS
//   Test Case #8: PASS
//
// Keep in mind that these test cases are by no means comprehensive! You need to
// create some of your own.


import java.io.*;

public class TestCases
{
	// Print whether the test case passes or fails, based on expected answer (ans)
	public static void testCase(int [] blocks, int ans, int n)
	{
		System.out.print("Test Case #" + n + ": ");
		System.out.println((RunLikeHell.maxGain(blocks) == ans) ? "PASS" : "FAIL");
	}

	public static void main(String [] args)
	{
		// This should help ensure everyone implements these methods correctly.
		double dr = RunLikeHell.difficultyRating();
		double hs = RunLikeHell.hoursSpent();

		if (dr < 1.0 || dr > 5.0)
		{
			System.out.println("ERROR: difficultyRating() must return a double on the range [1.0, 5.0].");
		}

		if (hs <= 0.0)
		{
			System.out.println("ERROR: hoursSpent() must return a double that is greater than zero.");
		}

		int [] blocks;
		int ans, i = 0;

		// Test Case #1
		blocks = new int[] {15, 3, 6, 17, 2, 1, 20};
		ans = 52;
		testCase(blocks, ans, ++i);

		// Test Case #2
		blocks = new int[] {9, 20, 13, 16, 9, 9, 6};
		ans = 45;
		testCase(blocks, ans, ++i);

		// Test Case #3
		blocks = new int[] {9, 20, 13, 16, 9, 6, 9};
		ans = 45;
		testCase(blocks, ans, ++i);

		// Test Case #4
		blocks = new int[] {15, 3, 6, 17, 2, 1, 20};
		ans = 52;
		testCase(blocks, ans, ++i);

		// Test Case #5
		blocks = new int[] {16, 10, 15, 12, 2, 20, 2, 16};
		ans = 67;
		testCase(blocks, ans, ++i);

		// Test Case #6
		blocks = new int[] {3, 5, 7, 3, 11, 5, 9, 8};
		ans = 30;
		testCase(blocks, ans, ++i);

		// Test Case #7
		blocks = new int[] {7, 10, 18, 16, 17, 12, 14, 9};
		ans = 56;
		testCase(blocks, ans, ++i);

		// Test Case #8; this will be very slow with the recursive approach
		blocks = new int[] {573, 216, 451, 236, 42, 243, 743, 162, 317, 323, 4,
		                    407, 230, 380, 177, 89, 596, 421, 643, 655, 735, 441,
		                    408, 716, 449, 781, 28, 346, 241, 229, 697, 354, 685,
		                    628, 535, 463, 578, 275, 786, 362, 488, 372, 68, 434,
		                    687};
		ans = 11260;
		testCase(blocks, ans, ++i);
	}
}
