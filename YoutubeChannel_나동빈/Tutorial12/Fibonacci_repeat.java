import java.util.Scanner;

public class Fibonacci_repeat {

	public static int fib(int num)
	{
		//num = order
		// 5 = 5th = 1+1+2+3+5+8+ ... >> 5th = 5
		
		int first = 1, second = 1;
		int result = -1;
		
		if(num == 1)
		{
			return first;
		}
		
		else if(num == 2)
		{
			return second;
		}
		
		else
		{
			for(int i=2;i<num;i++)
			{
				result = first+second;
				first = second;
				second = result;
			}
			
			return result;
		}

		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Input your index");
		int input = sc.nextInt();
		
		System.out.println("fib("+input+") = "+fib(input));

	}

}
