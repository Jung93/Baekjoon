package code1065;

import java.util.Scanner;

public class Main {
	public static int count(int number) {
		int one = 0, ten = 0, hundred = 0, count = 0;
		
		if(number < 100) {
			return number;
		}else {
			count = 99;
			
			for (int i = 100; i < number+1; i++) {
				one = i % 10;
				ten = (i / 10) % 10;
				hundred = i / 100;
				
				if((ten - one) == (hundred - ten)) {
					count++;
				}
			}
		}
		
		return count;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = 0;
		
		number = sc.nextInt();
		System.out.println(count(number));
		
	}
}
