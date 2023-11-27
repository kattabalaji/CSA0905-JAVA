public class RomanToInteger1 {
    int value(char r) {
        if (r == 'I') return 1;
        if (r == 'V') return 5;
        if (r == 'X') return 10;
        if (r == 'L') return 50;
        if (r == 'C') return 100;
        if (r == 'D') return 500;
        if (r == 'M') return 1000;
        return -1;
    }

    int convertRomanToInt(String s) {
        int total = 0;
        for (int i = 0; i < s.length(); i++) {
            int s1 = value(s.charAt(i));
            if (i + 1 < s.length()) {
                int s2 = value(s.charAt(i + 1));
                if (s1 >= s2) {
                    total = total + s1;
                } else {
                    total = total - s1;
                }
            } else {
                total = total + s1;
            }
        }
        return total;
    }

    String convertIntToRoman(int num) {
        StringBuilder roman = new StringBuilder();
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        for (int i = 0; i < values.length; i++) {
            while (num >= values[i]) {
                roman.append(symbols[i]);
                num -= values[i];
            }
        }

        return roman.toString();
    }

    public static void main(String[] args) {
        RomanToInteger1 ob = new RomanToInteger1();
	Scanner s=new scanner(System.in);
	System.out.println("enter n:");
	int n=s.nextInt();
        for (int i = 1; i <= n; i++) {
            String romanNumeral = ob.convertIntToRoman(i);
            int integerValue = ob.convertRomanToInt(romanNumeral);
            System.out.println("Integer: " + i + ", Roman Numeral: " + romanNumeral + ", Converted Back: " + integerValue);
        }
    }
}
