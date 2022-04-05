package ex13;

public class NumSequence {
	public static int numOfDigits(int n){
		return Integer.toString(n).length();
	}
	public static int recursive(int n){
		if(n==1)return 1;
		else return numOfDigits(n)+recursive(n-1);
	}

	public static int iterative(int n){
		int total = 0;
		for(int i=1;i<=n;i++){
			total += numOfDigits(i);
		}
		return total;
	}

	public static void main(String[] args) {
		System.out.println(recursive(20));
		System.out.println(iterative(20));
	}
}
