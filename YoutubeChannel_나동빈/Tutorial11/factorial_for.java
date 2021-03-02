import java.util.Scanner;

public class factorial_for {

	public static int factorial(int num)
	{
		int sum = 1;
		
		for(int i=num;i>0;i--)
		{
			
			sum *= i;
		}
		
		return sum;
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Your input?");
		int intf = input.nextInt();
		
		System.out.println(intf+"! = "+factorial(intf));
	}

}
