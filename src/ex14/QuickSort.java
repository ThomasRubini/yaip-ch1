package ex14;

import java.util.Arrays;

public class QuickSort {

	public static void swap(int[] array, int a, int b){
		int tmp = array[a];
		array[a] = array[b];
		array[b] = tmp;
	}

	// NO idea why it returns a boolean, but the specification said so
	public static boolean quickSort(int[] array, int fromIdx, int toIdx){
		if(toIdx-fromIdx<=1)return true;

		int pivotIndex = fromIdx+(toIdx-fromIdx)/2;
		int pivot = array[pivotIndex];

		swap(array, pivotIndex, toIdx-1);

		int swapPos = fromIdx;
		for(int i=fromIdx;i<toIdx-1;i++){
			if(array[i] < pivot){
				swap(array, swapPos, i);
				swapPos++;
			}
		}

		swap(array, swapPos, toIdx-1);

		quickSort(array, fromIdx, swapPos);
		quickSort(array, swapPos+1, toIdx);

		return true;
	}

	public static boolean quickSort(int[] array){
		return quickSort(array, 0, array.length);
	}

	public static void main(String[] args) {
		int[] array = new int[]{20,11,18,14,15,9,32,5,26};
		quickSort(array);

		System.out.println(Arrays.toString(array));

	}
}
