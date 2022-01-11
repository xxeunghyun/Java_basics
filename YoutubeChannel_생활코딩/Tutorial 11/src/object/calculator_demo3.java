package object;

public class calculator_demo3 {
	
	public static void sum (int left, int right)
	{
		System.out.println(left+right);
	}
	
	public static void avg (int left, int right)
	{
		System.out.println((left+right)/2);
	}
	
	public static void main(String args[])
	{
		int left, right;
		
		//ex1
		left = 10;
		right = 20;
		
		sum(left,right);
		avg(left,right);
		
		
		//ex2
		left = 20;
		right = 40;		
		
		sum(left,right);
		avg(left,right);
		
	}

}
