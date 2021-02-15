
public class string {

	public static void main(String[] args) {
		
		String name = "John ABCDE";
		System.out.println(name);
		System.out.println(name.substring(0,1));	//from 0, before 1st
		System.out.println(name.substring(3,6));	//from 3rd to 5th
		System.out.println(name.substring(5,8));
		
		// substring(a,b) >> from a th to b-1 th index
		// space is also included

	}

}
