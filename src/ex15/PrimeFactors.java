package ex15;

public class PrimeFactors {

	public static boolean isProductOfPrimeFactors(int n){
		if(n==1)return false;
		int total = 1;
		for(int i=2;i<=n/2;i++){
			if(n%i==0 && PrimeNumbers.isPrime(i)){
				total *= i;
			}
		}
		return total == n;
	}

	public static void main(String[] args) {
		System.out.println(isProductOfPrimeFactors(22));
	}
}
