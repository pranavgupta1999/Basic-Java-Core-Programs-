import java.util.Scanner;

import Utility.Util;

public class TwoDAraay {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter  no of rows you want : ");
		int row = sc.nextInt();
		System.out.print("Enter  no of column  you want : ");
		int column = sc.nextInt();
		Util.twoDArray(row, column);
	}
}
