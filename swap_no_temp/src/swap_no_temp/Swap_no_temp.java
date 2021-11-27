
package swap_no_temp;
import java.util.Scanner;

public class Swap_no_temp {

    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter a no: ");
        a = sc.nextInt();
        System.out.printf("Enter another no: ");
        b = sc.nextInt();
        System.out.printf("Before swap:\na = %d\nb = %d\n", a, b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.printf("After swap:\na = %d\nb = %d\n", a, b);
    }
    
}
