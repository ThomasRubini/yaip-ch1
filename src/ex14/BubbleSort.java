package ex14;

import java.util.Arrays;

public class BubbleSort {

	public static void bubbleShort(int[] array){
		int n = array.length;
		boolean swapped;
		do{
			swapped = false;
			for(int i=1;i<n;i++){
				if(array[i-1] > array[i]){
					int tmp = array[i];
					array[i] = array[i-1];
					array[i-1] = tmp;
					swapped = true;
				}
			}
		}while(swapped);
	}

	public static void main(String[] args) {
		int[] array = new int[]{3,6,2,8,2,9};
		bubbleShort(array);
		System.out.println(Arrays.toString(array));
	}
}
