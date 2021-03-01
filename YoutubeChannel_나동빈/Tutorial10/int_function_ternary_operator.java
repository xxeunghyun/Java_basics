
public class int_function_ternary_operator {

	public static int max(int a, int b)
	{
		return (a>b) ? a : b;
		
	}
	
	
	public static int max3(int a,int b, int c)
	{
		int result = max(a,b);
		result = max(result, c);
		return result;
	}
	
	public static void main(String[] args) {
		
		System.out.println("The maximum number among 345, 567, 789 is "+max3(345,567,789));

	}

}
