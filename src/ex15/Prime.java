package ex15;

import java.util.Scanner;

public class Prime {

	public static boolean isPrime(int aPosInt){
		// Not the best way
		for(int i=2;i<=Math.sqrt(aPosInt);i++){
			if(aPosInt%i==0)return false;
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter the upper bound: ");
		int upper = sc.nextInt();

		// DEFINITIVELY not the best way
		int found = 0;
		for(int i=2;i<upper;i++){
			if(isPrime(i)){
				System.out.println(i);
				found++;
			}
		}
		System.out.printf("[%s primes found (%.2f%%)\n", found, found/(float)upper*100);
		// the example in yaip is wrong, because 1 is not a prime number, so the real number is 1229 and not 1230 (for 10000)
	}
}
