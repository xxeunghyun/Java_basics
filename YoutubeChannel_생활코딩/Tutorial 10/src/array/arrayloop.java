package array;

import java.util.Arrays;

public class arrayloop {

	public static void main(String[] args) {
		
		int total = 0; //상담받은 학생 총 수  
		String[] students = {"Chris", "James", "Amy", "Emily", "Julia"};
		
		for(int i=0;i<5;i++)
		{
			for(int j=i+1;j<students.length;j++)
			{
				if(students[i].compareTo(students[j]) > 0 )  // if this condition is true 
				{
					String tmp = students[i];
					students[i] = students[j];
					students[j] = tmp;
				}
			}
		}
		
		System.out.println("Students in ascending alphbetical order:\n"+Arrays.toString(students)+"\n\n");
		
		for(int i=0;i< students.length;i++)
		{
			System.out.println("Now "+students[i] + " is councelling");
			total++;

			System.out.println(total + " Student(s) have got councelling so far.\n\n");
			if(total == students.length)
			{
				System.out.println("Since everyone has councelled, this session is over\n");
				break;
			}
		}
		

	}

}
