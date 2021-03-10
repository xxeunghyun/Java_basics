
public class main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String name, int age, int height, int weight, String sid, int grade, double gPA
		
		student[] students = new student[10];
		
		for(int i=0;i<10;i++)
		{
			students[i] = new student("John",20,175,70,Integer.toString(i+20200),1,4.5);
			students[i].show();
		}
		
		

	}

}

/*
 * Here I used Integer.toString() since the type of sid is string 
 * and i tried to express the sid not from 0, but from 20200.
 * just like ToString() in c#, java allows to use toString().
 * 
 * */

