package baekjoon3003;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
//		킹 1개, 퀸 1개, 룩 2개, 비숍 2개, 나이트 2개, 폰 8개
		
		Scanner sc = new Scanner(System.in);
		int[] totalPieces = {1, 1, 2, 2, 2, 8};
		int[] foundPieces = new int[6];
		int[] needPieces = new int[6];
		
		for (int i = 0; i < foundPieces.length; i++) {
			foundPieces[i] = sc.nextInt();
			needPieces[i] = totalPieces[i] - foundPieces[i];
		}
		for (int i = 0; i < needPieces.length; i++) {
			System.out.println(needPieces[i]);
		}
	}
}
