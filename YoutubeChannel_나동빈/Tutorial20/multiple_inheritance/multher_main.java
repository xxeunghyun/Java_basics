
public class multher_main implements Dog, Cat{

	public static void main(String[] args) {
		
		multher_main main = new multher_main();
		main.one();
		main.crying();
	
		System.out.println();
		main.two();
		main.crying();
		main.crying();
		
		

	}

	@Override
	public
	void crying() {
		System.out.println("멍!");
		
	}

	@Override
	public void one() {
		System.out.println("하나!");
		
	}

	@Override
	public void two() {
		System.out.println("둘!");
		
	}

}


// cannot get inherit two classes when use 'abstract', extends''