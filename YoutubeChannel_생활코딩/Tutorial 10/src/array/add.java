package array;

public class add {

	public static void main(String[] args) {
		String[] classgroup = new String[4]; //c#처럼ㅁ 정의하고 그 엘르먼트갯수는 뒤에서 채워주기
		
		classgroup[0] = "최진혁";
		
		System.out.println("How many students in a class?   "+classgroup.length);
		System.out.println(classgroup[0]);
		System.out.println(classgroup[3]);
		
		classgroup[3] = "한이람";
		System.out.println("How many students in a class?   "+classgroup.length);
		System.out.println(classgroup[0]);
		System.out.println(classgroup[3]);
		
		//System.out.println(classgroup[5]);  >> exception occurs
		

	}

}
