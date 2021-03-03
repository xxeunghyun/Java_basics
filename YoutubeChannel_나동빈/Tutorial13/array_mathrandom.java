
public class array_mathrandom {

	public static void main(String[] args) {
		
		int [] arr = new int[100];
		
		System.out.println("10 random numbers between 0 and 100");
		for(int i=0; i<10; i++)
		{
			arr[i] = (int)(Math.random() * 100 + 1);
							// 0~100사이의랜덤 
			System.out.print(arr[i]+"  ");
		}
		
		System.out.println("\n");
		
		int sum = 0;
		for(int i=0; i<10; i++)
		{
			sum += arr[i];
		}
		
		int avg = sum/10;
		System.out.println("Average value of array arr is "+ avg);
		
		

	}

}
