
public class twoD_array {

	public static void main(String[] args) {
		int n = 5;
		int [][] arr = new int[n][n];
		
		for(int i=0;i<n;i++)
		{
			for(int j=0; j<n;j++)
			{
				arr[i][j] = (int)(Math.random() * 10); //0~9
				System.out.print(arr[i][j] + "  ");
			}
			
			System.out.println();
		}
		
		

	}

}
