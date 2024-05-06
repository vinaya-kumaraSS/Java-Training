package Training;

public class Program13 {
	public static void main(String[] args) {
        int n = 10;
        
        int a = 0;
        int b = 1;
        int c;

        if (n == 0)
            System.out.println(a);
        else if (n == 1)
            System.out.println(b);
        else {
            for (int i = 2; i <= n; i++) {
                c = a + b;
                a = b;
                b = c;
            }
            System.out.println("fibonacci number :"+b);
        }
    }
}
