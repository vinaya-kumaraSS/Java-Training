package Training;
import java.util.Scanner;
public class Program18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String name1 = sc.next();
		String name2 = sc.nextLine();
		sc.nextLine();
		char character = sc.next().charAt(0);
		int age = sc.nextInt();
		float salary = sc.nextFloat();
		long mob = sc.nextLong();
		double sgpa = sc.nextDouble();
		boolean bol = true;
		
		System.out.println(name1);
		System.out.println(name2);
		System.out.println(character);
		System.out.println(age);
		System.out.println(salary);
		System.out.println(mob);
		System.out.println(sgpa);
		System.out.println(bol);
	}

}
