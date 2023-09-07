package studio1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the year");
		int y = in.nextInt();
		boolean year = (y%4==0);

	}

}
