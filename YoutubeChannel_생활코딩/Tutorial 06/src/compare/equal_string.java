package compare;

public class equal_string {

	public static void main(String[] args) {
		// unlike the integer or any other number comparison, we don't use "=="
		// but use function 비교.equals(비교대상 )

		
		String a = "Hello World!";
		String b = new String("Hello World!"); 
		
		System.out.println(a==b);
		System.out.println(a.equals(b)); //string만 비교 
	}

}
