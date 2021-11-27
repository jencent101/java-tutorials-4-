
package print_string;
import java.io.*;

public class Print_string {

    public static void main(String[] args) throws IOException {
        String str;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a string: ");
        str = br.readLine();
        System.out.println("Entered string is: " + str);
    }
    
}
