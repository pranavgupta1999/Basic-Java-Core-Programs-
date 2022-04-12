import java.util.Scanner;

import Utility.Util;


public class SwapNo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number you wish to swap :");
		int first = sc.nextInt();
		int second = sc.nextInt();

		Util.swapNo(first , second);
	}
}