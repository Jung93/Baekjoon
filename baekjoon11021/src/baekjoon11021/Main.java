package baekjoon11021;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int repeat =Integer.parseInt(br.readLine()) +1;
		String first = null;
		int firstNumber = 0, lastNumber = 0;
		
		for (int i = 1; i < repeat; i++) {
			first = br.readLine();
			
			StringTokenizer st = new StringTokenizer(first);
			firstNumber = Integer.parseInt(st.nextToken());
			lastNumber = Integer.parseInt(st.nextToken());
			
			System.out.println("Case #" + i + ": " + (firstNumber + lastNumber));
		}
		
		br.close();
	}
}
