
package simple_interest;
import java.util.Scanner;

public class Simple_interest {

    public static void main(String[] args) {
        float p, r, t, i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a principal: ");
        p = sc.nextFloat();
        System.out.println("Enter a rate: ");
        r = sc.nextFloat();
        System.out.println("Enter a time: ");
        t = sc.nextFloat();
        i = (p * r * t) / 100;
        System.out.println("The interest is: " + i);
        System.out.println("The amount is: " + (i + p));
    }
    
}
