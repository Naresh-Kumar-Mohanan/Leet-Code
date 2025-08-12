class Q263 {
    public static void main(String[] args) {
        int n = 14;
        if (isUgly(n)) {
            System.out.println(n + " is an Ugly Number.");
        } else {
            System.out.println(n + " is NOT an Ugly Number.");
        }
    }
    public static boolean isUgly(int n) {
        if (n <= 0) {
            return false;
        }
        while (n % 2 == 0) {
            n /= 2;
        }
        while (n % 3 == 0) {
            n /= 3;
        }
        while (n % 5 == 0) {
            n /= 5;
        }
        return n == 1;
    }
}