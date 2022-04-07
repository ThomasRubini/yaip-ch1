package ex15;

import java.util.Scanner;

public class PerfectPrimeFactorList {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the upper bound: ");
		int upper = sc.nextInt();

		int found = 0;
		for(int i=2;i<upper;i++){
			if(PrimeFactors.isProductOfPrimeFactors(i)){
				System.out.print(i+" ");
				found++;
			}
		}
		System.out.printf("\n[%s numbers found (%.2f%%)\n", found, found/(float)upper*100);
		// I still think 1 doesn't qualify, so 35 instead of 36
	}
}
