package loop;

public class loop_nestedfor {

	public static void main(String[] args) {
		
		int j;
		
		for(int i=0;i<10;i++)
		{
			for(j=0;j<10;j++)
			{
				System.out.println(i+""+j);
				if(j%10 == 9)
				{
					System.out.println(" ");
				}
			}
			
			
		}

	}

}
