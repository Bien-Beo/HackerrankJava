package BasicExercises;

import java.util.Scanner;

public class SumOfArray {
	public static Scanner in = new Scanner(System.in);
	
	public static void importArr(int arr[], int length) {
		for(int i = 0; i < length; i++) {
			arr[i] =in.nextInt();
		}
	}
	
	public static int sumArr(int arr[], int length) {
		int Sum = 0;
		for(int i = 0; i < length; i++) {
			Sum += arr[i];
		}
		return Sum;
	}
	
	public static void main(String[] args) {
		int size; size = in.nextInt();
		int[] intArr = new int[size];
		importArr(intArr, size);
		System.out.println(sumArr(intArr, size));
	}

}
