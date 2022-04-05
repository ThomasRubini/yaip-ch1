package ex14;

public class LinearSearch {

	public static boolean linearSearch(int[] array, int key){
		for(int v : array){
			if(v==key)return true;
		}
		return false;
	}

	// "key" should be named "value"
	// bad design, we don't know if "0" means "not found" or "found at index 0"
	public static int linearSearchIndex(int[] array, int key){
		for(int i=0;i<array.length;i++){
			if(array[i]==key)return i;
		}
		return 0;
	}

	public static void main(String[] args) {
		int[] array = {5,8,1,42,0,3};
		System.out.println(linearSearch(array, 5));
		System.out.println(linearSearchIndex(array, 5));

		System.out.println(linearSearch(array, 50));
		System.out.println(linearSearchIndex(array, 50));
	}
}
