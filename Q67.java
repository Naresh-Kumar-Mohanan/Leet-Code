
class Q67 {
    public static void main(String[] args) {
        String a = "1010";
        String b = "1011";
        Q67 q = new Q67();
        System.out.println(q.addBinary(a, b));
    }

    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int remain = 0;
        while (i >= 0 || j >= 0 || remain == 1) {
            int sum = remain;
            if (i >= 0) {
                sum = sum + a.charAt(i) - '0';
                i--;
            }
            if (j >= 0) {
                sum = sum + b.charAt(j) - '0';
                j--;
            }
            sb.append(sum % 2);
            remain = sum / 2;
        }
        return sb.reverse().toString();
    }
}