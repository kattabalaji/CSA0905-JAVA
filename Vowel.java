import java.util.Scanner;

class Vowel {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = s.nextLine();

        String result = str.replaceAll("[aeiouAEIOU]", ""); // Remove vowels from the string

        System.out.println("String after removing vowels: " + result);
    }
}
