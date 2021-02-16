
public class ternary_operator {

	public static void main(String[] args) {
		
		int x = 50;
		int y = 75;
		
		//max(x,y);
		System.out.println(max(x,y));
	}
	
	static int max(int a, int b)
	{
		int result = (a>b)? a: b;
		return result;
	}

}
