import java.util.Scanner;

public class int_function_scanner {


	public static int isfactor(int num, int k)
	{
		for(int i=1;i<=num;i++)
		{
			if(num%i == 0)
			{
				k--;
				if(k ==0)
				{
					return i;
				}
			}
		}

		return -1;
	}


	public static void main(String[] args) {

		Scanner scnum = new Scanner(System.in);
		
		
		System.out.println("Enter your num");
		int num = scnum.nextInt();
		
		Scanner sck = new Scanner(System.in);
		System.out.println("Enter your k");
		int k = sck.nextInt();
		
		int result = isfactor(num,k);
		if(result == -1)
		{
			System.out.println(num+"의 "+k+"번째 약수는 없습니다.");
		}

		else
		{
			System.out.println(num+"의 "+k+"번째 약수는 "+result+"입니다.");
		}

	}

}
