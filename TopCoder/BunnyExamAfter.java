import java.util.*;
import java.util.regex.*;
import java.text.*;
import java.math.*;


public class BunnyExamAfter
{
	public int getMaximum(String black, String gray, String white)
	{
		int sum1 = 0, sum2 = 0, sum3 = 0;
		for (int i=0;i<black.length();i++){
			if (gray.charAt(i)==black.charAt(i)&&black.charAt(i)==white.charAt(i))
				continue;
			else if (gray.charAt(i)==black.charAt(i)&&black.charAt(i)!=white.charAt(i))
				sum1++;
			else if (gray.charAt(i)!=black.charAt(i)&&black.charAt(i)==white.charAt(i))
				sum1++;
			else if (gray.charAt(i)==white.charAt(i))
				sum1+=2;
			else sum1++;
		}
		return sum1;
	}
	
	// BEGIN KAWIGIEDIT TESTING
	// Generated by KawigiEdit 2.1.4 (beta) modified by pivanof
	private static boolean KawigiEdit_RunTest(int testNum, String p0, String p1, String p2, boolean hasAnswer, int p3) {
		System.out.print("Test " + testNum + ": [" + "\"" + p0 + "\"" + "," + "\"" + p1 + "\"" + "," + "\"" + p2 + "\"");
		System.out.println("]");
		BunnyExamAfter obj;
		int answer;
		obj = new BunnyExamAfter();
		long startTime = System.currentTimeMillis();
		answer = obj.getMaximum(p0, p1, p2);
		long endTime = System.currentTimeMillis();
		boolean res;
		res = true;
		System.out.println("Time: " + (endTime - startTime) / 1000.0 + " seconds");
		if (hasAnswer) {
			System.out.println("Desired answer:");
			System.out.println("\t" + p3);
		}
		System.out.println("Your answer:");
		System.out.println("\t" + answer);
		if (hasAnswer) {
			res = answer == p3;
		}
		if (!res) {
			System.out.println("DOESN'T MATCH!!!!");
		} else if ((endTime - startTime) / 1000.0 >= 2) {
			System.out.println("FAIL the timeout");
			res = false;
		} else if (hasAnswer) {
			System.out.println("Match :-)");
		} else {
			System.out.println("OK, but is it right?");
		}
		System.out.println("");
		return res;
	}
	public static void main(String[] args) {
		boolean all_right;
		all_right = true;
		
		String p0;
		String p1;
		String p2;
		int p3;
		
		// ----- test 0 -----
		p0 = "ABC";
		p1 = "ABC";
		p2 = "ABC";
		p3 = 0;
		all_right = KawigiEdit_RunTest(0, p0, p1, p2, true, p3) && all_right;
		// ------------------
		
		// ----- test 1 -----
		p0 = "A";
		p1 = "B";
		p2 = "B";
		p3 = 2;
		all_right = KawigiEdit_RunTest(1, p0, p1, p2, true, p3) && all_right;
		// ------------------
		
		// ----- test 2 -----
		p0 = "ABC";
		p1 = "PQR";
		p2 = "XYZ";
		p3 = 3;
		all_right = KawigiEdit_RunTest(2, p0, p1, p2, true, p3) && all_right;
		// ------------------
		
		// ----- test 3 -----
		p0 = "AAAAA";
		p1 = "AABBB";
		p2 = "BBBAA";
		p3 = 6;
		all_right = KawigiEdit_RunTest(3, p0, p1, p2, true, p3) && all_right;
		// ------------------
		
		// ----- test 4 -----
		p0 = "TOPCODER";
		p1 = "TOPBUNNY";
		p2 = "THEHONEY";
		p3 = 9;
		all_right = KawigiEdit_RunTest(4, p0, p1, p2, true, p3) && all_right;
		// ------------------
		
		if (all_right) {
			System.out.println("You're a stud (at least on the example cases)!");
		} else {
			System.out.println("Some of the test cases had errors.");
		}
	}
	// END KAWIGIEDIT TESTING
}
//Powered by KawigiEdit 2.1.4 (beta) modified by pivanof!