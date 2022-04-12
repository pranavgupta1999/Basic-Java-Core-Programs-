import java.util.Scanner;

import Utility.Util;

public class PrimeFactor {
	public static void main(String[] args) {
		System.out.println("Enter number:");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		Util.primeFactor(num);
	}
}
