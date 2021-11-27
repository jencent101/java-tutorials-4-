
package swap_two_no;
import java.util.Scanner;

public class Swap_two_no {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, temp;
        System.out.println("Enter a no: ");
        a = sc.nextInt();
        System.out.println("Enter another no: ");
        b = sc.nextInt();
        System.out.print("Before swap: a= " + a + " ,b= " + b + "\n");
        temp = a;
        a = b;
        b = temp;
        System.out.println("After swap: a= " + a + " ,b= " + b + "\n");
    }
    
}
