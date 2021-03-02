import java.util.Scanner;

public class Fibonacci_recursion {
	
	public static int fib(int num)
	{
		//num = order
		// 5 = 5th = 1+1+2+3+5+ ... >> 5th = 5
		
		if(num == 1)
		{
			return 1;
		}
		
		else if(num == 2)
		{
			return 1;
		}
		
		else
		{
			return fib(num-1)+fib(num-2);
		}
	}
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Input your index");
		int input = sc.nextInt();
		
		System.out.println("fib("+input+") = "+fib(input));
		

	}

}
