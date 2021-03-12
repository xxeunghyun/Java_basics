
public class parent_main extends Parent {

	public void show(){
		System.out.println("HELLO");
		
	}
	
	
	
	public static void main(String[] args) {
		

		parent_main main = new parent_main();
		main.show();
	}

}


/*
 * LinkageError occurred while loading main class parent_main
	java.lang.VerifyError: class parent_main overrides final method Parent.show()V
	
	under Parent class, the function in 'fianl' type
	it cannot override here
*/
