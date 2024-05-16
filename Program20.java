package Training;
class Addition{
	public static int add(int a, int b) {
		return a + b;
	}
}
public class Program20 {

	public static void main(String[] args) {
		Addition addition = new Addition();
		int sum = Addition.add(4,5);
		System.out.println("sum is : "+sum);
	}

}
