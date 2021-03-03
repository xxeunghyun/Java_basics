//영상과 같지만 if 이용해서 배열에 저장되는 수가 양수가 아닌 경우 다시 값을 받게 함
//당연히 차지하는 수도 다시 원래대로 -1

import java.util.Scanner;

public class array {
	
	public static int max(int a, int b)
	{
		
		return (a>b)?a:b;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("생성될 배열의 크기를 입력세요: ");
		
		int num = sc.nextInt();
		int [] arr = new int[num];	//c#처럼 선
		
		for(int i=0; i<num; i++)
		{
			System.out.print("배열에 입력할 양의 정수를 하나씩 입력하세요: ");
			
			arr[i] = sc.nextInt();	//스캐너 하나만 만들어놓으면 계속해서 쓰일 수 있
			
			if(arr[i] < 0 || arr[i] == 0)
			{
				System.out.println("양의 정수만 가능합니다.");
				i--;
			}
			
			
		}
		
		int result = 0;
		
		for(int i=0; i<num; i++)
		{
			result = max(result, arr[i]);
		}
		
		System.out.print("The maximum number in the array is "+result);
	}

}
