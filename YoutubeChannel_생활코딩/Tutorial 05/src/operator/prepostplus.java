package operator;

public class prepostplus {

	public static void main(String[] args) {
		int i = 3;
		
		i++; // 실행할 명령? 없음. 바로 1 추가 = 4 
		System.out.println(i); // 4
		
		++i; //i+1 먼저 하고 다음 명령 확인. 우선 5 만들고 다음 명령은 프린트  
		System.out.println(i); // 5 만들어진 상태에서 출력  
		
		System.out.println(++i); // +1 하고 나서 명령 확인. 6 다음 노 명령 = 6
		System.out.println(i++); // 우선 기본아이 출력 하고 ++. 6 출력=명령 후 프류ㅡㄹ 
		System.out.println(i); //위에서 6 출력하고 +1 하라 해서 7 됐고 그 뒤에 노 변화 = 7
		
		

	}

}
