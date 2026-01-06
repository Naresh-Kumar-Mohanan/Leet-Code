import java.util.Arrays;

public class Q344 {
    public static void main(String[] args) {
        char[] s = { 'h', 'e', 'l', 'l', 'o' };
        Q344 res = new Q344();
        res.reverseString(s);
        System.out.println(Arrays.toString(s));
    }

    public void reverseString(char[] s) {
        int i = 0;
        int j = s.length - 1;
        while (i < j) {
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;

            i++;
            j--;
        }
    }
}
