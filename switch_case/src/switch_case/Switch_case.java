
package switch_case;
import java.util.Scanner;

public class Switch_case {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a choice:\n1.) Hello\n2.) Hi");
        int c = sc.nextInt();
        switch (c) {
            case 1:
                System.out.println("Hello");
                break;
            case 2:
                System.out.println("Hi");
                break;
            default:
                System.out.println("Not in the list.");
        }
    }
    
}
