import java.util.Scanner;

public class R192111424 {
    int value(char r) {
        switch (r) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return -1;
        }
    }

    int romanToInteger(String s) {
        int total = 0;
        for (int i = 0; i < s.length(); i++) {
            int s1 = value(s.charAt(i));
            if (i + 1 < s.length()) {
                int s2 = value(s.charAt(i + 1));
                if (s1 >= s2) {
                    total += s1;
                } else {
                    total += s2 - s1;
                    i++;
                }
            } else {
                total += s1;
            }
        }
        return total;
    }

    public static void main(String[] args) {
        R192111424 ob = new R192111424();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a Roman numeral: ");
        String romanStr = scanner.nextLine();

        int result = ob.romanToInteger(romanStr);
        System.out.println("The corresponding Integer value is: " + result);

        scanner.close();
    }
}
