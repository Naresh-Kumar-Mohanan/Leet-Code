
import java.util.Arrays;

class Q14 {
    public static void main(String[] args) {
        String [] strs = {"flower", "flow", "flight"};
        Q14 q = new Q14();
        System.out.println(q.longestCommonPrefix(strs));
    }

    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String strs1 = strs[0];
        String strs2 = strs[strs.length - 1];
        int i = 0;
        while (i < strs1.length()) {
            if (strs1.charAt(i) == strs2.charAt(i)) {
                i++;
            } else
                break;
        }
        return i == 0 ? "" : strs1.substring(0,i);
    }
}
