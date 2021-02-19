
public class for_loop_circle {
	
	final static int N = 16;

	public static void main(String[] args) {
		// x^2 + y^2 = r^2
		
		for(int i=-N; i<=N; i++)
		{
			for(int j= -N; j<= N; j++)
			{
				if( i*i + j*j <= N*N)
				{
					System.out.println("*");
				}
				
				else
					System.out.println(" ");
					
			}
			
			System.out.println();
		}

	}

}
