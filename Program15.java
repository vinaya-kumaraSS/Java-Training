package Training;

public class Program15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3,5,7,1,8,99,44,-10};
		for(int i = 0;i < arr.length;i++)
		{
			for(int j = 0;j < arr.length - i - 1;j++)
			{
				if(arr[j] > arr[j+1])
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		for(int i = 0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}
