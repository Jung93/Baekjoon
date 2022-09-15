package baekjoon25304;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int totalPrice = 0, totalKind = 0, price = 0, count = 0, bought = 0;
		String result = null;
		
		totalPrice = sc.nextInt();
		totalKind = sc.nextInt();
		
		for (int i = 0; i < totalKind; i++) {
			price = sc.nextInt();
			count = sc.nextInt();
			
			bought += price * count;
		}
		
		if(totalPrice == bought) {
			result = "Yes";
		}else {
			result = "No";
		}
		
		System.out.println(result);
	}
}
