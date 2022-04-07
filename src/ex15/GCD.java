package ex15;

public class GCD {

	public static int gcd(int a, int b){
		while(b != 0){
			int tmp = b;
			b = a%b;
			a = tmp;
		}
		return a;
	}

	public static void main(String[] args) {
		System.out.println(gcd(15, 5));
		System.out.println(gcd(88, 11));
		System.out.println(gcd(3456, 1233));
	}
}
