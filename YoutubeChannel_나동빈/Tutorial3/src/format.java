
public class format {

	public static void main(String[] args) {
		
		int a = 200;
		
		System.out.println("10진수: "+a);
		System.out.format("8진수: %o\n", a);  // 
		System.out.format("16진수: %x\n", a);
		
		/*System.out.println("%o", a);
		>> The method println(int) in the type 
		PrintStream is not applicable for the arguments (String, int)*/

	}

}
