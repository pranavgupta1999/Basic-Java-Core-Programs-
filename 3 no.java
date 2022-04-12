import java.util.Scanner;

import Utility.Util;


public class TripletNo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of array : ");
		int arr_size = sc.nextInt();
		int sum = 0;

		System.out.println("Enter the element : ");
		int[] arr = new int[arr_size];
		for (int i = 0; i < arr_size; i++) {
			arr[i] = sc.nextInt();
		}
		Util.tripletNo(arr, arr_size, sum);
	}
}
