package Training;

public class Program16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		int[][] arr1 = {{1,2,3},{4,5,6},{7,8,9}};
		int[][] arr2 = {{1,2,3},{4,5,6},{7,8,9}};
		int[][] sum = new int[3][3];
		for(int i = 0 ;i< arr1.length;i++)
		{
			for(int j = 0 ;j< arr1[i].length;j++)
			{
				sum[i][j] = arr1[i][j] + arr2[i][j];
			}
		}
		
		for(int i = 0 ;i< arr1.length;i++)
		{
			for(int j = 0 ;j< arr1[i].length;j++)
			{
				System.out.print(sum[i][j]+" ");
			}
			System.out.println();
		}
	}

}
