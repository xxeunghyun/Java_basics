
public class nested_for_loop {
	
	final static int N = 10;

	public static void main(String[] args) {
	
		for(int i=N; i>0; i--)
		{
			for(int j=i;j>0;j--)
			{
				System.out.println("*");
				
			}
			
			System.out.println();
		}
	
	}
}
