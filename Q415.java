
public class Q415 {
    public static void main(String[] args) {
        String num1 = "11", num2 = "11";
        Q415 res = new Q415();
        System.out.println(res.addStrings(num1, num2));
    }

    public String addStrings(String num1, String num2) {
        StringBuilder sb = new StringBuilder();
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int total = 0;

        while (i >= 0 || j >= 0 || total > 0) {
            int d1 = 0;
            if (i >= 0) {
                d1 += num1.charAt(i) - '0';
                i--;
            }

            int d2 = 0;
            if (j >= 0) {
                d2 += num2.charAt(j) - '0';
                j--;
            }

            int sum = d1 + d2 + total;
            total = sum / 10;
            sb.append(sum % 10);
        }
        return sb.reverse().toString();
    }
}
