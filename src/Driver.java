
import java.util.Scanner;
public class Driver {
    public static void main(String[] args) {
        String a;
        int b, c = 0, z = 0;
        System.out.print("sentence : ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextLine();
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == 'a' || 
                a.charAt(i) == 'e' || 
                a.charAt(i) == 'i' || 
                a.charAt(i) == 'o' || 
                a.charAt(i) == 'u'    ) {
                c++;
            } else if (a.charAt(i) == ' ') {
                z++;
            }
        }
        b = a.length() - z - c;
        System.out.println(c);
    }
}