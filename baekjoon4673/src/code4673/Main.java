package code4673;

public class Main {
	
	public static int getSum(int n) {
		int sum = n;

		while(n != 0) {
			sum += n%10;
			n /= 10;
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
		boolean[] check = new boolean[10000];
		int number = 0;
		
		for (int i = 0; i < 10000; i++) {
			number = getSum(i+1);
			
			if(number < 10000) {
				check[number] = true;
			}
			
			if(!check[i] && i !=0) {
				System.out.println(i);
			}
		}
	}
}
