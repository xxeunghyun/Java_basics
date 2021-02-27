
public class char_function {
	
	public static char lastalph(String input)
	{
		return input.charAt(input.length()-1);	//charat >> 특수문자도 다 ㄱ
	}

	public static void main(String[] args) {
		
		System.out.println("Hello World의 마지막 알파벳 "+lastalph("Hello World")+"입니다.");

	}

}
