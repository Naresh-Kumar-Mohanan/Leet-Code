
import java.util.Arrays;
import java.util.Scanner;

public class Q242 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter Name 1 : ");
        String s = sc.next();
        System.out.print("Enter Name 2 : ");
        String t = sc.next();
        Q242 res = new Q242();
        System.out.println(res.isAnagram(s, t));
    }

    public boolean isAnagram(String s, String t) {
        char[] c1 = s.toCharArray();
        char[] c2 = t.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);

        String s1 = new String(c1);
        String s2 = new String(c2);

        if (s1.equals(s2)) {
            return true;
        } else
            return false;
    }
}
