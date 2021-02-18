
public class elseif {

	public static void main(String[] args) {
		// just like C, else if
		
		int score = 95;
		
		if(score >= 90)
		{
			System.out.println("A+");
		}
		
		else if(score >= 80)
		{
			System.out.println("A");
		}
		
		else if(score >= 70)
		{
			System.out.println("B");
			
		}

		else if(score >= 60)
		{
			System.out.println("C");
			
		}
		
		else
			System.out.println("F");
	}

}
