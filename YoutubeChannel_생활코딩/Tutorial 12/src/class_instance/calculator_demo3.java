package class_instance;

class Calculator3
{
	public static void sum(int left, int right)
	{
		System.out.println(left+right);
		
	}
	
	public static void avg(int left, int right)
	{
		System.out.println((left+right)/2);
	}
}


public class calculator_demo3 {

	public static void main(String[] args) {
		//합계나 평균을 구할 때마다 좌항과 우항의 값을 주는 방식으로 계산을 할 수도 있다
		Calculator3.sum(10,20);
		Calculator3.avg(10, 20);
		
		Calculator3.sum(20, 40);
		Calculator3.avg(20, 40);

	}

}
