
public class comparison {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 5;
		
		System.out.println("is a and b equal? "+ (a==b));	//false
		System.out.println("is a and b not equal? "+ (a!=b));	//true
		System.out.println("is a bigger than b? "+ (a>=b));	//true
		
		System.out.println("is a and bigger or equal to b? "+ (a>=b));	//true
		System.out.println("is a and bigger or equal to b? "+ ((a==b) && (a>b)));	//false >> a is bigger than b but not equal so it is false

	}

}
