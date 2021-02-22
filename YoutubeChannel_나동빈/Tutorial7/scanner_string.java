import java.util.Scanner;

public class scanner_string {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Hello, What is your name?");
		String name = sc.nextLine();
		
		
		System.out.println("Nice to meet you "+name+"!");
		
		/*nextLine()과 next()메소드의 차이는 nextLine()메소드는 Enter를 
		 * 치기 전까지 쓴 문자열을 모두 리턴한다는 것이고
		 * 
		 *  next() 메소드는 스페이스 즉 공백 전까지 입력받은 문자열을 리턴한다는 것이다
		 *

		출처: https://deftkang.tistory.com/55 [deftkang의 IT 블로그]*/
		
		/*
		 * next() 썼을 때: 
		 * Hello, What is your name?
			Hong Gil Dong
			Nice to meet you Hong!
			
			nextLine():
			Hello, What is your name?
			Hong Gil Dong
			Nice to meet you Hong Gil Dong!
		 */

	}

}
