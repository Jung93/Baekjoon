package baekjoon2525;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		int[] times = new int[3];
		
		int hour = Integer.parseInt(sc.next());
		int minute = Integer.parseInt(sc.next());
		int cookTime = sc.nextInt();
		
		sum = minute + cookTime;
		
		if(sum>=60) {
			hour += (sum / 60);
			minute = sum % 60;
		}else {
			minute = sum;
		}
		
		if(hour >= 24) {
			hour-= 24;
		}
		
		System.out.println(hour + " " + minute);
	}
}
