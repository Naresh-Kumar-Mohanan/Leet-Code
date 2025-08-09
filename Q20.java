
class Q20 {
    public static void main(String[] args) {
        String s = "([])";
        Q20 q = new Q20();
        System.out.println(q.isValid(s));
    }

    public boolean isValid(String s) {
        while (true) {
            if (s.contains("()")) {
                s = s.replace("()", "");
            } else if (s.contains("{}")) {
                s = s.replace("{}", "");
            } else if (s.contains("[]")) {
                s = s.replace("[]", "");
            } else {
                return s.isEmpty();
            }
        }
    }
}