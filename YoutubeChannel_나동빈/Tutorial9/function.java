
public class function {

	public static int function(int a, int b, int c)
	{
		int min;
		
		if(a>b)
		{
			if(b>c)
			{
				min = c;
			}
			
			else min = b;
		}
		
		else
		{
			if(a>c)
			{
				min = c;
			}
			
			else
				min = a;
		}
		
		for(int i=min; i>0; i--)//최대니까 큰 수부터 1까지 줄이
		{
			if((a%i) == 0 && (b%i) == 0 && (c%i) == 0)
			{
				return i;
				
			}
		}
		return 0;
		
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("400, 300, 750의 최대공약수는? "+function(400,300,750));
	}

}
