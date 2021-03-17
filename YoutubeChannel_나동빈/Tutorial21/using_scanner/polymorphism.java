package using_scanner;


import java.util.Scanner;

public class polymorphism {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		System.out.println("Press 1 for Apple, Press 2 for Peach");
		int input = sc.nextInt();
		
		
		
		Fruit fruit;
		
		if(input == 1)
		{
			
			fruit = new Apple();
			fruit.show();
		}
		
		else if(input == 2)
		{
		
			fruit = new Peach();
			fruit.show();
		}
		
		else
			System.out.println("Only 1 and 2 are acceptable");
		
		
		
	}

}
