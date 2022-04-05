package ex14;

import java.util.Arrays;

public class SelectionSort {

	public static void selectionSort(int[] array){
		for(int limit=0;limit<array.length;limit++){

			// on trouve le max
			int maxIndex = limit;
			for(int i=limit+1;i<array.length;i++){
				if(array[i] < array[maxIndex]){
					maxIndex = i;
				}
			}

			// on swap
			int tmp = array[limit];
			array[limit] = array[maxIndex];
			array[maxIndex] = tmp;

		}
	}

	public static void main(String[] args) {
		int[] array = new int[]{3,6,2,8,2,9};

		selectionSort(array);
		System.out.println(Arrays.toString(array));
	}
}
