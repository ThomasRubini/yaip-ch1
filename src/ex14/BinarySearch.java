package ex14;

public class BinarySearch {

	public boolean binarySearch(int[] array, int key, int fromIdx, int toIdx){
		if(fromIdx==toIdx-1){
			return array[fromIdx]==key;
		}else{
			int middleIdx = (fromIdx+toIdx)/2;
			if(array[middleIdx]==key)return true;
			else if(key  < array[middleIdx])toIdx = middleIdx;
			else fromIdx = middleIdx+1;

			return binarySearch(array, key, fromIdx, toIdx);
		}
	}

	public boolean binarySearch(int[] array, int key){
		return binarySearch(array, key, 0, array.length);
	}

	public static void main(String[] args) {
		int[] array = new int[]{1,4,5,7, 9, 13, 24, 25, 78};
		System.out.println((new BinarySearch().
				binarySearch(array, 77)
		));
	}
}
