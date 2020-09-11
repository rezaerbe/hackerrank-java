package strings;
import java.util.*;

public class StringReverse {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        sc.close();

        String reversed = new StringBuilder(A).reverse().toString();
        System.out.println(A.equals(reversed) ? "Yes" : "No");
        
    }
}