import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class file {

	public static void main(String[] args) {
		File file = new File("input.txt");	//file이름으로 받아오기


		try {
			Scanner sc = new Scanner(file);

			while(sc.hasNextInt())
			{
				System.out.println(sc.nextInt() * 100);
			}

		} catch (FileNotFoundException e) {
			System.out.println("Error occurred while reading the file");
			//e.printStackTrace();
		}

	}

}

/*
input.txt에
70
200 300 100 가ㅜ 적혀있으면
output:
7000
20000
30000
10000
*/
