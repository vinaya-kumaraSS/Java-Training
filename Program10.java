package Training;

public class Program10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 123, rev = 0;
		do {
			int rem = a % 10;
			rev = rev * 10 + rem;
			a = a/10;
		}
		while(a > 0);
		System.out.println(rev);
	}

}
