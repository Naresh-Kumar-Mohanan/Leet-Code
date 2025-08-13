
class Q204 {
    public static void main(String[] args) {
        int n = 10;
        Q204 res = new Q204();
        System.out.println(res.countPrimes(n));
    }

    int countPrimes(int n) {
        if (n <= 2)
            return 0;
        boolean[] comp = new boolean[n];
        int limit = (int) Math.sqrt(n);
        for (int i = 2; i <= limit; i++) {
            if (comp[i] == false) {
                for (int j = i * i; j < n; j += i) {
                    comp[j] = true;
                }
            }
        }
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (comp[i] == false) {
                count++;
            }
        }
        return count;
    }
}