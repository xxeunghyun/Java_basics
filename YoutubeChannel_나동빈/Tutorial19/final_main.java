
public class final_main {

	public static void main(String[] args) {
		
		final int num = 10;
		num = 5;
		
		System.out.println(num);
		
		/*
		 * Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
			The final local variable num cannot be assigned. It must be blank and not using a compound assignment
			at final_main.main(final_main.java:7) 
			
			Once the final type of variable is defined, we cannot change its value afterwards.
			
		 */
	}

}
