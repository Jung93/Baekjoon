package baekjoon2480;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int[] dices = new int[3];
		int max = 0, result = 0;
		boolean checkAll = false;
		
		dices[0] = sc.nextInt();
		dices[1] = sc.nextInt();
		dices[2] = sc.nextInt();
		checkAll = dices[0] == dices[1] && dices[1] == dices[2];
		
		if(checkAll) {
			result = 10_000 + dices[0] * 1_000;
			
		}else if(dices[0] == dices[1] || dices[0] == dices[2]){
			result = 1_000 + dices[0] * 100;
			
		}else if(dices[1] == dices[2]){
			result = 1_000 + dices[1] * 100;
			
        }else{
            for(int i = 0; i < 3; i++){
                if(dices[i] > max){
                    max = dices[i];
                }
        }
			result = max * 100;
			
		}
		System.out.println(result);
	}
}
