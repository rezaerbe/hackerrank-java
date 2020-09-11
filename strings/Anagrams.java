package strings;
// import java.util.HashMap;
import java.util.Scanner;

public class Anagrams {

    static boolean isAnagram(String a, String b) {
        
        // if (a == null || b == null || a.length() != b.length()) {
        //     return false;
        // }

        // a = a.toLowerCase();
        // b = b.toLowerCase();

        // HashMap<Character, Integer> map  = new HashMap<>();

        // for (int i = 0; i < a.length(); i++) {
        //     char ch = a.charAt(i);
        //     map.merge(ch, 1, Integer::sum);
        // }

        // for (int i = 0; i < b.length(); i++) {
        //     char ch = b.charAt(i);
        //     if (map.containsKey(ch) && map.get(ch) > 0 ) {
        //         map.put(ch, map.get(ch) - 1);
        //     }
        //     else {
        //         return false;
        //     }
        // }

        // return true;

        if (a.length() != b.length()) {
            return false;
        } 
        else {
			for (int i = 0; i < a.length(); i++) {
				char ch = a.toLowerCase().charAt(i);
				b = b.toLowerCase();
				if (b.indexOf(ch) != -1) {
					b = b.replaceFirst(ch + "", "");
                }
                else {
					return false;
				}
			}
			return b.length() == 0;
		}
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}