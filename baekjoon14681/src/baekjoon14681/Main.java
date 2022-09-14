package baekjoon14681;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int x = 0, y = 0, quadrant = 0;
		
		x= sc.nextInt();
		y = sc.nextInt();
		
		if(x > 0 && y > 0) {
			quadrant = 1;
		}else if(y >0) {
			quadrant = 2;
		}else if(x > 0) {
			quadrant = 4;
		}else {
			quadrant = 3;
		}
		System.out.println(quadrant);
	}
}
