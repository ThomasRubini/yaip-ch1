package ex15;

import java.util.Scanner;

public class PrimeNumbers {

	public static boolean isPrime(int aPosInt){
		if(aPosInt==1)return false;
		// Not the best way
		for(int i=2;i<=Math.sqrt(aPosInt);i++){
			if(aPosInt%i==0)return false;
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println(isPrime(13));
		System.out.println(isPrime(22));
		System.out.println(isPrime(1));
	}
}
