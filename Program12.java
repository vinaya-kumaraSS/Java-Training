package Training;
public class Program12 {
    public static void main(String[] args) {
        double sum = 0; // Initialize the sum to 0
                for (int i = 1; i <= 4; i++) {
            int factorial = 1;
            for (int j = 1; j <= i; j++) {
                factorial *= j;
            }
            
            sum += ((double) i) / factorial;
        }
        
        System.out.println(sum);
    }
}

