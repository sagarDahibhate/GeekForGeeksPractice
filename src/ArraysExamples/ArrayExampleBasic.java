package ArraysExamples;

import java.util.Arrays;

public class ArrayExampleBasic {
	public static void main(String[] args) {
		int[] array = new int[5];

		int[] arr = new int[] { 1, 2, 3, 4, 5 };
		for (int i = 0; i < 5; i++) {
			array[i] = i;
		}
		
	 

		System.out.println(Arrays.toString(array));
		System.out.println(Arrays.toString(arr));
		
	}
}
