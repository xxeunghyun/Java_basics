import java.util.Scanner;

public class factorial_ifelse {

	public static int factorial(int num)
	{
	
		if (num == 1)
		{
			return 1;
		}
		
		else
			return num*factorial(num-1);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Your input?");
		int intf = input.nextInt();
		
		System.out.println(intf+"! = "+factorial(intf));

	}

}
