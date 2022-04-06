package ex15;

public class Perfect {

	// TODO to improve
	private static int divisorsSum(int n){
		int sum = 0;

		for(int i=1;i<=n/2;i++){
			if(n%i==0){
				sum += i;
			}
		}
		return sum;
	}

	public static boolean isPerfect(int aPosInt){
		return divisorsSum(aPosInt) == aPosInt;
	}

	public static boolean isDeficient(int aPosInt){
		return divisorsSum(aPosInt) < aPosInt;
	}

	public static void main(String[] args) {
		System.out.println(isPerfect(6));
		System.out.println(isPerfect(10));
		System.out.println(isDeficient(10));
	}
}
