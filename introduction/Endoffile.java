package introduction;
import java.util.*;

public class Endoffile {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = 1;
        while(scan.hasNextLine()) {
            System.out.println(i + " " + scan.nextLine());
            i++;
        }
        scan.close();
    }
}