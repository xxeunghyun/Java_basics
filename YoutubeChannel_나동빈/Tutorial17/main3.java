import java.util.Scanner;

//직접 학생 수와 각각의 정보를 입력받기
//String name, int age, int height, int weight, String sid, int grade, double gPA

public class main3 {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many students?");
		
		int num = sc.nextInt();
		
		student[] students = new student[num];
		
		for(int i=0;i<num;i++)
		{
			String name;
			int age;
			int height;
			int weight;
			String sid;
			int grade;
			double gPA;
			
			System.out.println("----------------------");
			System.out.print("Name?\t");
			name = sc.next();
			
			System.out.print("Age?\t");
			age = sc.nextInt();
			
			System.out.print("Height?\t");
			height = sc.nextInt();
			
			System.out.print("Weight?\t");
			weight = sc.nextInt();
			
			System.out.print("SID?\t");
			sid = sc.next();
			
			System.out.print("Grade?\t");
			grade = sc.nextInt();
			
			System.out.print("GPA?\t");
			gPA = sc.nextDouble();
			
			System.out.println("----------------------\n\n");
			
			students[i] =new student(name,  age, height, weight, sid, grade, gPA);	//initialise
			
			
		}
		
		for(int i=0;i<num;i++)
		{
			students[i].show();
		}

	}

}
