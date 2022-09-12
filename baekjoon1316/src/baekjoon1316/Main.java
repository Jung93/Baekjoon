package baekjoon1316;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static boolean group(String str) {
		boolean[] alphabet = new boolean[26];
		int prev = 0, now = 0;
		
		for (int i = 0; i < str.length(); i++) {
			now = str.charAt(i);
			if(prev != now) {
				
				if(!alphabet[now - 'a']) {
					
					alphabet[now - 'a'] = true;
					prev = now;
				}else {
					return false;
				}
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> strs = new ArrayList<String>();
		int count = 0, repeat = 0;
		
		repeat = sc.nextInt();
		for (int i = 0; i < repeat; i++) {
			String input = sc.next();
			strs.add(input);
		}
	
		for (int i = 0; i < strs.size(); i++) {
			if(group(strs.get(i))) {
				count++;
			}
		}
		System.out.println(count);
	}
}
