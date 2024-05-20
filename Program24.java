package Training;
class Example{
	void PrintNum(int a)
	{
		System.out.println("a :"+a);
	}
	void PrintNum(float a)
	{
		System.out.println("a :"+a);
	}
	void PrintNum(double a)
	{
		System.out.println("a :"+a);
	}
}
public class Program24 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example E = new Example();
		E.PrintNum(10);
		E.PrintNum(1.2);
		E.PrintNum(3.142f);
	}
}
