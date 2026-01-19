import java.util.Scanner;

public class Q520 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter a Word : ");
        String word = sc.next();
        Q520 res = new Q520();
        System.out.println(res.detectCapitalUse(word));
    }

    public boolean detectCapitalUse(String word) {
        String uc = word.toUpperCase();
        String lc = word.toLowerCase();

        if (word.equals(lc) || word.equals(uc)) {
            return true;
        }
        return false;
    }
}
