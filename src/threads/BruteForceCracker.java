// Below is a completed program that uses brute force to crack a 7-digit password. 
// On average, the program takes about 125 seconds to find the password.
// Your goal is to re-write the algorithm using Threads. Try to shorten the time it takes 
// to find the code to be as little as possible.
// Let's see who can crack the code the fastest!

import java.util.Random;

public class BruteForceCracker {
	static int code = new Random().nextInt(9999999);
	
	static long startTime;
	static long endTime;
	static float elapsedTime;
	
	public static void main(String[] args) {
		System.out.println("Starting Brute Force Checker");
		startTime = System.currentTimeMillis();
		
		int ctr = 0;
		while(!checkCode(ctr++));
		
		endTime = System.currentTimeMillis();
		elapsedTime = (float)(endTime - startTime);
		elapsedTime /= 1000.f;
		System.out.println("Total time taken: " + elapsedTime + " seconds");
	}
	
	public static boolean checkCode(int p){
		System.out.print("checking code: " + p + " -- ");
		if(p == code){
			System.out.println("SUCCESS");
			return true;
		}else{
			System.out.println("FAIL");
			return false;
		}
	}
}
