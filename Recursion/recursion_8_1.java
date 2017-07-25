package recursion;
import java.util.*;

/**
 *
 * @author rpatel
 */

public class recursion_8_1 {

    public static int fibonacci(int n) {
        if(n == 0)
            return 0;
        else if(n==1)
            return 1;
        else 
            return (fibonacci(n-1) + fibonacci(n-2));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        System.out.println(fibonacci(n));
    }
}