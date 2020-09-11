package strings;
import java.util.*;

public class StringTokens {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        scan.close();

        int i;
        for (i = 0; i < s.length(); i++) {
            if (Character.isLetter(s.charAt(i))) {
                break;
            }
        }

        s = s.substring(i);
        
        /* Check special cases */
        if (s.length() == 0) {
            System.out.println(0);
            return;
        }
        
        /* Split on all non-alphabetic characters */
        String[] words = s.split("[^a-zA-Z]+");
        
        /* Print output */
        System.out.println(words.length);
        for (String word : words) {
            System.out.println(word);
        }
    }
}