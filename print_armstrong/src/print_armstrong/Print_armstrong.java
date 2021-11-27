
package print_armstrong;
import java.io.*;

public class Print_armstrong {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n, m, ld, sum = 0, lim;
        System.out.println("Enter a limit: ");
        // lim = Integer.parseInt(br.readLine());
        for (int i = 1; i > 0; i++) {
            n = i;
            m = n;
            do {
                ld = m % 10;
                sum += ld * ld * ld;
                m /= 10;
            } while (m > 0);
            if (sum == n) {
                System.out.println(sum);
            }
            sum = 0;
            } 
        } 
    }
