package baekjoon10871;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int repeat = sc.nextInt(), masterNumber = sc.nextInt(), number = 0;
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		for (int i = 0; i < repeat; i++) {
			numbers.add(sc.nextInt());
		}
		for (int i = 0; i < numbers.size(); i++) {
			number = numbers.get(i);
			if(number < masterNumber) {
				System.out.print(number + " ");
			}
		}
	}
}
