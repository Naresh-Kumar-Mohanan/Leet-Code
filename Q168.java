class Q168 {
    public static void main(String[] args) {
        int columnNumber = 701;
        Q168 res = new Q168();
        System.out.println(res.convertToTitle(columnNumber));
    }

    public String convertToTitle(int columnNumber) {
        StringBuilder columnTitle = new StringBuilder();
        while (columnNumber > 0) {
            int remainder = columnNumber % 26;

            if (remainder == 0) {
                remainder = 26;
                columnNumber--;
            }
            char currentChar = (char) ('A' + remainder - 1);
            columnTitle.insert(0, currentChar);
            columnNumber /= 26;
        }
        return columnTitle.toString();
    }
}