package class_instance;

class Calculator 
{
	//변수 PI의 앞에 static이 붙었다. static을 맴버(변수,메소드) 앞에 붙이면 클래스의 맴버가 된다
	static double PI = 3.14;
	int left, right;
	
	
	public void setOprands(int left, int right)
	{
		this.left = left;
		this.right = right;
	}
	
	
	public void sum()
	{
		System.out.println(this.left+this.right);
	}
	
	public void avg()
	{
		System.out.println((this.left+this.right)/2);
	}
}


public class calculator_demo1 {

	public static void main(String[] args) {
		
		//// 인스턴스를 통해서 PI에 접근
		Calculator c1 = new Calculator();
		System.out.println("Calculator C1에 PI값 넣으면 : " +c1.PI);
		
		
		Calculator c2 = new Calculator();
		System.out.println("Calculator C2에 PI값 넣으면 : " +c2.PI);
		
		
		// 클래스를 통해서 PI에 접근
		System.out.println("그냥 Calculator method에 PI값 넣으면 : "+ Calculator.PI);
	}

}
