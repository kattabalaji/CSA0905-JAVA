import java.util.*;

class Stringtest {
    public static void main(String[] args) {
        String str1 = "I Love Java";
        String str2 = "java";
        String str3 = "JAVA";
        String searchString = "Love";
        String replacementString = "Live";
        int x = str1.indexOf('L');
        String modifiedString = str1.replace(searchString, replacementString);
        System.out.println("Lowercase String 1: " + str1.toLowerCase());
        System.out.println("Uppercase String 2: " + str2.toUpperCase());
        System.out.println("Lowercase String 3: " + str3.toLowerCase());
        System.out.println("Modified String: " + modifiedString);
        System.out.println("The position of 'L' in str1 is: " + x);

        int Love = searchString.indexOf("Love");

        if (Love != -1) {
            String love = searchString.substring(Love, Love + "Love".length());
            System.out.println("The word 'Love' in searchString: " + love);
        } else {
            System.out.println("The word 'Love' was not found in searchString.");
        }
	
	boolean areEqualIgnoreCase = str1.equalsIgnoreCase(str2);

        if (areEqualIgnoreCase) {
            System.out.println("str1 and str2 are equal (case-insensitive comparison).");
        } else {
            System.out.println("str1 and str2 are not equal (case-insensitive comparison).");
        }
	
    }
}
