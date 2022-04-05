package ex14;

import java.util.Arrays;

public class InsertionSort {

	public static void insertionSort(int[] array){
		for(int i=1;i<array.length;i++){
			int val = array[i];
			int j = i-1;

			while(j >= 0 && array[j] > val){
				array[j+1] = array[j];
				j--;
			}
			array[j+1] = val;
		}
	}

	public static void main(String[] args) {
		int[] array = new int[]{3,6,2,8,2,9};

		insertionSort(array);

		System.out.println(Arrays.toString(array));
	}
}
