
public class while_loop {

	public static void main(String[] args) {
		int a = 1, sum = 0;
		
		while(a <= 1000)
		{
			/*sum += a;
			a++;*/
			
			sum += a++;	//한번에 증가 ㄱㄴ    
			
		}

		System.out.println("Sum from 1 to 1000 is " + sum);
	}

}
