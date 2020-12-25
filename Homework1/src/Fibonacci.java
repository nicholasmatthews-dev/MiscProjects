
public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 1; i <= 15; i++) {
			System.out.println(fibonacci(i));
		}
	}
	
	public static int fibonacci(int n) {
		if (n == 1 || n ==2) {
			return 1;
		}
		else {
			return fibonacci(n-1)+fibonacci(n-2);
		}
	}

}
