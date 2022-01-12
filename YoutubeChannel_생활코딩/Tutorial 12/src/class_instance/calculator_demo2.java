package class_instance;

class Calculator2
{
	static double PI = 3.14;
	static int base = 0;
	int left, right;
	
	public void setOprands(int left, int right)
	{
		this.left = left;
		this.right = right;
	}
	
	public void sum()
	{
		System.out.println(this.left+this.right+base);
	}
	
	public void avg()
	{
		System.out.println((this.left+this.right+base)/2);
	}
}


public class calculator_demo2 {

	public static void main(String[] args) {
		
		System.out.println("Before base (=0) is updated");
		Calculator2 c1 = new Calculator2();
		c1.setOprands(10, 20);
		c1.sum();
		
		Calculator2 c2 = new Calculator2();
		c2.setOprands(20, 40);
		c2.sum();
		
		
		//base값 업데이트 -> 값의 변경사항을 모든 인스턴스가  공유해야하는 경우 
		Calculator2.base = 10;
		
		System.out.println("\nAfter the base value is updated to 10");
		
		c1.sum();
		
		c2.sum();

	}

}
